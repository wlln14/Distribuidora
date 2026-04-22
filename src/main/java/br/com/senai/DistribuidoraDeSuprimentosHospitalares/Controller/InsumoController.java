package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Controller;


import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Insumo;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Service.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insumos")
@CrossOrigin(origins = "http://localhost:3000")
public class InsumoController {

    @Autowired
    private InsumoService insumoService;

    @PostMapping
    public ResponseEntity<Insumo> cadastrar(@RequestBody Insumo insumo) {
        return ResponseEntity.ok(insumoService.salvar(insumo));
    }

    @GetMapping
    public ResponseEntity<List<Insumo>> listar() {
        return ResponseEntity.ok(insumoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Insumo> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(insumoService.buscarPorId(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Insumo>> buscarPorNome(@RequestParam String nome) {
        return ResponseEntity.ok(insumoService.buscarPorNome(nome));
    }

    @GetMapping("/estoque-baixo")
    public ResponseEntity<List<Insumo>> estoqueBaixo() {
        return ResponseEntity.ok(insumoService.estoqueBaixo());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Insumo> atualizar(@PathVariable Long id, @RequestBody Insumo insumo) {
        return ResponseEntity.ok(insumoService.atualizar(id, insumo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        insumoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

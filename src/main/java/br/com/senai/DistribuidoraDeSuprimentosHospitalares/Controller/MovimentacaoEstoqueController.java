package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Controller;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.MovimentacaoEstoque;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Service.MovimentacaoEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimentacoes")
@CrossOrigin(origins = "http://localhost:3000")
public class MovimentacaoEstoqueController {

    @Autowired
    private MovimentacaoEstoqueService service;

    @PostMapping
    public ResponseEntity<MovimentacaoEstoque> registrar(@RequestBody MovimentacaoEstoque movimentacao) {
        return ResponseEntity.ok(service.registrar(movimentacao));
    }

    @GetMapping
    public ResponseEntity<List<MovimentacaoEstoque>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/insumo/{id}")
    public ResponseEntity<List<MovimentacaoEstoque>> porInsumo(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorInsumo(id));
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<List<MovimentacaoEstoque>> porUsuario(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorUsuario(id));
    }
}

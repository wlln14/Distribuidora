package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Controller;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.DTO.LoginRequestDTO;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.DTO.UsuarioResponseDTO;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Usuario;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> login(@RequestBody LoginRequestDTO dto) {

        Usuario usuario = usuarioService.login(dto.nome(), dto.senha());

        UsuarioResponseDTO response = new UsuarioResponseDTO(usuario);

        return ResponseEntity.ok(response);
    }
}

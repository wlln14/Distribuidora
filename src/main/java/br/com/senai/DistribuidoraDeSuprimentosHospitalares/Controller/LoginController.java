package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Controller;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Login;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/login")
public class LoginController {

    @PostMapping
    public boolean Login(@RequestBody Login login) {
        return "admin".equals(login.getUsuario()) && "123".equals(login.getSenha());

    }
}

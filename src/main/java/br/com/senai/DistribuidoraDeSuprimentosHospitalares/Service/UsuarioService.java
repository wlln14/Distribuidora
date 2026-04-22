package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Service;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Usuario;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public Usuario login(String nome, String senha) {

        return repository.findByNomeAndSenha(nome, senha)
                .orElseThrow(() -> new RuntimeException("Usuário ou senha inválidos"));
    }
}


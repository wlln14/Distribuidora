package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByNomeAndSenha(String nome, String senha);

}

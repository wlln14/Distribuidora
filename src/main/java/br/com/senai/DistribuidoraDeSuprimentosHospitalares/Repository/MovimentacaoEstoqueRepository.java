package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.MovimentacaoEstoque;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimentacaoEstoqueRepository extends JpaRepository<MovimentacaoEstoque, Long> {

    List<MovimentacaoEstoque> findByInsumoId(Long insumoId);

    List<MovimentacaoEstoque> findByUsuarioId(Long usuarioId);

}
package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Long> {

    List<Insumo> findByNomeContainingIgnoreCase(String nome);

}

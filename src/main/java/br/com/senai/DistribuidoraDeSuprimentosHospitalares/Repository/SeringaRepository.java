package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Seringa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeringaRepository extends JpaRepository<Seringa, Long> {}

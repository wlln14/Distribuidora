package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository;


import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Luva;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Seringa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LuvaRepository extends JpaRepository<Luva, Long> {}


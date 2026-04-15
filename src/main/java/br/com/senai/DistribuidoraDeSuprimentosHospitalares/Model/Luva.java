package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Luva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;

    private String tamanhoLuva;
    private String vencimentoLuva;
    private String materialLuva;
}

package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Login {
    private String usuario;
    private String senha;
}

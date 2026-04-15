package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Gaze {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long ID;

}

package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Controller;


import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Luva;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Seringa;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository.LuvaRepository;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository.SeringaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http//localhost:3000")
public class ListaController {
    @Autowired
    private LuvaRepository luvaRepository;

    @Autowired
    private SeringaRepository seringaRepository;

    @PostMapping("/cadastro/luva")
    public Luva cadastrarLuva(@RequestBody Luva luva){return luvaRepository.save(luva);}

    @PostMapping("/cadastro/seringa")
    public Seringa cadastrarSeringa(@RequestBody Seringa seringa){return seringaRepository.save(seringa);}

    @GetMapping("/lista")
    public List<Luva> listarLuva(){return luvaRepository.findAll();}

    @GetMapping
    public List<Seringa> listarSeringa(){return seringaRepository.findAll();}

}

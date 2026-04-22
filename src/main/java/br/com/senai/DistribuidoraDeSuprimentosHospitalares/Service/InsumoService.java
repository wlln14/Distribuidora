package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Service;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Insumo;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository.InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsumoService {

    @Autowired
    private InsumoRepository repository;

    public Insumo salvar(Insumo insumo) {
        return repository.save(insumo);
    }

    public List<Insumo> listarTodos() {
        return repository.findAll();
    }

    public Insumo buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Insumo não encontrado"));
    }

    public List<Insumo> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Insumo atualizar(Long id, Insumo novo) {
        Insumo insumo = buscarPorId(id);

        insumo.setNome(novo.getNome());
        insumo.setCategoria(novo.getCategoria());
        insumo.setTipo(novo.getTipo());
        insumo.setTamanho(novo.getTamanho());
        insumo.setQuantidadeEstoque(novo.getQuantidadeEstoque());
        insumo.setEstoqueMinimo(novo.getEstoqueMinimo());
        insumo.setValidade(novo.getValidade());

        return repository.save(insumo);
    }

    public List<Insumo> estoqueBaixo() {
        return repository.findAll()
                .stream()
                .filter(i -> i.getQuantidadeEstoque() <= i.getEstoqueMinimo())
                .toList();
    }
}
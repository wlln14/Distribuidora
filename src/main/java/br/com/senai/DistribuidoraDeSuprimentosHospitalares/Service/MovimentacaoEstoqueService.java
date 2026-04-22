package br.com.senai.DistribuidoraDeSuprimentosHospitalares.Service;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Insumo;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.MovimentacaoEstoque;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.TipoMovimentacao;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository.InsumoRepository;
import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Repository.MovimentacaoEstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentacaoEstoqueService {

    @Autowired
    private MovimentacaoEstoqueRepository movimentacaoRepository;

    @Autowired
    private InsumoRepository insumoRepository;

    public MovimentacaoEstoque registrar(MovimentacaoEstoque mov) {

        Insumo insumo = insumoRepository.findById(mov.getInsumo().getId())
                .orElseThrow(() -> new RuntimeException("Insumo não encontrado"));


        if (mov.getTipoMovimentacao() == TipoMovimentacao.SAIDA) {
            insumo.setQuantidadeEstoque(
                    insumo.getQuantidadeEstoque() - mov.getQuantidade()
            );
        } else {
            insumo.setQuantidadeEstoque(
                    insumo.getQuantidadeEstoque() + mov.getQuantidade()
            );
        }

        insumoRepository.save(insumo);

        return movimentacaoRepository.save(mov);
    }

    public List<MovimentacaoEstoque> listarTodas() {
        return movimentacaoRepository.findAll();
    }

    public List<MovimentacaoEstoque> buscarPorInsumo(Long id) {
        return movimentacaoRepository.findByInsumoId(id);
    }

    public List<MovimentacaoEstoque> buscarPorUsuario(Long id) {
        return movimentacaoRepository.findByUsuarioId(id);
    }
}
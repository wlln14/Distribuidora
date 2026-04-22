package br.com.senai.DistribuidoraDeSuprimentosHospitalares.DTO;

import br.com.senai.DistribuidoraDeSuprimentosHospitalares.Model.Usuario;

public record UsuarioResponseDTO(
        Long id,
        String nome,
        String perfil
) {
    public UsuarioResponseDTO(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getPerfil());
    }
}

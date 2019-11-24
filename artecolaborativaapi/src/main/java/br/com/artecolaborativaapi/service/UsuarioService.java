package br.com.artecolaborativaapi.service;

import java.util.List;

import br.com.artecolaborativaapi.model.Usuario;

public interface UsuarioService {

	public List<Usuario> listUsuario();
	
	public long createUsuario(Usuario usu);
	
	public Usuario getUsuarioId(long idUsu);
	
	public Usuario validarUsuario(String email, String senha);
	
	public List<Usuario> listUsuarioTpUsuaro(String tpUsu);
	
	public String cadastrarArtesaoColab(long idLojista, long idArtesao);

}

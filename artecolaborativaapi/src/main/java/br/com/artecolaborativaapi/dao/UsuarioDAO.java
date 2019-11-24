package br.com.artecolaborativaapi.dao;

import java.util.List;

import br.com.artecolaborativaapi.model.Usuario;

public interface UsuarioDAO {

	List<Usuario> listUsuarios();

	long createUsuario(Usuario usu);
	
	Usuario getUsuarioId(long idUdu);
	
	Usuario validarUsuario(String email,String senha);
	
	List<Usuario> listUsuariosTpUsuario(String tpUsu);

	String cadastrarArtesaoColab(long idLojista, long idArtesao);
	
}

package br.com.artecolaborativaapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.artecolaborativaapi.dao.UsuarioDAO;
import br.com.artecolaborativaapi.model.Usuario;


@Service
@Component("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDao;
	

	@Override
	@Autowired
	public List<Usuario> listUsuario() {
		
		return usuarioDao.listUsuarios();
		
	}
	
	@Override
	@Transactional
	public long createUsuario(Usuario usu) {
		return usuarioDao.createUsuario(usu);
	}
	
	@Override
	@Transactional
	public Usuario getUsuarioId(long idUsu) {
		return usuarioDao.getUsuarioId(idUsu);
	}
	
	@Override
	@Transactional
	public Usuario validarUsuario(String email, String senha) {
		return usuarioDao.validarUsuario(email,senha);
	}
	
	@Override
	@Transactional
	public List<Usuario> listUsuarioTpUsuaro(String tpUsu) {
		return usuarioDao.listUsuariosTpUsuario(tpUsu);
	}

	@Override
	public String cadastrarArtesaoColab(long idLojista, long idArtesao) {
		return usuarioDao.cadastrarArtesaoColab(idLojista, idArtesao);
	}
}

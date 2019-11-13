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
	private UsuarioDAO usuariooDao;
	

	@Override
	@Autowired
	public List<Usuario> listUsuario() {
		
		return usuariooDao.listUsuarios();
		
	}
	
}

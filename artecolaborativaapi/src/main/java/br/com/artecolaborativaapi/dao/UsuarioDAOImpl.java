package br.com.artecolaborativaapi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.artecolaborativaapi.model.Usuario;

@Repository
@Transactional
public class UsuarioDAOImpl implements UsuarioDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Usuario> listUsuarios() {
		List<Usuario> list =  sessionFactory.getCurrentSession().createQuery("from USUARIO").list();
		return list;

	}

}

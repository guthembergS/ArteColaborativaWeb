package br.com.artecolaborativaapi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.artecolaborativaapi.model.Produto;
import br.com.artecolaborativaapi.model.Usuario;

@Repository
@Transactional
public class ProdutoDAOImpl implements ProdutoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Produto> listProdutosUsu(long idUsu) {
		List<Produto> list =  sessionFactory.getCurrentSession().createQuery("from PRODUTO WHERE CD_ARTESAO = :IDUSU").setParameter(1, idUsu).list();
		return list;

	}

	@Override
	public long createProduto(Produto prod) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Produto getProdutoId(long idProd) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

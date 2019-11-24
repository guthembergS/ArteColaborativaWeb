package br.com.artecolaborativaapi.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.artecolaborativaapi.model.Produto;

@Repository
@Transactional
public class ProdutoDAOImpl implements ProdutoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Produto> listProdutosUsu(long idUsu) {
		 String hql = "from PRODUTO where ID_ARTESAO = :IDARTESAO";
				  return (List<Produto>) sessionFactory.getCurrentSession().createQuery(hql)
				   .setParameter("IDARTESAO", idUsu)
				   .list();
		
	}

	@Override
	public long createProduto(Produto prod) {
		sessionFactory.getCurrentSession().save(prod);
		return prod.getIdProduto();
	}

	@Override
	public Produto getProdutoId(long idProd) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

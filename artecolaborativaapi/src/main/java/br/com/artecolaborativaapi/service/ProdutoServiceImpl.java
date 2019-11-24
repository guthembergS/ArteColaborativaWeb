package br.com.artecolaborativaapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.artecolaborativaapi.dao.ProdutoDAO;
import br.com.artecolaborativaapi.model.Produto;

@Service
@Component("ProdutoService")
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoDAO produtoDao;
	

	@Override
	@Transactional
	public List<Produto> listProdutoUsu(long idUsu) {
		return produtoDao.listProdutosUsu(idUsu);
	}


	@Override
	@Transactional
	public long createProduto(Produto prod) {
		return produtoDao.createProduto(prod);
	}
}

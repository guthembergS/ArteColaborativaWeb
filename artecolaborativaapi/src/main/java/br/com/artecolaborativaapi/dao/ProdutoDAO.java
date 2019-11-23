package br.com.artecolaborativaapi.dao;

import java.util.List;

import br.com.artecolaborativaapi.model.Produto;

public interface ProdutoDAO {
	
	List<Produto> listProdutosUsu(long idUsu);

	long createProduto(Produto prod);
	
	Produto getProdutoId(long idProd);
	
}

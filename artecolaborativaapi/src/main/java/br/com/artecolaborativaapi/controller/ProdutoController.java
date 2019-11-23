package br.com.artecolaborativaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.artecolaborativaapi.model.Produto;
import br.com.artecolaborativaapi.service.ProdutoService;

@RestController
public class ProdutoController {

	@Qualifier("ProdutoService")
	@Autowired(required = true)
	public ProdutoService produtoService;

	@GetMapping("/api/produto/{idUsuario}")
	public ResponseEntity<List<Produto>> listProdutosUsuario(@PathVariable("idUsuario") long idUsu){
		List<Produto> list = produtoService.listProdutoUsu(idUsu);
		return ResponseEntity.ok().body(list);
	}
	
}

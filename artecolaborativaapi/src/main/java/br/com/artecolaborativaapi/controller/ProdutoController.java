package br.com.artecolaborativaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.artecolaborativaapi.model.Produto;
import br.com.artecolaborativaapi.model.Usuario;
import br.com.artecolaborativaapi.service.ProdutoService;

@RestController
public class ProdutoController {

	@Qualifier("ProdutoService")
	@Autowired(required = true)
	public ProdutoService produtoService;

	@GetMapping("/api/produto/listaUsu/{idUsuario}")
	public ResponseEntity<List<Produto>> listProdutosUsuario(@PathVariable("idUsuario") long idUsu){
		List<Produto> list = produtoService.listProdutoUsu(idUsu);
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping("/api/produto")
	public ResponseEntity<?> saveProduto(@RequestBody Produto prod){
		long idProd = produtoService.createProduto(prod);
		return ResponseEntity.ok().body("Produto salvo com sucesso - ID_PRODUTO: "+idProd);
	}
	
	
}

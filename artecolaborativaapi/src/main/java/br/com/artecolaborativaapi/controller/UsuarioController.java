package br.com.artecolaborativaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import br.com.artecolaborativaapi.model.Usuario;
import br.com.artecolaborativaapi.service.*;

@RestController
public class UsuarioController {
	
	@Qualifier("UsuarioService")
	@Autowired(required = true)
	public UsuarioService usuarioService;

	
	@GetMapping("/api/usuario")
	public ResponseEntity<List<Usuario>> listArtesao(){
		List<Usuario> list = usuarioService.listUsuario();
		return ResponseEntity.ok().body(list);
	}
	
	/*
	@PostMapping("/api/artesao")
	public ResponseEntity<?> saveArtesao(@RequestBody Artesao artesao){
		long idArtesao = artesaoService.saveArtesao(artesao);
		return ResponseEntity.ok().body("Artesao salvo com sucesso - idArtesao: "+idArtesao);
	}
	
	@GetMapping("/api/artesao/{idArtesao}")
	public ResponseEntity<Artesao> getArtesaoId(@PathVariable("idArtesao") long idArtesao){
		Artesao artesao = ArtesaoService.getArtesao(idArtesao);
		return ResponseEntity.ok().body(artesao);
	}
	
	@PostMapping("/api/artesao/{idArtesao}")
	public ResponseEntity<?> updateArtesao(@PathVariable("idArtesao") long idArtesao,@RequestBody Artesao artesao){
		artesaoService.updateArtesao(idArtesao, artesao);
		return ResponseEntity.ok().body("Artesao atualizado com sucesso!");
	}
	
	@DeleteMapping("/api/artesao/{idArtesao}")
	public ResponseEntity<?> deleteArtesao(@PathVariable("idArtesao") long idArtesao){
		artesaoService.deleteTransportadora(idArtesao);
		return ResponseEntity.ok().body("Artesao excluido com sucesso!");
	}*/
}

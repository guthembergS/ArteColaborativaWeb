package br.com.artecolaborativaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
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
	public ResponseEntity<List<Usuario>> listUsuarios(){
		List<Usuario> list = usuarioService.listUsuario();
		return ResponseEntity.ok().body(list);
	}
	
	
	@PostMapping("/api/usuario")
	public ResponseEntity<?> saveUsuario(@RequestBody Usuario usu){
		long idUsu = usuarioService.createUsuario(usu);
		return ResponseEntity.ok().body("Usuario salvo com sucesso - ID_USUARIO: "+idUsu);
	}

	@PostMapping("/api/usuario/cadastrarArtColab/{idLojista}/{idArtesao}")
	public ResponseEntity cadastrarArtesaoColab(@PathVariable("idLojista") long idLojista,@PathVariable("idArtesao") long idArtesao) {
		String retorno = usuarioService.cadastrarArtesaoColab(idLojista, idArtesao);
		return ResponseEntity.status(HttpStatus.OK).body(retorno);
	}
	
	@GetMapping("/api/usuario/{idUsuario}")
	public ResponseEntity<Usuario> getUsuarioId(@PathVariable("idUsuario") long idUsuario){
		Usuario usu = usuarioService.getUsuarioId(idUsuario);
		return ResponseEntity.ok().body(usu);
	}
	
	@GetMapping("/api/usuario/validar/{email}/{senha}")
	public ResponseEntity validarUsuario(@PathVariable("email") String email,@PathVariable("senha") String senha){
		try {
		Usuario usu = usuarioService.validarUsuario(email,senha);
		return ResponseEntity.ok().body(usu);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Email ou Senha Inválidos!");
		}
	}
	
	@GetMapping("/api/usuario/listar/{tpUsuario}")
	public ResponseEntity<List<Usuario>> listArtesaos(@PathVariable("tpUsuario") String tpUsuario){
		List<Usuario> list = usuarioService.listUsuarioTpUsuaro(tpUsuario);
		return ResponseEntity.ok().body(list);
	}
	
	/*
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

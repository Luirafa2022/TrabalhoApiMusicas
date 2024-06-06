package com.musica.musicas.resource;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musica.musicas.model.Musicas;
import com.musica.musicas.repository.MusicasRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/apimusicas")
@Api(value="API REST Musicas")
@CrossOrigin(origins="*")
public class MusicasResource{
    
    @Autowired
	MusicasRepository musicasRepository;
	
	
	@GetMapping("/musicas")
	@ApiOperation(value="Retorna musica")
	public List<Musicas> listaTeste(){
		return musicasRepository.findAll();
	}
	
	@GetMapping("/musicas/{id}")
	@ApiOperation(value="Retorna musica")
	public Musicas listaMusicas(@PathVariable(value="id") long id){
		return musicasRepository.findById(id);
	}
	
	@PostMapping("/musicas")
	@ApiOperation(value="Salva musica")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Musicas salvaMusicas(@RequestBody Musicas musicas) {
	    return musicasRepository.save(musicas);
	}
	
	@DeleteMapping("/musicas")
	@ApiOperation(value="Apaga musica")
	public void deleteMusicas(@RequestBody Musicas musicas) {
		musicasRepository.delete(musicas);
	}
	
	@PutMapping("/musicas")
	@ApiOperation(value="Atualiza musica")
	public Musicas atualizaMusicas(@RequestBody Musicas musicas) {
	    return musicasRepository.save(musicas);
	}
}
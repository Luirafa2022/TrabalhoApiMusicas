package com.musica.musicas.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value="/apimusicas")
@Api(value="API REST Musicas")
@CrossOrigin(origins="*")
public class MusicasResource{
    
}
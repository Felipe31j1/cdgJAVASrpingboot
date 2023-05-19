package com.fiap.aulaseguranca.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.aualseguranca.model.Atividade;


@RestController
@RequestMapping("/permissao")
public class PermissaoController {
	
	
	
	@GetMapping("/liberado")
	@PreAuthorize("hasAnyRole('ADMIN','USER')")
	public ResponseEntity<String> get() {
		//float num = 1 / 0;
		return new ResponseEntity<>("endpoint liberado!!", HttpStatus.OK); 
	}
	
	@GetMapping("/restrito")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> getAllUser() {
		
		return new ResponseEntity<>("endpoint liberado para geral", HttpStatus.OK); 
	}
	
	
}

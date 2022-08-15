package com.jonathan.projct.prjct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.projct.prjct.model.Usuario;
import com.jonathan.projct.prjct.repository.UserRepository;

@RestController
@RequestMapping("/api/lista")
public class ListController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public @ResponseBody List<Usuario> listar() {
		return userRepository.findAll();
	}

	@PostMapping
	public ResponseEntity<Usuario> create(@RequestBody Usuario record) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(record));
	}

	//@PostMapping
//	public Usuario delete(@RequestBody Usuario dados) {
		//return userRepository.delete(dados);
	
}

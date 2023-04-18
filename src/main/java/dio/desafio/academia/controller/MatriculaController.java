package dio.desafio.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dio.desafio.academia.entity.Matricula;
import dio.desafio.academia.entity.form.MatriculaForm;
import dio.desafio.academia.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
	@Autowired
	private MatriculaServiceImpl matriculaServiceImpl;

	@PostMapping
	public Matricula create(@Valid @RequestBody MatriculaForm form) {
		return matriculaServiceImpl.create(form);
	}

	@GetMapping("/{id}")
	public Matricula get(@PathVariable Long id) {
		return matriculaServiceImpl.get(id);
	}

	@GetMapping
	public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
		return matriculaServiceImpl.getAll(bairro);
	}

}

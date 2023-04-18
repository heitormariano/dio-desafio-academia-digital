package dio.desafio.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.desafio.academia.entity.AvaliacaoFisica;
import dio.desafio.academia.entity.form.AvaliacaoFisicaForm;
import dio.desafio.academia.service.impl.AvaliacaoFisicaServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

	@Autowired
	private AvaliacaoFisicaServiceImpl avaliacaoFisicaServiceImpl;

	@PostMapping
	public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form) {
		return avaliacaoFisicaServiceImpl.create(form);
	}

	@GetMapping("/{id}")
	public AvaliacaoFisica get(@PathVariable Long id) {
		return avaliacaoFisicaServiceImpl.get(id);
	}

	@GetMapping
	public List<AvaliacaoFisica> getAll() {
		return avaliacaoFisicaServiceImpl.getAll();
	}
}

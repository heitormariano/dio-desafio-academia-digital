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

import dio.desafio.academia.entity.Aluno;
import dio.desafio.academia.entity.AvaliacaoFisica;
import dio.desafio.academia.entity.form.AlunoForm;
import dio.desafio.academia.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoServiceImpl alunoServiceImpl;

	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoForm form) {
		return alunoServiceImpl.create(form);
	}

	@GetMapping("/{id}")
	public Aluno get(@PathVariable Long id) {
		return alunoServiceImpl.get(id);
	}

	@GetMapping
	public List<Aluno> getAll() {
		return alunoServiceImpl.getAll();
	}

	@GetMapping("/avaliacoes/{idAluno}")
	public List<AvaliacaoFisica> getAvaliacoesFisicasByIdAluno(@PathVariable Long idAluno) {
		return alunoServiceImpl.getAvaliacoesFisicasByIdAluno(idAluno);
	}

	@GetMapping ("dataNascimento/")
	public List<Aluno> findByDataNascimento(
			@RequestParam(value = "dataNascimento", required = false) String dataNascimento) {
		return alunoServiceImpl.findByDataNascimento(dataNascimento);
	}
}

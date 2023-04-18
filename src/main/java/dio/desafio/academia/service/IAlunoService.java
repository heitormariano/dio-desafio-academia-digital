package dio.desafio.academia.service;

import java.util.List;

import dio.desafio.academia.entity.Aluno;
import dio.desafio.academia.entity.AvaliacaoFisica;
import dio.desafio.academia.entity.form.AlunoForm;

public interface IAlunoService {

	Aluno create(AlunoForm form);

	Aluno get(Long id);

	List<Aluno> getAll();

	List<AvaliacaoFisica> getAvaliacoesFisicasByIdAluno(Long idAluno);

	List<Aluno> findByDataNascimento(String dataNascimento);
}

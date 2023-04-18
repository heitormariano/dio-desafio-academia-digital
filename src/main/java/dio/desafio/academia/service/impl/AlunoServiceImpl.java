package dio.desafio.academia.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.desafio.academia.entity.Aluno;
import dio.desafio.academia.entity.AvaliacaoFisica;
import dio.desafio.academia.entity.form.AlunoForm;
import dio.desafio.academia.repository.AlunoRepository;
import dio.desafio.academia.service.IAlunoService;
import dio.desafio.academia.util.JavaTimeUtils;

@Service
public class AlunoServiceImpl implements IAlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataNascimento(form.getDataNascimento());

		return alunoRepository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		return alunoRepository.findById(id).get();
	}

	@Override
	public List<Aluno> getAll() {
		return alunoRepository.findAll();
	}

	@Override
	public List<AvaliacaoFisica> getAvaliacoesFisicasByIdAluno(Long idAluno) {
		Aluno aluno = alunoRepository.findById(idAluno).get();
		return aluno.getAvaliacoes();
	}

	@Override
	public List<Aluno> findByDataNascimento(String dataNascimento) {
		if (dataNascimento == null || dataNascimento.isEmpty()) {
			return getAll();
		}

		LocalDate parsedDate = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
		return alunoRepository.findByDataNascimento(parsedDate);
	}

}

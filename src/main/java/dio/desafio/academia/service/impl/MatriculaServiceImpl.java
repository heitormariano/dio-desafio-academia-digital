package dio.desafio.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.desafio.academia.entity.Aluno;
import dio.desafio.academia.entity.Matricula;
import dio.desafio.academia.entity.form.MatriculaForm;
import dio.desafio.academia.repository.AlunoRepository;
import dio.desafio.academia.repository.MatriculaRepository;
import dio.desafio.academia.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public Matricula create(MatriculaForm form) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

		matricula.setAluno(aluno);
		return matriculaRepository.save(matricula);
	}

	@Override
	public Matricula get(Long id) {
		return matriculaRepository.findById(id).get();
	}

	@Override
	public List<Matricula> getAll(String bairro) {

		if (bairro == null || bairro.isEmpty()) {
			return matriculaRepository.findAll();
		}

		return matriculaRepository.findAlunosMatriculadosPorBairro(bairro);
	}

}

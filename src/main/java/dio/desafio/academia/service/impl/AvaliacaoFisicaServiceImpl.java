package dio.desafio.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.desafio.academia.entity.Aluno;
import dio.desafio.academia.entity.AvaliacaoFisica;
import dio.desafio.academia.entity.form.AvaliacaoFisicaForm;
import dio.desafio.academia.repository.AlunoRepository;
import dio.desafio.academia.repository.AvaliacaoFisicaRepository;
import dio.desafio.academia.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();

		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(form.getPeso());
		avaliacaoFisica.setAltura(form.getAltura());

		return avaliacaoFisicaRepository.save(avaliacaoFisica);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		return avaliacaoFisicaRepository.findById(id).get();
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		return avaliacaoFisicaRepository.findAll();
	}

}

package dio.desafio.academia.service;

import java.util.List;

import dio.desafio.academia.entity.AvaliacaoFisica;
import dio.desafio.academia.entity.form.AvaliacaoFisicaForm;

public interface IAvaliacaoFisicaService {

	AvaliacaoFisica create(AvaliacaoFisicaForm form);

	AvaliacaoFisica get(Long id);

	List<AvaliacaoFisica> getAll();

}

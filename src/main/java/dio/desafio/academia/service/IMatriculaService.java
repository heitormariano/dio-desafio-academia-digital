package dio.desafio.academia.service;

import java.util.List;

import dio.desafio.academia.entity.Matricula;
import dio.desafio.academia.entity.form.MatriculaForm;

public interface IMatriculaService {

	Matricula create(MatriculaForm form);

	Matricula get(Long id);

	List<Matricula> getAll(String bairro);
}

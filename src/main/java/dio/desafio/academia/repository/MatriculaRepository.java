package dio.desafio.academia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dio.desafio.academia.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

	// consulta personalizada (usando JPQL)
	@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
	List<Matricula> findAlunosMatriculadosPorBairro(String bairro);

	// consulta personalizada (usando padrao de nomenclatura do spring data-jpa)
	// List<Matricula> findByAlunoBairro(String bairro);
}

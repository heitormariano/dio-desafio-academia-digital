package dio.desafio.academia.entity.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

	@NotEmpty(message = "Preencha o campo corretamente.")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	private String nome;

	@NotEmpty(message = "Preencha o campo corretamente.")
	@Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$", message = "CPF inválido")
	private String cpf;

	@NotEmpty(message = "Preencha o campo corretamente.")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	private String bairro;

	@NotNull(message = "Prencha o campo corretamente.")
	@Past(message = "Data '${validatedValue}' é inválida.")
	private LocalDate dataNascimento;
}
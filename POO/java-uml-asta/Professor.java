import java.util.Collection;

public class Professor {

	private int codigo;

	private String nome;

	private String cpf;

	private Date dataNascimento;

	private String titulacao;

	private String sexo;

	private Collection<Disciplina> disciplina;

	public boolean validaCpf(String cpf, Date dataNascimento) {
		return false;
	}

	public boolean validaDataNascimento() {
		return false;
	}

}

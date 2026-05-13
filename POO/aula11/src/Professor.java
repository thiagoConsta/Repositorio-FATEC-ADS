import java.util.Collection;
import java.util.Date;
public class Professor {

	private int codigo;

	private String nome;

	private String cpf;

	private Date dataNascimento;

	private String titulacao;

	private String sexo;

	private Collection<Disciplina> disciplina;

	

	public boolean validaCpf(String cpf) {
		return false;
	}

	public boolean validaDataNascimento(Date dataNascimento) {
		return false;
	}

}

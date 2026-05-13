import java.util.Collection;
public class Notas {

	private int codigo;

	private String tipoAvaliacao;

	private float valorNota;

	private Aluno aluno;

	private Disciplina disciplina;

	private Collection<Boletim> boletim;

	private Professor professor;

	public boolean validaValorNota(float valorNota) {
		return false;
	}

}

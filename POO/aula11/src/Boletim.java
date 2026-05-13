
import java.util.ArrayList;
import java.util.List;

public class Boletim {

	private float mediaFinal;

	private int ano;

	private int semestre;

	private String situacao;

	private float percentualFaltas;

	private Aluno aluno;

	private Chamada chamada;

	private List<Notas> notas;

	public Boletim(Aluno aluno, int ano, int semestre, Notas nota) {
		this.aluno = aluno; // composição
		this.ano = ano; //
		this.semestre = semestre;
		this.notas = new ArrayList<>(); // Agregação
	}

	public void adionarNotas(Notas nota) {
		this.notas.add(nota);
	}

	public void exibirNotas() {
		for (int i = 0; i < notas.size(); i++) {
			System.out.println(notas.get(i).getTipoAvaliacao() + " " + notas.get(i).getValorNota());
		}
	}

	public void calcularMediaFinal() {
		float soma = 0;
		for (int i = 0; i < notas.size(); i++) {
			soma += notas.get(i).getValorNota();
		}
		this.mediaFinal = soma / notas.size();
	}

	public void calcularPercentualFaltas() {

	}

}

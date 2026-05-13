import java.util.Collection;
public class Notas {

	private int codigo;

	private String tipoAvaliacao;

	private float valorNota;

	private Aluno aluno;

	private Disciplina disciplina;

	private Collection<Boletim> boletim;

	private Professor professor;

	public Notas(String tipoAvaliacao, float valorNota){
		this.tipoAvaliacao = tipoAvaliacao;
		if (validaValorNota(valorNota)) {
				this.valorNota=valorNota;
		}else{
			System.out.println("Valor da nota incorreto");
			valorNota = 0;
		}
	}

	public void setValorNota(float valorNota){
		if(validaValorNota(valorNota)){
			this.valorNota = valorNota;
		
		}else{
			System.out.println("Valor da nota incorreto");
			valorNota = 0;
		}
	}

	public String getTipoAvaliacao(){
		return tipoAvaliacao;
	}

	public float getValorNota(){
		return valorNota;
	}

	public boolean validaValorNota(float valorNota){
		// if(valorNota>=0 && valorNota <=10){
		// 	return true;
		// }else{
		// 	return false;
		// }
		return valorNota>=0 && valorNota <=10;
	}



}

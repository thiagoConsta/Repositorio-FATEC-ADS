import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Aluno {

	private String nome;

	private String ra;

	private Date dataNascimento;

	private String cpf;

	private String sexo;

	private Endereco endereco;

	
	private List<Contato> contato;
	
	private List<Chamada> chamada;

	private List<Notas> notas;

	public Aluno (String ra, String nome, String cpf){
		this.ra=ra;
		this.nome=nome;
		this.cpf=cpf;
		this.contato = new ArrayList<>();
		
	}
   	//Associação -> 1
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}

	public Endereco getEndereco(){
		return endereco;
	}
	// add -> adicionando um elemento a lista
	// size -> recuperando o tamanho da lista (length)
	// get -> obtem o elemento a lista de uam determina posição

	// uma lista é similar a um vetor
	// vetor é composto por elementos + indice (index)
	// elementos: conteúdo guardado na lista
	// indice: é o endereco que o elemento esta guardado

	public void adicionarContato(Contato contato){
		this.contato.add(contato);
	}

	public void exibirContato(){
		Contato cont;
		for(int i=0; i<contato.size(); i++){
			// System.out.println(this.contato.get(i).getNumero());
			cont = this.contato.get(i);
			System.out.println(cont.getNumero());
		}
	}


	private void validaDataNascimento(Date dataNascimento) {

	}

	public void validadeCpf() {

	}

	public String ExibirDados() {
		return null;
	}

}

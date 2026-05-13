public class Endereco {

	private String cep;

	private String logradouro;

	private String bairro;

	private String cidade;

	private String estado;

	private String complemento;

	private int numero;

	
	public Endereco(String logradouro, String cidade, String bairro){
		this.logradouro = logradouro;
		this.cidade=cidade;
		this.bairro=bairro;
	}

	public String getLogradouro(){
		return logradouro;
	}

	public boolean validaCep(String cep) {
		return false;
	}

	public boolean validaNumero(int numero) {
		return false;
	}

}

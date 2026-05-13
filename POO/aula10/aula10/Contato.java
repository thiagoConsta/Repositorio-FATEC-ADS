public class Contato {

	private int ddd;

	private String numero;

	private String tipoContato;

	private Aluno aluno;

		public Contato (int ddd, String numero, String tipoContato){
			this.ddd = ddd;
			this.numero = numero;
			this.tipoContato = tipoContato;
		}

		public String getNumero(){
			return numero;
		}

		public String getTipoContato(){
			return tipoContato;
		}

	public boolean validaNumero(int numero) {
		return false;
	}

	public boolean validadeDDD(int ddd) {
		return false;
	}

}

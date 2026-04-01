public class ContaCorrente {
  public String agencia, numeroConta;
  public double saldo;

  //Construtor: Utilizado para inserir valores na instância
  //obrigatorioedade para inserir valores ao criar objeto
  public ContaCorrente(String agencia, String NumeroConta){
    this.agencia = agencia;
    this.numeroConta = numeroConta;
  }

  //criando métodos
  //1- métodos com retorno
  //2- métodos sem retorno (void)

  //síxtaxe do método: modificadorAcesso retorno nomeMetodo(parametro)
  public void deposito(double valor){
    saldo = saldo + valor;
  } 
  
  public boolean saque(double valor){
    if(valor<=saldo){
      saldo = saldo - valor;
      return true;
    }else{
      return false;
    }
  }

  public double consultarSaldo(){
    //todo método com retorno precisa de um return
    return saldo;
  }

  //recuperar valores por meio do método get
  public String getAgencia(){
    return agencia;
  }

  public String getNumeroConta(){
    return numeroConta;
  }

  //guardando ou modificando valores

  public void setAgencia(String agencia){
    this.agencia = agencia;
  }

  public void setNumeroConta(String numeroConta){
    this.numeroConta = numeroConta;
  }
}

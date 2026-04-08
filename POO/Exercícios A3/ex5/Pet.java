public class Pet{
  String nome;
  int fome = 100;

public void comer() {
    this.fome = this.fome - 20;
}

  public void status(){
    System.out.println(fome);
  }



}
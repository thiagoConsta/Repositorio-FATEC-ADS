public class Lampada {

    private boolean ligada = true;

    public void ligar() {
        ligada = true;
        mostrarEstado();
    }

    public void desligar() {
        ligada = false;
        mostrarEstado();
    }

    private void mostrarEstado() {
        System.out.println("Estado da lâmpada: " + (ligada ? "Ligada" : "Desligada"));
    }
}
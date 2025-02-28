import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        EntornoJuego entorno = new EntornoJuego(800, 600);
        JFrame ventana = new JFrame();
        EventoJuego eventoJuego = new EventoJuego(entorno);

        ventana.add(eventoJuego);
        ventana.setSize(entorno.getAnchuraPantalla(), entorno.getAlturaPantalla());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

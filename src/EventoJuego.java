import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class EventoJuego extends JPanel {
    private ElementoJuego elemento;
    private EntornoJuego entorno;

    public EventoJuego(EntornoJuego entorno) {
        this.entorno = entorno;
        this.elemento = new ElementoJuego(entorno.getAnchuraPantalla(), entorno.getAlturaPantalla());
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(new TecladoControlador());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, entorno.getAnchuraPantalla(), entorno.getAlturaPantalla());

        g.setColor(Color.RED);
        g.fillRect(elemento.getPosicionX(), elemento.getPosicionY(), 50, 50);
    }

    public class TecladoControlador extends java.awt.event.KeyAdapter {
        @Override
        public void keyPressed(java.awt.event.KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case java.awt.event.KeyEvent.VK_UP:
                    elemento.mover(0, -10, entorno.getAnchuraPantalla(), entorno.getAlturaPantalla());
                    break;
                case java.awt.event.KeyEvent.VK_DOWN:
                    elemento.mover(0, 10, entorno.getAnchuraPantalla(), entorno.getAlturaPantalla());
                    break;
                case java.awt.event.KeyEvent.VK_LEFT:
                    elemento.mover(-10, 0, entorno.getAnchuraPantalla(), entorno.getAlturaPantalla());
                    break;
                case java.awt.event.KeyEvent.VK_RIGHT:
                    elemento.mover(10, 0, entorno.getAnchuraPantalla(), entorno.getAlturaPantalla());
                    break;
            }
            repaint();
        }
    }
}

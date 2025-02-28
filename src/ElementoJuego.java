public class ElementoJuego {
    private int posicionX;
    private int posicionY;

    public ElementoJuego(int anchura, int altura) {
        this.posicionX = anchura / 2;
        this.posicionY = altura / 2;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void mover(int dx, int dy, int anchura, int altura) {
        posicionX = Math.min(Math.max(posicionX + dx, 0), anchura - 1);
        posicionY = Math.min(Math.max(posicionY + dy, 0), altura - 1);
    }
}

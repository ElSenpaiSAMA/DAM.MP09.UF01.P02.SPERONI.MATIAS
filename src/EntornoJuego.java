public class EntornoJuego {
    private int anchuraPantalla;
    private int alturaPantalla;

    public EntornoJuego(int anchura, int altura) {
        this.anchuraPantalla = anchura;
        this.alturaPantalla = altura;
    }

    public int getAnchuraPantalla() {
        return anchuraPantalla;
    }

    public int getAlturaPantalla() {
        return alturaPantalla;
    }
}

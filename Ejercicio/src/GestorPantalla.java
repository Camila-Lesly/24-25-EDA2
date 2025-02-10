class GestorPantalla {
    private PantallaEntrelazada pantallaEntrelazada;

    public GestorPantalla(Resolucion resolucion) {
        this.pantallaEntrelazada = new PantallaEntrelazada(resolucion);
    }

    public void establecerPixel(Coordenada coordenada, int color) {
        pantallaEntrelazada.establecerPixel(coordenada, color);
    }

    public void renderizar() {
        pantallaEntrelazada.renderizar();
    }
}
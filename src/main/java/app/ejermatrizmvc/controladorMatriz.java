package app.ejermatrizmvc;

public class controladorMatriz {

    private modeloMatriz modelo;
    private vistaMatriz vista;

    public controladorMatriz(modeloMatriz modelo, vistaMatriz vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.addPrincipalListener(e -> {
            modelo.generarMatrizPrincipal();
            vista.mostrarMatriz(modelo);
        });

        vista.addSecundariaListener(e -> {
            modelo.generarMatrizSecundaria();
            vista.mostrarMatriz(modelo);
        });

        vista.addAmbasListener(e -> {
            modelo.generarMatrizAmbas();
            vista.mostrarMatriz(modelo);
        });

        vista.addCuadradoListener(e -> {
            modelo.generarCuadrado();
            vista.mostrarMatriz(modelo);
        });

        vista.addZetaListener(e -> {
            modelo.generarZeta();
            vista.mostrarMatriz(modelo);
        });

        vista.addFlechaListener(e -> {
            modelo.generarFlecha();
            vista.mostrarMatriz(modelo);
        });

        vista.addAleatorioListener(e -> {
            modelo.generarAleatorio();
            vista.mostrarMatriz(modelo);
        });
    }

    public void iniciar() {
        vista.setVisible(true);
    }
}

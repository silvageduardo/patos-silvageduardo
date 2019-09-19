package ar.edu.unahur.ob2.patos.modelo;

public abstract class Pato {

    private Volable comportamientoDeVuelo;

    private Nadable comportamientoDeNado;

    private Parpeable comportamientoDeParpar;

    public Pato(Volable comportamientoDeVuelo, Nadable comportamientoDeNado, Parpeable comportamientoDeParpar) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
        this.comportamientoDeNado = comportamientoDeNado;
        this.comportamientoDeParpar = comportamientoDeParpar;
    }

    public void volar() {
        comportamientoDeVuelo.volar();
    }
    public void parpar() { comportamientoDeParpar.parpar();}
    public void nadar(){ comportamientoDeNado.nadar();}


    public void setComportamientoDeNado(Nadable comportamientoDeNado) {
        this.comportamientoDeNado = comportamientoDeNado;
    }

    public void setComportamientoDeParpar(Parpeable comportamientoDeParpar) {
        this.comportamientoDeParpar = comportamientoDeParpar;
    }

    public void setComportamientoDeVuelo(Volable comportamientoDeVuelo) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    public abstract void dibujar();
}

package es.dylanhurtado.FilosofosComensales;


public class Main {



    public static void main(String[] args) {
        Mesa mesa = Mesa.getInstance();
        mesa.prepararTenedores();
        mesa.prepararFilosofos();

    }
}

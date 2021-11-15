package es.dylanhurtado.FilosofosComensales;

public class Tenedor {

    private boolean isTaked;


    public Tenedor() {
        this.isTaked = false;
    }

    public synchronized void drop(int idFilosofo) {
        System.out.printf("El filosofo %d -> ha soltado el tenedor\n", idFilosofo);
        this.isTaked = false;
        notifyAll();
    }

    public synchronized void take(int idFilosofo) {

        while (isTaked) {
            try {
                System.out.printf("El filosofo %d -> no a podido coger el tenedor y espera\n", idFilosofo);
                wait();
            } catch (InterruptedException e) {
                System.out.printf("El filosofo %d -> error en la espera de take() tenedor...\n", idFilosofo);
            }
        }
        System.out.printf("El filosofo %d -> ha cogido el tenedor\n", idFilosofo);
        this.isTaked = true;

    }

}

package es.dylanhurtado.FilosofosComensales;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Filosofo extends Thread {
    Tenedor izquierdo;
    Tenedor derecho;
    int idFilosofo;
    Random random;

    public Filosofo(Tenedor izquierdo, Tenedor derecho, int idFilosofo) {
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.idFilosofo = idFilosofo;
        random=new Random();
    }


    public void run() {

        while (!Thread.interrupted()) {
            try {

                System.out.printf("El filosofo %d -> esta pensando...\n", idFilosofo);
                TimeUnit.SECONDS.sleep(random.nextInt(5)+5);

                System.out.printf("El filosofo %d -> se dispone a coger el tenedor izquierdo...\n", idFilosofo);
                izquierdo.take(idFilosofo);
                System.out.printf("El filosofo %d -> se dispone a coger el tenedor derecho...\n", idFilosofo);
                derecho.take(idFilosofo);
                System.out.printf("El filosofo %d -> esta comiendo...\n", idFilosofo);
                TimeUnit.SECONDS.sleep(random.nextInt(5)+5);
                derecho.drop(idFilosofo);
                izquierdo.drop(idFilosofo);
            } catch (InterruptedException e) {
                System.out.printf("El filosofo %d -> saliendo por una interrupción...\n", idFilosofo);
            }


        }
    }
}

package es.dylanhurtado.FilosofosComensales;

public class Mesa {
    private final static int FILOSOFOS = 5;
    private static Tenedor[] tenedores;
    private static Filosofo[] filosofos;
    private static Mesa mesa;

    private Mesa() {
        tenedores = new Tenedor[FILOSOFOS];
        filosofos = new Filosofo[FILOSOFOS];
    }
    //Singleton
    public static Mesa getInstance() {
        if (mesa == null) {
            mesa = new Mesa();
        }
        return mesa;
    }

    public void prepararTenedores() {

        for (int i = 0; i < FILOSOFOS; i++) {
            tenedores[i] = new Tenedor();
        }
    }


    public void prepararFilosofos() {

        for (int i = 0; i < FILOSOFOS; i++) {

            if (i < (FILOSOFOS - 1)) {
                filosofos[i] = new Filosofo(tenedores[i], tenedores[i + 1], i);
                filosofos[i].start();
            } else {
                filosofos[i] = new Filosofo(tenedores[0], tenedores[i], i);
                filosofos[i].start();
            }
        }
    }
}

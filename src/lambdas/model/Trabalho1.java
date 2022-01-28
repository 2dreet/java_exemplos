package lambdas.model;

import lambdas.Threads;

public class Trabalho1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Trabalho 1 = " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }
}

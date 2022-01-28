package lambdas;

import lambdas.model.Trabalho1;

public class Threads {
    public static void main(String[] args) {

        Runnable trabalho1 = new Trabalho1();

        Runnable trabalho2 = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Trabalho 2 = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {

                    }
                }
            }
        };

        Runnable trabalho3 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Trabalho 3 = " + i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
            }
        };

        new Thread(trabalho1).start();
        new Thread(trabalho2).start();
        new Thread(trabalho3).start();
        new Thread(Threads::trabalho4).start();

    }

    static void trabalho4(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Trabalho 4 = " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }
}

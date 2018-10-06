public class Ejercicio3 implements Runnable {
        static final int ASC=0;
        static final int DESC=1;
        int orden;

        Ejercicio3(int orden){
            this.orden=orden;
        }
        @Override
        public void run() {
            if (orden!=0){
                for (int i=1;i<=10;i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(""+i);
                }
            }else {
                for (int i=1;i<=10;i++) {
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(""+i);
                }
            }
        }
        public static void main(String[] args) {

            Ejercicio3 ej1 = new Ejercicio3(ASC);
            Ejercicio3 ej2 = new Ejercicio3(DESC);
            Thread h1 = new Thread(ej1);
            Thread h2 = new Thread(ej2);
            h1.start();
            h2.start();
        }
}

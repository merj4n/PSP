public class Ejercicio1 implements Runnable{
    String texto;
    static final int SEG=3000;
    static final String H="hola";
    static final String A="adios";
    Ejercicio1(String texto){
        this.texto=texto;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            try {
                int tiempo;
                Thread.sleep(tiempo=(int)(Math.random()*SEG));
                System.out.println(tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(""+texto);
        }
    }
    public static void main(String[] args) {
        Ejercicio1 ej1 = new Ejercicio1(H);
        Ejercicio1 ej2 = new Ejercicio1(A);
        Thread h1 = new Thread(ej1);
        Thread h2 = new Thread(ej2);
        h1.start();
        h2.start();
    }
}

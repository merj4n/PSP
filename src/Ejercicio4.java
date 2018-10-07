import java.io.IOException;

public class Ejercicio4 implements Runnable {
    String arg;
    static final int SEG=1000;
    static final String SAL="Aplicación cerrada: ";
    static final String SAL2="\nTiempo: ";
    static final String SAL3=" s.";

    Ejercicio4(String arg){
        this.arg=arg;
    }
    @Override
    public void run() {
        try {
            long t = System.currentTimeMillis();
            Process p = Runtime.getRuntime().exec(arg);
            p.waitFor();
            long total = (System.currentTimeMillis()-t)/SEG;
            System.out.println(SAL+arg+SAL2+total+SAL3);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        Ejercicio4 ej1 = new Ejercicio4(args[0]);
        Ejercicio4 ej2 = new Ejercicio4(args[1]);
        Ejercicio4 ej3 = new Ejercicio4(args[2]);

        Thread h1 = new Thread(ej1);
        Thread h2 = new Thread(ej2);
        Thread h3 = new Thread(ej3);

        h1.start();
        h2.start();
        h3.start();
    }
}

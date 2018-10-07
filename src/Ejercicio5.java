import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio5 implements Runnable {
    int numero1;
    int numero2;
    static final String RUTA="C:/Users/merjan/Desktop/Prueba.txt";

    Ejercicio5(int numero1,int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    @Override
    public void run() {
        FileWriter fichero = null;
        try {
            fichero = new FileWriter(RUTA, true);
            PrintWriter escribe = new PrintWriter(fichero);
            for (int i = numero1; i <= numero2; i++)
                escribe.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fichero.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

        Ejercicio5 ej1 = new Ejercicio5(11,20);
        Ejercicio5 ej2 = new Ejercicio5(21,30);
        Ejercicio5 ej3 = new Ejercicio5(1,10);

        Thread h1 = new Thread(ej1);
        Thread h2 = new Thread(ej2);
        Thread h3 = new Thread(ej3);

        h1.start();
        h2.start();
        h3.start();
    }
}

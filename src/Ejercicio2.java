import java.util.Scanner;

public class Ejercicio2 implements Runnable {
    static final int ASC=0;
    static final int DESC=1;
    static final int MIN=11;
    int numero;
    int orden;

    Ejercicio2(int numero,int orden){
        this.numero=numero;
        this.orden=orden;
    }
    @Override
    public void run() {
        if (orden!=0){
        for (int i=0;i<numero;i++) {
            System.out.println(""+i);
        }
        }else {
            for (int i = numero; i > 0; i--) {
                System.out.println("" + i);
            }
        }
    }
    public static void main(String[] args) {
        int num1;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Introduce un número mayor de 10: ");
            num1 = reader.nextInt();
        }while (num1<MIN);

        Ejercicio2 ej1 = new Ejercicio2(num1,ASC);
        Ejercicio2 ej2 = new Ejercicio2(num1,DESC);
        Thread h1 = new Thread(ej1);
        Thread h2 = new Thread(ej2);
        h1.start();
        h2.start();
    }
}

public class Ejercicio1 implements Runnable{
    String texto;
    Ejercicio1(String texto){
        this.texto=texto;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            try {
                int tiempo;
                Thread.sleep(tiempo=(int)(Math.random()*3000));
                System.out.println(tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(""+texto);
        }
    }
    public static void main(String[] args) {
        Ejercicio1 ej1 = new Ejercicio1("hola");
        Ejercicio1 ej2 = new Ejercicio1("adios");
        Thread h1 = new Thread(ej1);
        Thread h2 = new Thread(ej2);
        h1.start();
        h2.start();
    }
}

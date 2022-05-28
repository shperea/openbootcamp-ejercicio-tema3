public class Main {
    public static void main(String[] args) {
        int numero1, numero2, numero3, resultado;
        numero1 = 10;
        numero2 = 20;
        numero3 = 30;
        resultado = sum(numero1, numero2, numero3);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int sum(int a, int b, int c) {
        int d;
        d = a + b + c;
        return d;
    }
}
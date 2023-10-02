package ParteAlejandroGarcia01;

public class areaTriangulo {

    public static int calcularArea(int base, int altura) {
        return (base * altura)/2;
    }


    public static void main(String[] args) {
        System.out.println("El área del triángulo es igual a: " + calcularArea(20,6));

    }
}

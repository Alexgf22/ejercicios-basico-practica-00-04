package AlejandroGarcia.ParteAlejandroGarcia01;

public class convertirMbAKb {

    public static double conversor(double megabytes) {
        return megabytes * 1024;
    }

    public static void main(String[] args) {
        System.out.println("La conversión a kilobytes serían : " + conversor(200.0) + " kilobytes");

    }

}

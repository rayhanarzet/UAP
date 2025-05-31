package uap.mains;
import uap.models.Torus;
import uap.models.Sphere;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAYLA RAYHANA ZAHRANY");
        System.out.println("245150701111005");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
double R = sc.nextDouble();
        System.out.print("Isikan radius   : ");
double r = sc.nextDouble();
Torus torus = new Torus(R, r);
        System.out.println("=============================================");
    torus.printInfo();
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
double r2 = sc.nextDouble();
Sphere sphere = new Sphere(r2);
        System.out.println("=============================================");
    sphere.printInfo();
        System.out.println("=============================================");
    sc.close();
    }
}


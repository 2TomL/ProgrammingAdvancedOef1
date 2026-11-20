import java.util.Scanner;
public class Oppervlakte {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de lengte van de muur: ");
        double lengte = scanner.nextDouble();
        System.out.println("Geef de breedte van de muur: ");
        double breedte = scanner.nextDouble();
        double oppervlakte = lengte * breedte;
        System.out.println(oppervlakte);
    }
}

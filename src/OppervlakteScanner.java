import java.util.Scanner;

public class OppervlakteScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef de lengte:");
        double length = scanner.nextDouble();

        System.out.println("Geef de hoogte:");
        double height = scanner.nextDouble();

        double surface = length * height;

        System.out.println("De oppervlakte is: " + surface);

        scanner.close();
    }
}

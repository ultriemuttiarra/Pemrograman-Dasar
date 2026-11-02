package METHOD;
import java.util.Scanner;

public class Luas_Lingkaran {
    static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 1; i <= 3; i++) {
            System.out.print("Jari-jari Lingkaran ke-" + i + " : ");
            double r = input.nextDouble();
            
            double luas = luasLingkaran(r);
            System.out.println("Luas Lingkaran dengan r = " + r + " adalah : " + luas);
        }
        input.close();
    }
}

package METHOD;
import java.util.Scanner;

public class Konversi {
    static double konversiCelsiFahren(double c) {
        return (c * 9 / 5) + 32;
    }
    
    static double konversiFahrenCelsi(double f) {
        return (f - 32) * 5 / 9;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("KONVERSI SUHU");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        System.out.print("Pilih Konversi : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan Suhu Celsius : ");
            double c = input.nextDouble();

            double hasil = konversiCelsiFahren(c);

            System.out.println("Hasil Konversi : " + hasil + " Fahrenheit");

        } else if (pilihan == 2) {
            System.out.print("Masukkan Suhu Fahrenheit: ");
            double f = input.nextDouble();

            double hasil = konversiFahrenCelsi(f);

            System.out.println("Hasil Konversi: " + hasil + " Celsius");

        } else {
            System.out.println("Pilihan tidak valid!");
        }
        
        input.close();
    }
}

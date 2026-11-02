package METHOD;

public class RATARATA_OVERLOAD {
    public static double rataRata(double a, double b) {
        return (a + b) / 2;
    }
    
    public static double rataRata(double a, double b, double c) {
        return(a + b + c) / 3;
    }
    
    public static void main(String[] args) {
        double hasil1 = rataRata(80.0, 90.0);
        double hasil2 = rataRata(80.0, 90.0, 85.0);
        
        System.out.println("Rata-rata dari 2 Bilangan : " + hasil1);
        System.out.println("Rata-rata dari 3 Bilangan : " + hasil2);
    }
}

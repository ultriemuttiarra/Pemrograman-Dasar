/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EXAMPLE;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Prakswitch {

    public static void main(String[] args) {
        System.out.println("Monday");
        Scanner input=new Scanner(System.in);
        int day = input.nextInt();
       int Scanner = 4;
       switch (Scanner) {
           case 1:
                System.out.println("Monday");
                break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           
       }
    }
}

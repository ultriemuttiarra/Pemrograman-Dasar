/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EXAMPLE;

/**
 *
 * @author TIARA
 */
public class Examplejava {

    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int x = 10;
        int y = 3;
        
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        
        int z = 5;
        ++z;
        System.out.println(z);
        --z;
        System.out.println(z);
        
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        
        System.out.println("Reguler user : " + (isLoggedIn && !isAdmin));
        System.out.println("Has Acces : " + (isLoggedIn || !isAdmin));
        System.out.println("Not logged in : " + (!isLoggedIn));
    }
}

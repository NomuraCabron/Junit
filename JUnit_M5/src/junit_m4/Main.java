package junit_m4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donam una paraula");
        //Prova de inverteix
        String cadena = sc.nextLine();
        System.out.println(MyUtils.inverteix(cadena));
        
        //Prova de edat
        System.out.println(MyUtils.edat(16, 3, 2005));
        
        //Prova de factorial
        System.out.println(MyUtils.factorial(50));
    }
    
}

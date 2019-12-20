package tp_note_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Program for converting money in Riels to Dollars");
        System.out.println(" Conversion rate is: 1 USD = 4000 RIELS");
        System.out.print("Please input money in Riels: ");

        int Riels = input.nextInt();
        double dollars = (double) Riels / 4000;
        System.out.print( Riels +"RIELS "+"=" + dollars + "USD");
    }
}

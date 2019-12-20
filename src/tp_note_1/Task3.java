package tp_note_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input hours: ");
        int hours = input.nextInt();
        System.out.print("Input minutes: ");
        int minutes = input.nextInt();
        System.out.print("Input Seconds: ");
        int seconds = input.nextInt();


        int p4 = hours*3600 + minutes*60 + seconds;
        System.out.print("Number of seconds: ");
        System.out.print( hours + "x3600" + " + " + minutes + "x60" + " + " + seconds + " = " + p4);
    }
}
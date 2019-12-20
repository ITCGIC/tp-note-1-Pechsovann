package tp_note_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Start hours: ");
        int hours = input.nextInt();
        System.out.print("Input Start minutes: ");
        int minutes = input.nextInt();
        System.out.print("Input Start Seconds: ");
        int seconds = input.nextInt();

        System.out.print("Input End hours: ");
        int hoursEnd= input.nextInt();
        System.out.print("Input End minutes: ");
        int minutesEnd = input.nextInt();
        System.out.print("Input End Seconds: ");
        int secondsEnd = input.nextInt();

        int h = hoursEnd - hours;
        int min = minutesEnd - minutes;
        int s = secondsEnd - seconds;
        int p4 = h*3600 + min*60 + s;

        int p5 = p4 % 60;
        int p6 = p4 / 60;
        int p7 = p6 % 60;
        p6 = p6 /60;

        int find_mins = p4/60;

        double cost = find_mins * 0.05;
        System.out.print("......................................\n");
        System.out.print("Total call duration: ");
        System.out.println( p6 + "h" +":"+ p7 + ":" + "mn" + ":" + p5 +"s");
        System.out.print("Total cost of this call: ");
        System.out.print( cost + "$" );
    }
}


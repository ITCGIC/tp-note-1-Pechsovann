package tp_note_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Seconds: ");

        int seconds  = in.nextInt();
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 /60;
        System.out.print("Time corresponding is: ");
        System.out.print( p2 + ":" + p3 + ":" + p1);

    }
}

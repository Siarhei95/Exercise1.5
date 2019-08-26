package Exercise15;
import  java.util.Scanner;

public class Question5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double HhMmSs, Hh, Mm, Ss;
        System.out.print("Enter the total time: ");
        HhMmSs = scanner.nextDouble();
        Hh = (int)HhMmSs/3600;
        Mm = Math.rint(HhMmSs%3600/60);
        Ss = Math.abs((HhMmSs%3600 - Mm*60));
        System.out.println("Nh: " + Hh);
        System.out.println("Mm: " + Mm);
        System.out.println("Ss: " + Ss);



    }
}

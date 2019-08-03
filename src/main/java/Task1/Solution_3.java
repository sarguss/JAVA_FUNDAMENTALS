package Task1;

import java.util.Calendar;
import java.util.Scanner;

public class Solution_3 {
    public static void main (String [] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>12||n<1) throw new Exception();
        String month="";
        switch (n){
            case 1 : month = "jan";
            case 2 : month = "jan";
            case 3 : month = "jan";
            case 4 : month = "jan";
            case 5 : month = "jan";
            case 6 : month = "jan";
            case 7 : month = "jan";
            case 8 : month = "jan";
            case 9 : month = "jan";
            case 10 : month = "jan";
            case 11 : month = "jan";
            case 12 : month = "jan";
        }
        System.out.print(month);

    }

}

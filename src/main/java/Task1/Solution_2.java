package Task1;

import java.util.Random;
import java.util.Scanner;

public class Solution_2 {
    public static void main (String[] args){

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i=0; i<n; i++){
                array[i]=scanner.nextInt();
            }

            //перебор цифр и проверка методом ifInOrder
            for (int x : array) {
                if (ifUnic(x)) {
                    System.out.println(x);
                    break;
                }
            }


    }
    //метод ifInOrder
    public static boolean ifInOrder(int num) {
        //проверка проверка на одну цифру
        if ((num/10)==0) return true;
        //ицкл срвнения двух цифр
        while(num>9){
            int b = num - num/10 * 10;
            num = num/10;
            int a= num - num/10 * 10;
            if (a>b) return false;
        }
        return true;
    }
    public static boolean ifUnic(int num){
        if ((num/10)==0) return true;
        while(num>9){
            int a = num - num/10 * 10;
            num = num/10;
            String aa = String.valueOf(a);
            String numnum = String.valueOf(num);
            if (numnum.contains(aa)) return false;
        }
        return true;
    }
}
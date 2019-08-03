package Task1;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Locale;

public class Solution_1 {
    public static void main(String[] args){

        //read console


        //hello                 string.concat("Olives                  0,50 €");
        //                                     Общая сумма:            24,80 €Общая сумма:      24,80
        float sum = 24.80f;
        String sdf = String.format(Locale.FRANCE,"Общая сумма:      %10.2f €", sum);
        System.out.println(sdf);
    }
}

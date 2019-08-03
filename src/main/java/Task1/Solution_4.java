package Task1;

import java.util.Random;
import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final int M = 50;
        int[][] matrix = new int[n][n];
        Random random = new Random();
        for (int i=0;i<n; i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=random.nextInt(M*2+1)-M;
            }
        }
        for (int i=0;i<n; i++){
            for (int j=0;j<n;j++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
        int k = random.nextInt(n+1);
        System.out.println("k="+k);

        //сортировка по столбцу
      /**  for (int i=n-1;i>0;i--){
            for (int j=0;j<i;j++){
                if (matrix[j][k-1]>matrix[j+1][k-1]) {
                    for (int ind=0;ind<n;ind++) {
                        int temp = matrix[j][ind];
                        matrix[j][ind] = matrix[j + 1][ind];
                        matrix[j + 1][ind] = temp;
                    }
                }
            }
        }
        for (int i=0;i<n; i++){
            for (int j=0;j<n;j++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
        */
        //матрица подряд идущи основная, только переписывается
        //временная матрица, всегда пополняется

        //пробег по строкам и столбцам
        //если порядок не выполняется или конец строки то сравнивать с основной и обнулять до второго числа
        //если порядок то увеличивать матрицу на число

      /**  int[] array = new int[0];
        int[] ar = new int[0];
        for (int j = 0; j<n;j++) {
            ar = initial(matrix[j][0]);
            for (int i = 0; i < n - 1; i++) {
                if (matrix[j][i] > matrix[j][i + 1]) {
                    if (array.length < ar.length) {
                        array = ar.clone();
                    }
                    ar = initial(matrix[j][i+1]);
                } else {
                    ar = add(ar,matrix[j][i+1]);
                }
            }
            if (array.length < ar.length) {
                array = ar.clone();
            }

        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"   ");
        }
       */
      int max = matrix[0][0];
      int stolbez=0;
      int stroka=0;
      for (int i=0;i<n;i++){
          for (int j=0;j<n;j++){
              if (max<matrix[i][j]) {
                  max = matrix[i][j];
                  stolbez = j;
                  stroka = i;
              }
          }
      }
      int ik=0; int jk=0;
      int [][] arr = new int[n-1][n-1];
        for (int i=0;i<n-1;i++){
            ik = (i<stroka) ? 0 : 1;
            for (int j=0;j<n-1;j++){
                jk = (j<stolbez) ? 0 : 1;
                arr[i][j] = matrix[i+ik][j+jk];
            }
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }

    }
    public static int[] initial(int a){
        int[] array = {a};
        return array;
    }
    public static int[] add(int ar[], int a){
        int[] array = new int[(ar.length+1)];
        System.arraycopy(ar,0,array,0,ar.length);
        array[array.length-1] = a;
        return array;
    }
}

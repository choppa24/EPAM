package basics;

import java.util.Scanner;

import static java.lang.Math.*;

public class Cycle {
    public static void main(String[] args) {
        //TASK 1
//        System.out.println("ВВедите число n :");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int answer = 0;
//        for (int i = 1; i < n + 1; i++)
//            answer += i;
//        System.out.println("Summa = " + answer);

        //TASK 2
//        System.out.println("ВВедите границы отрезка :");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println("ВВедите шаг:");
//        double h = in.nextDouble();
//        for (double i = a; i <=b; i+=h ){
//            if (i > 2)
//                System.out.println(i);
//            else System.out.println(-i);
//        }

        //TASK 3
//        int summa = 0;
//        for (int i = 0; i < 101; i++){
//            summa += pow(i,2);
//        }
//        System.out.println("Сумма квадратов ста первых натуральных чисел = " + summa);

        //TASK 4
//        long comp = 1;
//        for (int i = 1; i < 201; i++){
//            comp *= pow(i,2);
//        }
//        System.out.println("Произведение квадратов двухсот первых натуральных чисел = " + comp);

        //TASK 5
        //изи

        //TASK 6
//        System.out.println("ACSII TABLE : ");
//        for (int i = 0; i < 256; i++) {
//            System.out.println(i + " : " + ((char) i));
//        }
        //TASK 7
//        System.out.println("Введите m и n:");
//        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        int n = in.nextInt();
//        for (int i = m; i <= n; i++) {
//            System.out.print("Делители числа " + i + " : ");
//            for (int j = 2; j < i; j++)
//                if ( (i % j) == 0)
//                    System.out.print(j + " ");
//            System.out.println();
//        }
        //TASK 8
        int mass [] = new int [10];
        for (int i = 0; i < 10; i++)
            mass[i] = 0;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while (a > 0){
            mass[a % 10] = 1;
            a /=10;
        }
        while (b > 0){
            if (mass[b % 10] == 1)
                mass[b %10] = 2;
            b /=10;
        }
        for (int i = 0; i < 10; i++)
            if (mass[i] == 2)
                System.out.println(i);


    }
}

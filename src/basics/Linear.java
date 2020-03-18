package basics;

import java.util.Scanner;

import static java.lang.Math.*;

public class Linear {
    public static void main(String[] args) {
        //TASK 1
//        System.out.println("ВВедите числа a, b, c: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        double z;
//        z = ((a - 3) * b / 2) + c;
//        System.out.println("Значение выражения = " + z);
        //TASK 2
//        System.out.println("ВВедите числа a, b, c: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        double z;
//        z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) -
//                Math.pow(a, 3) * c - Math.pow(b, -2);
//        System.out.println("Значение выражения = " + z);
        //TASK 3
//        System.out.println("ВВедите числа x, y ");
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) *tan(x*y);
//        System.out.println("Значение выражения = " + z);
        //TASK 4
//        System.out.println("Введите число в формате nnn.ddd : ");
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        String partn = str.substring(0,3);
//        String partd = str.substring(4,7);
//        System.out.println("Результат : "+ partd + "," + partn);
        //TASK 5
//        System.out.println("Введите время в секундах : ");
//        Scanner in = new Scanner(System.in);
//        int sec = in.nextInt();
//        int hours = sec / 3600;
//        sec -= hours * 3600;
//        int min = sec / 60;
//        sec -= min * 60;
//        System.out.println(hours + "ч " + min + "мин " + sec + "c.");
        //TASK 6
        System.out.println("Введите координаты точки ");
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int x = in.nextInt();
        int y = in.nextInt();
        // верхняя область
        if (((x < 2) && (x>(-2))) && ((y<4) || (y>0)))
            flag = true;
        if (!flag)
            if (((x < 4) && (x>(-4))) && ((y<0) || (y>(-3))))
                flag = true;
        if (flag)
            System.out.println("Принадлежит!");
        else System.out.println("Не принадлежит!");



    }
}

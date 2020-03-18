package basics;

import java.util.Scanner;
import static java.lang.Math.*;

public class Branch {
    public static void main(String[] args) {
        //TASK 1
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        if (a + b < 180){
//            System.out.println("Triangle exists");
//            if (a + b == 90)
//                System.out.println("Он прямоугольный");
//        }
//        else System.out.println("Треугольник не существует");
        //TASK 2
//        System.out.println("Введите 4-е числа");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int d = in.nextInt();
//        int answer = max(min(a,b), min(c,d));
//        System.out.println(answer);
        //TASK 3
//        System.out.println("Введите координаты трех точек :");
//        Scanner in = new Scanner(System.in);
//        int x1 = in.nextInt(); int y1 = in.nextInt(); int x2 = in.nextInt();
//        int y2 = in.nextInt(); int x3 = in.nextInt(); int y3 = in.nextInt();
//        if (((x1 - x3)/(x2 -x3)) == ((y1 - y3)/(y2 - y3)))
//            System.out.println("Точки лежат на одной прямой");
//        else System.out.println("Точки не лежат на одной прямой");
        //TASK 4
//        System.out.println("Введите размеры отверстия :");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt(); int b = in.nextInt();
//        System.out.println("Введите размеры кирпича :");
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int z = in.nextInt();
//        boolean flag = false;
//        if ( x <= a &&  y <= b)
//            flag = true;
//        if ( y <= a &&  x <= b)
//            flag = true;
//        if ( z <= a &&  y <= b)
//            flag = true;
//        if ( y <= a &&  z <= b)
//            flag = true;
//        if ( x <= a &&  z <= b)
//            flag = true;
//        if ( z <= a &&  x <= b)
//            flag = true;
//        if (flag)
//            System.out.println("Кирпич пройдет через отверстие");
//         else System.out.println("Кирпич не пройдет через отверстие");

        //TASK 5
        System.out.println("Введите x :");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double fx;
        if (x > 3){
            fx = 1 / (pow(x,3) +6);
        }
        else fx = pow(x,2) - 3*x + 9;
        System.out.println("Значение функции при x = "+ x+ " равно " +fx);

    }
}

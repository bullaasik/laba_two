package com.company;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        Point3d Obj1, Obj2, Obj3;
        //Создание сканера
        Scanner MyScanner = new Scanner(System.in);
        double x, y, z;
        double x1, y1, z1;
        double x2, y2, z2;

        //Для obj1
        //присваивание знаечений переменным через сканер(берет первое вхождения числа типа double)
        x = MyScanner.nextDouble();
        y = MyScanner.nextDouble();
        z = MyScanner.nextDouble();

        //Создание объекта класса Point3d с тремя полями
        Obj1 = new Point3d(x, y, z);

        //Для obj2
        //присваивание знаечений переменным через сканер(берет первое вхождения числа типа double)
        x1 = MyScanner.nextDouble();
        y1 = MyScanner.nextDouble();
        z1 = MyScanner.nextDouble();

        //Создание объекта класса Point3d с тремя полями
        Obj2 = new Point3d(x1, y1, z1);

        //Для obj3
        //присваивание знаечений переменным через сканер(берет первое вхождения числа типа double)
        x2 = MyScanner.nextDouble();
        y2 = MyScanner.nextDouble();
        z2 = MyScanner.nextDouble();

        //Создание объекта класса Point3d с тремя полями
        Obj3 = new Point3d(x2, y2, z2);

        //проверка условия для вывода
        if ((Obj1.equals(Obj2) ||  (Obj1.equals(Obj3)) || (Obj2.equals(Obj3)) )) {
            System.out.println("Невозможно"); //точки совпадают, тругольника не существует
        }
        else {
            System.out.println(computeArea(Obj1,Obj2,Obj3));
        }
    }

    //метод для вычисления площади по формуле Герона
    public static double computeArea(Point3d Obj1, Point3d Obj2, Point3d Obj3) {
        double Dist1 = Obj1.distanceTo(Obj2);
        double Dist2 = Obj2.distanceTo(Obj3);
        double Dist3 = Obj3.distanceTo(Obj1);
        double PP = (Dist1 + Dist2 + Dist3)/2;
        double Geron = Math.sqrt(PP * (PP - Dist1)*(PP-Dist2)*(PP-Dist3));
        if ((Dist1 + Dist2 > Dist3) && (Dist1 + Dist3 > Dist2) && ((Dist3 + Dist2 > Dist1))) {
            return Geron;
        }
        else {
            return 0;
        }
    }

}

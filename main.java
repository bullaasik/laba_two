package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Point3d Obj1, Obj2, Obj3;
        Scanner MyScanner = new Scanner(System.in);
        double x, y, z;
        double x1, y1, z1;
        double x2, y2, z2;

        x = MyScanner.nextDouble();
        y = MyScanner.nextDouble();
        z = MyScanner.nextDouble();

        Obj1 = new Point3d(x, y, z);

        x1 = MyScanner.nextDouble();
        y1 = MyScanner.nextDouble();
        z1 = MyScanner.nextDouble();

        Obj2 = new Point3d(x1, y1, z1);

        x2 = MyScanner.nextDouble();
        y2 = MyScanner.nextDouble();
        z2 = MyScanner.nextDouble();

        Obj3 = new Point3d(x2, y2, z2);

        if ((x==x1 && y==y1 && z==z1) || (x==x2 && y==y2 && z==z2)) {
            System.out.println("Невозможно");
        }
        else {
            System.out.println(computeArea(Obj1,Obj2,Obj3));
        }
    }

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
            return 0; // для случая с некорректными данными
        }
    }

}

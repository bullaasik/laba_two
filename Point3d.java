package com.company;

public class Point3d extends Point2d{ //наследуемся от класса Point2d

    private double zCoord;

    public Point3d ( double x, double y, double z) { //конструктор инициализации
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d () { //констурктор по умолчанию
        this(0, 0, 0);
    }

    public double getX () {
        return xCoord;
    }

    public double getY () {
        return yCoord;
    }

    public double getZ () {
        return zCoord;
    }

    @Override
    public void setX ( double val) {
        super.xCoord = val;
    }

    @Override
    public void setY ( double val) {
        super.yCoord = val;
    }

    public void setZ (double val) {
        zCoord = val;
    }

    public double distanceTo (Point3d t) {
        double d = Math.sqrt(Math.pow(this.getX()-t.getX(), 2) + Math.pow(this.getY() - t.getY(), 2) + Math.pow(this.getZ() - t.getZ(), 2));
        double scale = Math.pow(10,2);
        d = Math.ceil(d*scale)/scale;
        return d;
    }

}

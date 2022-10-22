package com.company;

public class Point3d extends Point2d{ //наследуемся от класса Point2d

    private double zCoord;

    public Point3d ( double x, double y, double z) { //конструктор инициализации
        super(x, y);
        zCoord = z;
    }

    public Point3d () { //констурктор по умолчанию
        this(0, 0, 0);
    }

    public double getZ () {
        return zCoord;
    }

    public void setZ (double val) {
        zCoord = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Point3d p = (Point3d)obj;
        if (getX() != p.getX() || getY() != p.getY() || getZ() != p.getZ()) return false;
        return true;
    }

    public double distanceTo (Point3d t) {
        double d = Math.sqrt(Math.pow(this.getX()-t.getX(), 2) + Math.pow(this.getY() - t.getY(), 2) + Math.pow(this.getZ() - t.getZ(), 2));
        double scale = Math.pow(10,2);
        d = Math.ceil(d*scale)/scale;
        return d;
    }


}

package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;





    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = Math.max(height, 0);
    }


    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea()* this.getHeight();
    }
}

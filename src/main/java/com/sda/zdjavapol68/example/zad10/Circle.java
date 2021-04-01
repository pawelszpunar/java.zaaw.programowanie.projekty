package com.sda.zdjavapol68.example.zad10;

public class Circle implements Movable{
    private Point2D center;
    //private Point2D point;
    private final double radius;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        //this.point = point;
        this.radius = Math.sqrt(Math.pow(center.getX() - point.getX(), 2) - Math.pow(center.getY() - point.getY(), 2));
        //perimeter = 2 * Math.PI * radius;
        //area =
    }

    private double getRadius() {
        return radius;
    }

    private double getPermineter() {
        return 2 * Math.PI * radius;
    }

    private double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);

    }
}

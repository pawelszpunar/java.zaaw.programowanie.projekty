package com.sda.zdjavapol68.example.zad11;

public class Circle implements Movable, Resizable {
    private final Point2D center;
    private double radius;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.radius = Math.sqrt(Math.pow(center.getX() - point.getX(), 2) - Math.pow(center.getY() - point.getY(), 2));

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
    public void resize(double resizeFactor) {
        radius *= resizeFactor;
    }

    @Override
    public void move(MoveDirection moveDirection) {

    }

//    @Override
//    public void move(MoveDirection moveDirection) {
//        center.move(moveDirection);
//    }

//    @Override
//    public void move(MoveDirection moveDirection) {
//        center.move(moveDirection);
//    }
}

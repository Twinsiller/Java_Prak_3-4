package Prak_3;

public class MovableCircle implements Movable
{
    /*private MovablePoint point;
    public Circle(MovablePoint point)
    {
        this.point = point;
    }*/


    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        center.radius = radius;
    }

    public String toString()
    {
        return "It's circle";
    }

    public void moveUp()
    {
        center.ySpeed += 1;
    }

    public void moveDown()
    {
        center.ySpeed -= 1;
    }

    public void moveLeft()
    {
        center.xSpeed -= 1;
    }

    public void moveRight()
    {
        center.xSpeed += 1;
    }
}
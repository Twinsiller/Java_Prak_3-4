package Prak_3;

public class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    protected int radius;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "It's point";
    }

    public void moveUp()
    {
        ySpeed += 1;
    }

    public void moveDown()
    {
        ySpeed -= 1;
    }

    public void moveLeft()
    {
        xSpeed -= 1;
    }

    public void moveRight()
    {
        xSpeed += 1;
    }
}
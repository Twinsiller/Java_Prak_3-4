package Prak_3;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "It's Movable Rectangle";
    }

    public void moveUp()
    {
        topLeft.ySpeed += 1;
        bottomRight.ySpeed += 1;
    }

    public void moveDown()
    {
        topLeft.ySpeed -= 1;
        bottomRight.ySpeed -= 1;
    }

    public void moveLeft()
    {
        topLeft.xSpeed -= 1;
        bottomRight.xSpeed -= 1;
    }
    public void moveRight()
    {
        topLeft.xSpeed += 1;
        bottomRight.xSpeed += 1;
    }

    public String checkSpeed ()
    {
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed)
        {
            return "The speed is the same.";
        }
        else
        {
            return "The speed is NOT the same.";
        }
    }

}

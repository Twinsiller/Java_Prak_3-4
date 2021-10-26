package Prak_3;

public class Square extends Rectangle
{

    Square(){}

    Square(double side)
    {
        this.width = side;
        this.length = side;
    }

    Square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    double getSide()
    {
        return width;
    }

    void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    //-------------------------------------------------------------------------
    public void setWidth (double side)
    {
        this.width = side;
    }

    public void setLength (double side)
    {
        this.length = side;
    }

    public String toString ()
    {
        return "Shape: square, side: "+this.width;
    }

}
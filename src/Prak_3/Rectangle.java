package Prak_3;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        width = 1;
        length = 1;
    }

    public Rectangle (double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    double getWidth()
    {
        return width;
    }

    void setWidth()
    {
        this.width = width;
    }

    double getLength()
    {
        return length;
    }

    void setLength()
    {
        this.length = length;
    }

    @Override
    double getArea()
    {
        double area = width * length;
        return area;
    }

    @Override
    double getPerimeter()
    {
        double perimeter = 2 * (width+length);
        return perimeter;
    }

    @Override
    public String toString ()
    {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length;
    }


}
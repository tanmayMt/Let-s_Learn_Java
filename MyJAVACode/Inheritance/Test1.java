import static java.lang.System.out;
class Shape
{
    void area()
    {
        out.println("area() method of "+this.getClass());
    }
}
class Circle extends Shape
{
    double r,area;
    Circle(int r)
    {
        this.r=r;
    }
    void area()
    {
        area=Math.PI*r*r;
        out.println("Area of Circle: "+area);
    }
}
class Test1
{
    public static void main(String[] args)
    {
        Shape c = new Circle(2);
        c.area();
    }
}

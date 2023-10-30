abstract class Shape
{
	double side1;
	double side2;
	
	Shape(double a,double b)
	{
		side1 = a;
		side2 = b;
	}
	abstract double area();
}

class Square extends Shape
{
	Square(double a)
	{
	super(a,a);
	}
	double area()
	{
		System.out.println("Area of Square: ");
		return side1*side1;
	}
}
class Triangle extends Shape
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area of Triangle: ");
		return (0.5*side1*side2);
	}
}

class ShapeAreas
{
	public static void main(String args[])
	{
		Square s = new Square(5);
		Shape sh;
		sh = s;
		System.out.println("Area of Square: "+sh.area());
		
		Triangle t = new Triangle(3,4);
		System.out.println("Area of Triangle: "+t.area());
	}


}
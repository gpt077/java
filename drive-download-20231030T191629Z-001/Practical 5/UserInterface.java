import java.util.Scanner;
interface Polygon
{
	void getArea(int x,int y);
	
	default void getSides()
	{
		System.out.println("Shape can get sides of Polygon");
	}
}
class Square implements Polygon
{
	public void getArea(int x,int y)
	{
		int side = x;
		
		int area = side*side;
		System.out.println("The area of Square is: "+area);
	}
}

class Triangle implements Polygon
{
	public void getArea(int x, int y){
		int base = x;
		int height = y;
		double area = 0.5*base*height;
		System.out.println("The area of Triangle is: "+area);
	}
	
}

class UserInterface
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();

		
		Square s = new Square();
		s.getArea(value1,value2);
		
		
		Triangle t = new Triangle();
		t.getArea(value1,value2);
		
	}


}


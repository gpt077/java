class Box
{
	double length,width,height;
	static double RectArea(double x,double y){
		return (x*y);
	}
	Box(){
		length=width=height=0;
	}
	Box(double l,double w,double h)
	{
		length = l;
		width = w;
		height = h;
	}
	double Volume()
	{
		return (length*width*height);
	}
}
class RectBox{
public static void main(String args[])
{
	double area = Box.RectArea(4.5,5.0);
	System.out.println("Area of Rectangle: "+area);
	double vol;
	
	Box bd = new Box();
	vol = bd.Volume();
	System.out.println("The Volume of Rectangle (Default): "+vol);
	Box bp = new Box(4.5,5.5,6.5);
	vol = bp.Volume();
	System.out.println("The Volume of Rectangle (Parameterized): "+vol);
}
}

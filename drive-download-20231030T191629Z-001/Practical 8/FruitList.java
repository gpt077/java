import java.util.*;

class FruitList
{
	public static void main(String args[])
	{
		ArrayList<String> stu = new ArrayList<String>();
		
		stu.add("Apple");
		stu.add("Banana");
		stu.add("Orange");
		stu.add("Grapes");
		stu.add("Strawberry");
		
		System.out.println("Inserted values are: "+stu);
		
		stu.set(3,"Lichi");
		System.out.println("Value set is: "+stu);
		
		stu.remove(1);
		System.out.println("Value removed is: "+stu);
		
		stu.clear();
		System.out.println("Value cleared is: "+stu);
	}

}
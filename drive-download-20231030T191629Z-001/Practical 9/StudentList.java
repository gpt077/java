import java.util.*;

class StudentList
{
	public static void main(String args[])
	{
		ArrayList<String> stu = new ArrayList<String>();
		
		stu.add("Ram");
		stu.add("Shyam");
		stu.add("Geeta");
		stu.add("Seeta");
		stu.add("Ganesh");
		
		System.out.println("Inserted values are: "+stu);
		
		stu.set(3,"Priya");
		System.out.println("Value set is: "+stu);
		
		stu.remove(1);
		System.out.println("Value removed is: "+stu);
		
		stu.clear();
		System.out.println("Value cleared is: "+stu);
	}

}
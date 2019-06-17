class Animal 
{ 
	public void callme()
	{
		System.out.println("In callme of Animal");
	}
}


class Dog extends Animal 
{ 
	public void callme()
	{
		System.out.println("In callme of Dog");
	}
	public void callme2()
	{
		System.out.println("Dog2");
	}

}

public class Test
{
	public static void main (String [] args) 
	{
		Animal obj=new Dog();
		Dog p= (Dog) obj;
		p.callme2();
	   
		
	}
}














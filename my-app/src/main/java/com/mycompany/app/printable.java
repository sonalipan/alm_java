/*  Create an interface: Printable – method print()
Write a class Utiltiy to have a method printAll( Printable [])
Pass different objects (Shapes & Animals) to printAll() to print them. */


package Printable_prog;


interface printablee 
{	
	public void To_print();
}

class Animals implements printablee
{
	@Override
	public void To_print()
	{
		System.out.println("Print calls from Animal class");
	}
}
class Shape implements printablee
{
	@Override
	public void To_print()
	{
		System.out.println("Print calls from shape class");
	}
}

class utility
{
	public void print_all(printablee p)
	{
		p.To_print();
	}
}

public class printable
{

	public static void main(String [] args)
	{
		Shape shape1 = new Shape();
		Animals animal1 = new Animals();
		utility u1 = new utility();
		
		u1.print_all(shape1);
		u1.print_all(animal1);
	}
}

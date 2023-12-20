package package2;

public class classB {
	
	private int a=10;

	public static void main(String[] args) {
	
		classB cb=new classB();
		cb.meth();
		cb.defaultmeth();
	}
		
	public void meth()		
	{
		System.out.println("Inside classB package2");
	}
	
	void defaultmeth()
	{
		System.out.println("default method");
		System.out.println("private variable" +a);
	}
	
	
		 

	}



package package3;

public class ThirdClass {

	public static void main(String[] args) {


		ThirdClass TC = new ThirdClass();
		TC.methodProtect();
		TC.methodPrivate();

	}

 void methodProtect()
	{
		System.out.println("we are inside protected method");
	}
	
	private void methodPrivate()
	{
		System.out.println("we are inside private method");
	}
}

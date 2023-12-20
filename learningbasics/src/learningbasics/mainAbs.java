package learningbasics;

public class mainAbs extends AbsClass{

	public static void main(String[] args) {
		
		mainAbs abs=new mainAbs();
		abs.polar();
		abs.sky();
		abs.home();
		
	}
	
	public void home()
	{
		System.out.println("implemented abstract method home");
	}
	
	public void sky()
	{
		System.out.println("implemented abstract method sky");
	}

	}



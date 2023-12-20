package learningbasics;

public class LocalVarMethClass {
	
	int q=2;
	String str="Shiva";
	
	public static void main(String[] args) {
		
		
		
		LocalVarMethClass lv=new LocalVarMethClass();
		System.out.println(lv.str+ "  HUKUM is printed");
		lv.callMethod();
		LocalVarMethClass.callMethod1();
	}

	public void callMethod() {
		// TODO Auto-generated method stub
		System.out.println("Inside Non Static method and printing Global variable"+" "+q);
	}
	
	static void callMethod1()
	{
		System.out.println("Inside Static Method");	
	}
}


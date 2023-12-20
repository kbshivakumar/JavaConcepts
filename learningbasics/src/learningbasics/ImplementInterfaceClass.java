package learningbasics;

public class ImplementInterfaceClass implements interfaceClass{

	public static void main(String[] args) {
		
		ImplementInterfaceClass impl=new ImplementInterfaceClass();
		
		impl.abc();

	}

	@Override
	public void interfaceMethod() {
		System.out.println("interfacemethod");
		
	}

	@Override
	public void interfaceMethod1() {
		System.out.println("interfacemethod1");
		
	}

	@Override
	public void abc() {
		System.out.println("abc");
		
	}

}

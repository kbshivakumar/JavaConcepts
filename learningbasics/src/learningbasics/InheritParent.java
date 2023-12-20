package learningbasics;

public class InheritParent extends InheritCommon{

	public static void main(String[] args) {
		
		
		InheritParent IP=new InheritParent();
		IP.start();
		IP.end();
		IP.account();
		IP.ptc();
		System.out.println("Value is printed from parent:" +IP.a);
	}
}

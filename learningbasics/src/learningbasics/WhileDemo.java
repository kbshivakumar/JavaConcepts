package learningbasics;

public class WhileDemo {

	public static void main(String[] args) {


		int i=1, j=10;
		
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
	
		do{
			System.out.println(j);
			j--;
		}while(j>3);
	}

}

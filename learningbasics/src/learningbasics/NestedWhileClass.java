package learningbasics;

public class NestedWhileClass {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=5;i++)
		{
			int j=1;
			while(j<=3)
			{
				j++;
				for(int k=1;k<=2;k++)
				{
					
				System.out.println("print i " +i+ " used while to print j " +j+ " print k " +k);
			    count++;
		}
		}
}
		System.out.println("count " +count);

	}
}

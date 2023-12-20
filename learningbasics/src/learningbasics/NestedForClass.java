package learningbasics;

public class NestedForClass {
	
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				for(int k=1;k<=2;k++)
				{
					
				System.out.println("print i " +i+ " print j " +j+ " print k " +k);
			    count++;
		}
		}
}
		System.out.println("count " +count);
}
}

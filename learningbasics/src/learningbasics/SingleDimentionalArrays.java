package learningbasics;

public class SingleDimentionalArrays {

	public static void main(String[] args) {
		
		int[] stud=new int[5];
		
		stud[1]=10;
		stud[2]=25;
	
		//int[] stud= {1,2,3};
		
		System.out.println("predefined length is:" +stud.length);
		
		for(int i=0;i<=stud.length-1;i++)
		{
			if(stud[i]==0)
			{
				System.out.println("11");
				continue;
			}
			System.out.println(stud[i]);
		}

	}

}

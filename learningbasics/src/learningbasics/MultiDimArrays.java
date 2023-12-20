package learningbasics;

public class MultiDimArrays {

	public static void main(String[] args) {
		
		//int[][] multiarray1= new int[1][3];
		
		int[][] multiarray1= new int[2][3];
		
//		multiarray1[0][0]=71;
//		multiarray1[0][1]=52;
//		multiarray1[1][0]=45;
//		multiarray1[1][1]=28;
//		multiarray1[1][2]=18;
//      multiarray1[0][2]=12;
		
		int[][] multiarray2= {{2,4},{10,11,65}};		
		
		for(int i=0;i<=multiarray2.length;i++)
		{
			for(int j=0;j<=multiarray2.length;j++)
			{
				System.out.println(multiarray2[i][j]);
			}
			
		}

	}

}

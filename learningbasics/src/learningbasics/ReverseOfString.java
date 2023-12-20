package learningbasics;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String str="Malayalam";
		
	char[] a=str.toCharArray();
	

	System.out.println(a.length);
	
	/*
	 * for(int i=a.length-1;i>=0;i--) { System.out.print(a[i]); }
	 */
	
	
	  for(int j=a.length-1;j>=0;j--)
	  { 
		  System.out.println(a[j]); 
		  }
	 
	

}
}

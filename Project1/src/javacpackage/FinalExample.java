package javacpackage;

public class FinalExample {
	
	 final int x=10;
	
	public static void main(String[] args) {
		
		FinalExample fe=new FinalExample();
		fe.x=fe.x+2;
		int y=x+2;
		
		//The final field FinalExample.x cannot be assigned
		
		System.out.println(y);
	
		
	}

}

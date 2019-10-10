package inheritanceExample;

public class Addition {
	// add two numbers
	//verifying git hub

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(10,20,30,40);
	}
	
	
	
	
	
	

}

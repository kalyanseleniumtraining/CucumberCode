package inheritanceExample;

public class Two  {
	
	

	public void print() {
		System.out.println("I belong to class one");
	}

	public void div()
	{
		System.out.println(100/5);
	}
	
	public static void main(String[] args) {
		
		Two t=new Two();
		t.print();
		t.div();
		
	}

	


}

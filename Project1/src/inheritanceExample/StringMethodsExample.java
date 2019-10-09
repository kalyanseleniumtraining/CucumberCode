package inheritanceExample;

public class StringMethodsExample {

	
	public static void main(String[] args) {
		String str="Automation Testing";
		
		int len=str.length();
		System.out.println(len);
		
		
		String uppercaseString=str.toUpperCase();
		System.out.println(uppercaseString);
		
		
		String lowerCaseString=str.toLowerCase();
		System.out.println(lowerCaseString);
		
		
		char ch=str.charAt(4);
		System.out.println(ch);
		
		int firstIndex=str.indexOf("t");
		System.out.println(firstIndex);
		
		int secondIndex=str.indexOf("t", firstIndex+1);
		System.out.println(secondIndex);
		
		String replacedString=str.replace("Testing", "Training");
		System.out.println(replacedString);
		
	    int thirdIndex=str.indexOf("t", secondIndex+1);
	    System.out.println(thirdIndex);
	     
	    int fourthIndex= str.indexOf("i");
	    System.out.println(fourthIndex);
	    
	    int fifthIndex= str.indexOf("i", fourthIndex+1);
	    System.out.println(fifthIndex);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

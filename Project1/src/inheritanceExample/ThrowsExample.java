package inheritanceExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public void testing() throws Exception {
		// this class is used to point to a file in the computer
		File f = new File("C:\\Users\\S@f'\\Desktop\\abcd.txt");

		// this class is used to read a file
		FileInputStream fis = new FileInputStream(f);
	}

	public static void main(String[] args) throws FileNotFoundException {

	}

}

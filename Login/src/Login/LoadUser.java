package Login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LoadUser{
	{

	try{


		File file = new File("login.txt");
		FileInputStream fileIn = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fileIn));

		String line = null;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();

	}catch(Exception e){
		//error
	}
}
}



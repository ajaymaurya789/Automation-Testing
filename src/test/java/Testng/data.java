package Testng;

import org.testng.annotations.DataProvider;

public class data {
	@DataProvider
	public String[] flipkart() {
		String Data[] = new String[3];
		Data[0] = "Mobile";
		Data[1] = "Laptop";
		Data[2] = "Smart watch";
	
		return Data;
	}
	
	@DataProvider
	public String[] demo() {
		String Data[] = new String[3];
		Data[0] = "Mobile";
		Data[1] = "Mobile";
		Data[2] = "Mobile";
	
		return Data;
	}
	@DataProvider
	public String[][] login(){
		String[][] Data = new String [6][2];
		Data[0][0] = "standard_user";
		Data[0][1] = "secret_sauce";
		
		Data[1][0] = "locked_out_user";
		Data[1][1] = "secret_sauce";
		
		Data[2][0] = "problem_user";
		Data[2][1] = "secret_sauce";
		
		Data[3][0] = "performance_glitch_user";
		Data[3][1] = "secret_sauce";
		
		Data[4][0] = "error_user";
		Data[4][1] = "secret_sauce";
		
		Data[5][0] = "visual_user";
		Data[5][1] = "secret_sauce";
		
		return Data;
		
	}
	

}

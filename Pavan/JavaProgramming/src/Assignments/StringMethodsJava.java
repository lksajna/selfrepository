package Assignments;

public class StringMethodsJava {

	public static void main(String[] args) {
		String str="Welcome to Selenium Automation Training";
		System.out.println(str.length());
		String str1="Trainer name : Pavankumar";
		//System.out.println(str+str1);
		System.out.println(str.concat(str1));
		String str2="    ------Hello----";
		System.out.println(str2.trim());
		System.out.println(str.charAt(6));
		System.out.println(str.contains("Pava"));
		
	}

}

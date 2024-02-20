package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
	//String to Other types
			//String to int
			String a="10";
			String b="20";
			int c=Integer.parseInt(a)+Integer.parseInt(b);
			System.out.println("Sum---> "+c);
		
	//String to Double
		  String s1="10.5";
			String s2="20.6";
			double s=Double.parseDouble(s1)+Double.parseDouble(s2);
			System.out.println("Sum---> "+s);
			
			//String to Boolean
			String str="true";
			boolean b1=Boolean.parseBoolean(str);
			System.out.println(b1);
			
			//String to char ---> Not Possible(Not required at all)
	//Other types	to String	
			int x=10;
			double y=10.2;
			char z='A';
			boolean str11=true;
			String str12=String.valueOf(x);
			System.out.println(str12);
			String str13=String.valueOf(y);
			System.out.println(str13);
			String str14=String.valueOf(z);
			System.out.println(str14);
	}

}

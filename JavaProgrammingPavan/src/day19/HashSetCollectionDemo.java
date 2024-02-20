package day19;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollectionDemo {

	public static void main(String[] args) {
	HashSet mySet = new HashSet();
	//Set myset=new HashSet();
	//HashSet<String> myset=new HashSet<String>();
	mySet.add(100);
	mySet.add(200);
	mySet.add(100);
	mySet.add("");
	mySet.add("");
	mySet.add("hello");
	System.out.println(mySet);//[, 100, 200, hello]
	mySet.remove(100);
	System.out.println(mySet);//[, 200, hello]
	}

}

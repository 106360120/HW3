package test_p36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p36 {
	public static void main(String[] args) throws IOException{
		
		String str = "Hello";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		int len = str.length();
		System.out.println(str+"的第一個字元為"+ch1);
		System.out.println(str+"的第二個字元為"+ch2);
		System.out.println(str+"長度為"+len);
	}
}

package test_p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 {
	public static void main(String[] args) throws IOException{
		System.out.println("請輸入一個整數");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("你輸入的數字為"+num);
	}
}

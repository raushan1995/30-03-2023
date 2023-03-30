package com.cg;

import java.util.Scanner;

public class PeterLuckyString {

	public static int checkString(String s) {
		String name;
		int sum=0;
		int len;   //length
		int i;
		name=s;
		len=name.length();  //to name length
		for(i=0;i<len;i++)
		{
			sum=sum+name.codePointAt(i);
		}
		if(sum%2==0)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		int c;
		String s;
		System.out.println("Input String");
		Scanner p=new Scanner(System.in);   //create a object and save in p variable
		s=p.next();        //for next char
		c=checkString(s);   //for checking string and save in c variable
		if(c==1)
            System.out.println("Yes");
		else
			System.out.println("No");
	}
}

package String;

import java.util.Scanner;

public class userdefinemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sk=new Scanner(System.in);
        System.out.println("enter the firstnumber");
        int num1=sk.nextInt();
        System.out.println("enter the secondnumber");
        int num2=sk.nextInt();
        System.out.println("enter the thirdnumber");
        int num = sk.nextInt();
        SubractionOfThreeNumbers(num1,num2,num);
        
	}
	
  static void SubractionOfThreeNumbers(int num1, int num2, int num)
	{
		int X =num1*num2*num;
		System.out.println("addition output is = " + X);
	}

}

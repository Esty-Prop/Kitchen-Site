package java_my;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int X=2,Y=0,Z=0;
		Y=4*X++;
		Z=Y/X;
		Y=++X*5;
		Z=--Y%X;
		Y+=X*2;
		Z=2*Y--+--X;
			System.out.println(X+" Y"+Y+" Z"+Z);
			

	}

}

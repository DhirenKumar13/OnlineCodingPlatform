package org.basic.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicIfElse {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int num = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        boolean isEven = (num %2 == 0);
        
        if(isEven) {
        	
        	if( (2 <= num) && (num <= 5)) {
        		System.out.println("Not Weird");
        	} else if ( (2 <= num) && (num <= 5)) {
        		System.out.println("Weird");
        	} else if (num > 20){
        		System.out.println("Not Weird");
        	} else {
        		System.out.println("Weird");
        	}
        	
        }else {
        	System.out.println("Weird");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        scanner.close();
	}

}

package main;

import java.util.Scanner;

import test1.Test;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Test mm = new Test();
		mm.showHello(input.next());
		
	}
}

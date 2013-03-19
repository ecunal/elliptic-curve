package com.ecem.ecc;

public class Main {
	
	public static void main(String[] args) {
		Protocol pr = new Protocol(2, 3, 5);
		Point r = pr.addition(new Point(1, 4), new Point(3, 1));
		
		System.out.println(r.x + ", " + r.y);
	}
}

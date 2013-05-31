package com.ecem.ecc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Take home

		Protocol curve = new Protocol(2618, 25689, 32719);

		ArrayList<Point> all = curve.findAllPoints();

		System.out.println("Curve 1\n\nNumber of points: " + all.size());

		ArrayList<Integer> orders = new ArrayList<Integer>();
		System.out.println("Sample points and their orders:");
		
		for (Point p : all) {
			
			int order = curve.findOrder(p);

			if (!orders.contains(order)) {
				orders.add(order);
				System.out.println("(" + p.x + ", " + p.y + ")" + "\tOrder: "
						+ order);
			}
		}
		
		System.out.println("The end");

		// Protocol curve1 = new Protocol(1769, 23483, 32719);
		// Protocol curve2 = new Protocol(2073, 7227, 32719);
		// Protocol curve3 = new Protocol(3314, 28439, 32719);
		//
		// // CURVE 1
		//
		// ArrayList<Point> all = curve1.findAllPoints();
		//
		// System.out.println("Curve 1\n\nNumber of points: " + all.size());
		// System.out.println("Sample points and their orders:");
		// int i = 0;
		// for (Point p : all) {
		// System.out.println("(" + p.x + ", " + p.y + ")" + "\tOrder: "
		// + curve1.findOrder(p));
		// if (i++ > 5)
		// break;
		// }
		//
		// // CURVE 2
		//
		// all = curve2.findAllPoints();
		//
		// System.out.println("\n\nCurve 2\n\nNumber of points: " + all.size());
		// System.out.println("Sample points and their orders:");
		// i = 0;
		// for (Point p : all) {
		// System.out.println("(" + p.x + ", " + p.y + ")" + "\tOrder: "
		// + curve2.findOrder(p));
		// if (i++ > 10)
		// break;
		// }
		//
		// // CURVE 3
		//
		// all = curve3.findAllPoints();
		//
		// System.out.println("\n\nCurve 3\n\nNumber of points: " + all.size());
		// System.out.println("Sample points and their orders:");
		// i = 0;
		// for (Point p : all) {
		// System.out.println("(" + p.x + ", " + p.y + ")" + "\tOrder: "
		// + curve3.findOrder(p));
		// if (i++ > 10)
		// break;
		// }
	}
}

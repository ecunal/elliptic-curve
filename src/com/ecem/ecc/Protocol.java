package com.ecem.ecc;

public class Protocol {

	// Curves of form y^2 = x^3 + ax + b mod p

	public int a, b, modp;

	public Protocol(int a, int b, int p) {
		this.a = a;
		this.b = b;
		modp = p;
	}

	public Point addition(Point p, Point q) {

		int delta;

		// Addition
		if (!p.equals(q)) {

			delta = (p.y - q.y + modp) % modp;
			
			delta = (modInverse((p.x - q.x + modp) % modp) * delta) % modp;

		} else { // Doubling

			delta = ((3 * p.x * p.x + a) * modInverse(2 * p.y)) % modp;
		}
		
		int xr = (delta * delta - (p.x + q.x) + modp) % modp;
		int yr = (delta * (p.x - xr) - p.y + modp) % modp;

		return new Point(xr, yr);
	}

	public int modInverse(int a) {
		return (int) Math.pow(a, modp-2) % modp;
	}
}

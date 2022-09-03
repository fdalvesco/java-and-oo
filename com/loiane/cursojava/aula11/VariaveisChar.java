package com.loiane.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		// char o = 'o';
		// char i = 'i';

		// System.out.println(o + i); // o+i= 216
		// System.out.println("" + o + i); // o+i= oi

		char o = 111;
		char i = 105;
		char interrogacao = 0x003F; // valor de '?'
		System.out.println(o + i); // o+i = 216
		System.out.println("" + o + i + interrogacao); // o+i+interrogacao = oi?

	}

}

package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("data.txt");
		out.println("Hank大大\t1\t1000");
		out.flush();
		out.close();
	}

}

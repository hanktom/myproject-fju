package com.tom.oo;

public class Student {
	int english;
	protected int math;
	int chinese;
	String name;
	static int pass = 60;
	public Student(){
		
	}
	
	public Student(String name, int english, int math, int chinese){
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	public Student(String name){
		this.name = name;
	}
	
	public static void method(){
		System.out.println("hello");
	}
	
	public void print(){
		System.out.println(pass);
		System.out.println(english+"\t"+ 
				math+"\t"+chinese);
	}
	
	public int getAverage(){
		
		return (english+math+chinese)/3;
	}
}

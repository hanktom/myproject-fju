package com.tom.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student("王小明", 55, 66, 74);
		Student stu2 = new Student("黃大維", 77, 99, 22);
//		Student stu = new Student("王小明");
//		stu.english = 55;
//		stu.math = 66;
//		stu.chinese = 77;
		stu1.pass = 50;
		stu1.print();
		stu2.print();
		int avg = stu1.getAverage();
		System.out.println(stu1.name+":" + avg);
		Student.method();
		GraduateStudent gstu = new GraduateStudent();
		gstu.print();
	}

}

package com.tom.oo;

public class GraduateStudent extends Student{
	int thesis;
	public GraduateStudent(){
		
	}
	
	@Override
	public void print(){
		System.out.println(pass);
		System.out.println(english+"\t"+ 
				math+"\t"+chinese +"\t" + thesis);
	}
	
	@Override
	public int getAverage(){
		return (english+math+chinese+thesis)/4;
	}
}

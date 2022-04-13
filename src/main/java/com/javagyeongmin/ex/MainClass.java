package com.javagyeongmin.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("이름 :" + student1.getName());
		System.out.println("나이 :" + student1.getAge());
		System.out.println("--------------------------");
		
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("이순신");
		student2.setAge(50);
		
		System.out.println("이름 :" + student1.getName());
		System.out.println("나이 :" + student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("같은 객체다");
		} else {
			System.out.println("다른 객체다");
		}
		
		ctx.close();
	}

}
package com.javagyeongmin.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("�̸� :" + student1.getName());
		System.out.println("���� :" + student1.getAge());
		System.out.println("--------------------------");
		
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("�̼���");
		student2.setAge(50);
		
		System.out.println("�̸� :" + student1.getName());
		System.out.println("���� :" + student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("���� ��ü��");
		} else {
			System.out.println("�ٸ� ��ü��");
		}
		
		ctx.close();
	}

}
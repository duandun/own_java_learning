package com.cr.cloneclass;

class Student implements Cloneable{

	private int number;
	
	public int getNumber(){
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public Object clone() {
		Student stu = null;
		try {
			stu = (Student)super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return stu;
	}
}

public class TestClone {
	public static void main(String[] agrs) {
		
		Student stu1 = new Student();
		stu1.setNumber(12345);
		Student stu2 = (Student)stu1.clone();
		
		System.out.println("ѧ��1: " + stu1.getNumber());
		System.out.println("ѧ��2��" + stu2.getNumber());
		
		stu2.setNumber(54321);
		
		System.out.println("ѧ��1: " + stu1.getNumber());
		System.out.println("ѧ��2��" + stu2.getNumber());
	}
}

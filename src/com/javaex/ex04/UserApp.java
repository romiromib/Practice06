package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] userArray = new User[3];
		
		
		 User c01 = new Customer("jws","j1234","정우성",1000);
		 User c02 = new Customer("yjs","y2345","이효리",2000);
		 
		 User e01 = new Employee("master","m7788","운영자",5000000);
		 
		 userArray[0] = c01;
		 userArray[1] = c02;
		 userArray[2] = e01;
		 

		 for(int i=0;i<userArray.length;i++) {
			 userArray[i].showInfo();
		 }
		 
		 System.out.println("운영자의 원급은 5000000원 입니다.");
		 
	}

}

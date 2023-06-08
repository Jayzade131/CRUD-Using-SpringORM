package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("start process...");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		boolean pin = true;
		while (pin) {
			System.out.println("Press 1 for add new Student");
			System.out.println("Press 2 for display all Students");
			System.out.println("Press 3 for get detail of single Student");
			System.out.println("Press 4 for delete Student");
			System.out.println("Press 5 for Update Student");
			System.out.println("Press 6 for Exit");

			try {
				int input =Integer.parseInt(br.readLine());
				switch (input) {
				case 1: // add
					
					System.out.println("enter the Student ID :");
					int sId=Integer.parseInt(br.readLine());
					
					System.out.println("enter the Student name :");
					String sName=br.readLine();
					
					System.out.println("enter the Student city :");
					String sCity=br.readLine();
					Student s=new Student();
					s.setId(sId);
					s.setName(sName);
					s.setCity(sCity);
					int r=studentDao.insert(s);
					System.out.println(r+" Added");
					System.out.println("***************************************");
					System.out.println("");
					
					

					break;

				case 2: // display all
					
					List<Student> showAllStudent = studentDao.showAllStudent();
					for (Student st : showAllStudent) {
						System.out.println("Name : "+st.getName());
						System.out.println("ID : "+st.getId());
						System.out.println("City : "+st.getCity());
						System.out.println("----------------------------------");
						System.out.println("");
					}

					break;

				case 3: // display single
					System.out.println("Enter the student ID for display :");
					int uid=Integer.parseInt(br.readLine());
				   Student show = studentDao.showStudent(uid);
				   System.out.println("Name : "+show.getName());
					System.out.println("ID : "+show.getId());
					System.out.println("City : "+show.getCity());
					System.out.println("----------------------------------");
					System.out.println("");
				   	
					break;

				case 4: // delete
					System.out.println("Enter the Id for deleting Student detail");
					int idd=Integer.parseInt(br.readLine());
					  studentDao.deleteStudent(idd);
					System.out.println("Student Deatil deleted");
					System.out.println("---------------------------------------");
					System.out.println("");
					break;

				case 5: // update
					System.out.println("Enter the deatil for updating :");
					System.out.println("enter the new Student ID :");
					int sId1=Integer.parseInt(br.readLine());
					
					System.out.println("enter the  new Student name :");
					String sName1=br.readLine();
					
					System.out.println("enter the new Student city :");
					String sCity1=br.readLine();

					Student st1=new Student();
					st1.setId(sId1);
					st1.setName(sName1);
					st1.setCity(sCity1);
					studentDao.UpdateStudent(st1);
					System.out.println("Student detail updated");
					System.out.println("-----------------------------------");
					
					break;

				case 6: // exit
					pin = false;
					
					break;

				}

			} catch (Exception e) {
				System.out.println("invalid input try with another one");
				System.out.println(e.getMessage());
			}
			System.out.println("Thanku .....BYE BYE");

		}

	}

	private static String nextL() {
		// TODO Auto-generated method stub
		return null;
	}
}

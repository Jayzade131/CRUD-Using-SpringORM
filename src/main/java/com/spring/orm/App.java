package com.spring.orm;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
				int input = sc.nextInt();
				switch (input) {
				case 1: // add

					break;

				case 2: // display all

					break;

				case 3: // display single

					break;

				case 4: // delete

					break;

				case 5: // update

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
}

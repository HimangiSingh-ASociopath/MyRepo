package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.aop.Performer;


public class Client {






public static void main(String[] args) {
//spring container initialization
ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
/* //getting beans
Employee e = (Employee)context.getBean("emp");//bean is ready to process now
//invoking business logic
//System.out.println(e.toString()); 
//System.out.println("in client add employee flow");
//service.addEmployee(e);
service.getAllEmployees();
System.out.println("Done retrieving Employee");
//for(Employee E...args........)
*/
Performer p =(Performer) context.getBean("performer");
try {
p.perform();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

}
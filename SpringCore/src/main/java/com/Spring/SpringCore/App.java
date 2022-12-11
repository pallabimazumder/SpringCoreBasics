package com.Spring.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
//        Car obj = new Car();
//        obj.drive();
//        
//        Bike obj1 = new Bike();
//        obj1.drive();
        
//        Vehicle obj2 = new Car();
//        obj2.drive();
    	
    	 //XML File Based
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	 Vehicle obj = (Vehicle) context.getBean("vehicle");
//    	 obj.drive();
    	 
    	 
    	 //Annotation Base Configuration
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	 Vehicle obj = (Vehicle) context.getBean("car");
//    	 obj.drive();
    	
    	 //Constructor Injection
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Tyre t = (Tyre) context.getBean("tyre");
//    	System.out.println(t);
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Car obj = (Car) context.getBean("car");
    	obj.drive();
    	
    	
    	 
    }
}

/*  
 We can create the obj of Car or Bike or implememts it from Interface Vehicle (Traditional Approach)
 
 But in case of Spring, we can inject dependencies through getBean which can be 
 imported either from BeanFactory or ApplicationContext which again
 under spring framework.
 
 For small applications, BeanFactory
 For interprise applications, ApplicationContext
 Application Context is superset of BeanFactory
 */

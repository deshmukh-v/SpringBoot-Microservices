package com.deshmukh;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.deshmukh.entity.Emp21;
import com.deshmukh.repository.Emp21Repository;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class ,args);
		
		Emp21Repository emp=context.getBean(Emp21Repository.class);
	/*	
	/*	
	
		Emp21 employee=new Emp21();
		
		employee.setId(103);
		employee.setName("Sham sundar");
		employee.setMobileno(23278488);
		employee.setSalary(2200);
		
		System.out.println("Data inserted in tableeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	/////////////////////////////////SAVE()/////////////////////////////////	
	    emp.save(employee);  //SAVE() IS CALLED AS UPSERT()===(UPDATE + INSERT )
	    
	    */
 
		
////////////////////////////////////////////////////////////////////////////////////	
	    //////////////////////findById()  using toString()///////////////////////////////
		
		//
	

	    Optional <Emp21> optional =emp.findById(101);        //Optional is a return type of findById()
	    
	    
	   if(optional.isPresent()) {
		   System.out.println(optional.get());
		   
	   }
	   
	   
	   Optional<Emp21>find=emp.findById(102);
	   System.out.println(find.get());
	   
	    ///////////////////////////////////////////////
		/*
	########################   FINDALL()===>  (return type Iterable) ############################	
/*		Iterable <Emp21>findAll=emp.findAll();
		
		findAll.forEach(System.out::println);
	    
	    */
	/*   
	   Iterable<Emp21> find1=emp.findAll();         //return type Iterable
	   
	//   find1.forEach(System.out::println);
	   
	   find1.forEach(s -> System.out.println(s));
		*/
//	   #############################################################################
	   
	   ///////////////        deleteById()       ///////
                  
               emp.deleteById(103);
System.out.println("Id =103 is deleted..............");

/////////////////////////////////////////////////////////////////////
////////////////////    COUNT()   ///////////////////////////

                    long count =emp.count();              //count() with return type is long
                    
                    System.out.println("How many record in table...."+count);

	}

}

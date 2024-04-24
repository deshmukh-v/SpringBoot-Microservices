package com.deshmukh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.deshmukh.entity.Student31;
import com.deshmukh.student31Repository.Student31Repository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	//	SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		
		Student31Repository student= context.getBean(Student31Repository.class);
		
		
	//	Student31 stu= new Student31(); 
	/*	
		stu.setId(101);
		stu.setName("Ram");
		stu.setAdharno(221464150);
		stu.setMobileno(983418151);
		
		
		student.save(stu);
		
		System.out.println("Data inserted on tableeeeeeeeeeeeeeeeeeeeeeee");
		
		*/
		
	//	################################   I WANT TO INSERT MULTIPLE RECORD AT A TIME  #####################################
	//	                                 FIND BYXXX METHOD IN DATA JPA
		
		Student31 stu= new Student31(102,"SHAM",38682322,12345678); 
		Student31 stu1= new Student31(103,"SHIV",38682322,12245678); 
		Student31 stu2= new Student31(104,"Nagesh",38682322,12245678); 

		

		student.save(stu);
		student.save(stu1);
		student.save(stu2);
		
		
		System.out.println("Data inserted on tableeeeeeeeeeeeeeeeeeeeeeee");
		
		Student31 s1= new Student31(105,"shantanu",38682322,12345678); 
		Student31 s2= new Student31(106,"Sai",38682322,12245678); 
		Student31 s3= new Student31(107,"Atish",38682322,12245678); 


		List<Student31>data=Arrays.asList(s1,s2,s3);             //return type is List
		
		student.saveAll(data);
		
		
		System.out.println("data inserted using saveAll");
		//****************************************         findAll()                    ******************************************************************
		
		Iterable<Student31>finddata=student.findAll();
		
		finddata.forEach(System.out::println);
		
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&    findById()  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
		
		Optional<Student31>findbyid=student.findById(103);
		System.out.println(findbyid.get());
		
		
	}

}

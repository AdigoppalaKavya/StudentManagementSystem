package student_management_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Management 
{
    Scanner sc=new Scanner(System.in);
    private List<Student> list=new ArrayList<>();
    public boolean login()
    {
    	System.out.println("Enter 10 Digit Mobile Number");
    	long mobileNumber=sc.nextLong();
    	boolean status=false;
    	if(mobileNumber>=6000000000l && mobileNumber<=9999999999l)
    	{
    		int generatedOTP=generateOTP();
    		System.out.println("\u001B[1m"+"\u001B[32m"+"Your OTP:"+generatedOTP+"\u001B[0m");
    		System.out.println("Enter the OTP");
    		int enteredOTP=sc.nextInt();
    		if(enteredOTP==generatedOTP)
    		{
    		   System.out.println("\u001B[1m"+"\u001B[31m"+"Login Successful...👍👍"+"\u001B[0m");
  			   status=true;
  		    }
  		    else
  		    {
  			   System.out.println("Invalid OTP...✖️✖️");
  			   System.out.println("Please Try Again..");
  		    }	   			
    	}
    	else
    	{
    	   System.out.println("\u001B[1m"+"\u001B[31m"+"Invalid Mobile Number..✖️✖️"+"\u001B[0m");
  		   System.out.println("Mobile Number Must Contain 10 Digits");
    	}
    	return status;
    }
    public int generateOTP()
    {
    	Random random=new Random();
    	int otp=random.nextInt(1000,9999);
    	return otp;  	
    }
    public int details()
    {
    	System.out.println("\u001B[1m"+"\u001B[34m"+"1.Add a Student");
    	System.out.println("2.Remove a Student");
    	System.out.println("3.Update the Student Details");
    	System.out.println("4.Display all Students");
    	System.out.println("5.Search a student");
    	System.out.println("6.Exit"+"\u001B[0m");
    	int choice=sc.nextInt();
    	return choice;  	
    }
    public void addStudent()
    {
    	
    	System.out.println("Enter the Student Id");
    	int studentId=sc.nextInt();
    	System.out.println("Enter the Student name");
    	String studentName=sc.next();
    	System.out.println("Enter the Student Mobile Number");
    	long studentMobileNumber=sc.nextLong();
    	System.out.println("Enter the Student age");
    	int studentAge=sc.nextInt();
    	System.out.println("Enter the Student Degree");
    	String studentDegree=sc.next();
    	System.out.println("Enter Student Stream");
    	String studentStream=sc.next();
    	list.add(new Student(studentId,studentName,studentMobileNumber,studentAge,studentDegree,studentStream));
    	System.out.println("\u001B[1m"+"\u001B[32m"+"Student added Successfully..👍👍"+"\u001B[0m");   
    }
    public void displayStudents()
    {
    	System.out.println("\u001B[1m"+"\u001B[34m");
        System.out.printf("%64s","-|JSP STUDENTS |-");
     	System.out.println("\u001B[0m");
     	System.out.println("\u001B[1m"+"\u001B[31m"+"--------------|-------------------|-----------------------|-------------------|-------------------|-------------------|"+"\u001B[0m"+"\u001B[1m");
      	System.out.printf("%-15s %-20s %-25s %-18s %-20s %-18s","Student ID","Student Name","Student MobileNumber","Student Age","Student Degree","Student Stream");
      	System.out.println();
      	System.out.println("\u001B[1m"+"\u001B[31m"+"--------------|-------------------|-----------------------|-------------------|-------------------|-------------------|"+"\u001B[0m");
  	    for(Student student:list)
  	    {
  		  System.out.printf("%-18d %-18s %-22d %-20d %-20s %-18s",student.getStudentId(),student.getStudentName(),student.getMobileNumber(),student.getAge(),student.getDegree(),student.getStream()); 
  		  System.out.println();
  		  System.out.println("\u001B[1m"+"\u001B[31m"+"--------------|-------------------|-----------------------|-------------------|-------------------|-------------------|"+"\u001B[0m");
  	    }
    }
    public void removeStudent()
    {
    	System.out.println("Enter the Student Name");
    	String studentName=sc.next();
    	System.out.println("Enter the Student Id");
    	int id=sc.nextInt();
    	System.out.println("Enter Student Stream");
    	String stream=sc.next();
    	Iterator<Student> studentIterator=list.iterator();
    	boolean status=false;
    	while(studentIterator.hasNext())
    	{
    		Student student=studentIterator.next();
    		if(student.getStudentName().equalsIgnoreCase(studentName) && student.getStudentId()==id && student.getStream().equalsIgnoreCase(stream))
    		{
    			studentIterator.remove();
    			status=true;
    			break;
    		}
    	}
    	if(status)
    	{
  		  System.out.println("\u001B[32m"+"Student Removed Successfully...👍👍👍"+"\u001B[0m");
  	    }
  	    else
  	    {
  		  System.out.println("\u001B[1m"+"\u001B[31m"+"Student not found for the entered Details.."+"\u001B[0m");
  	    }	
    }
    public void upadteStudentMobileNumber()
    {
    	System.out.println("Enter the Student ID");
    	int studentID=sc.nextInt();
    	System.out.println("Enter Student Degree");
    	String studentDegree=sc.next();
    	boolean status=false;
    	for(Student student:list)
    	{
    		if(student.getStudentId()==studentID && student.getDegree().equalsIgnoreCase(studentDegree))
    		{
    		   System.out.println("\u001B[32m"+"Student Present"+"\u001B[0m");
  			   System.out.println("Enter student New MobileNumber");
  			   long newMobileNumber=sc.nextLong();
  			   student.setMobileNumber(newMobileNumber);
  			   status=true;
  			   System.out.println("\u001B[1m"+"\u001B[32m"+"Student MobileNumber Updated Successfully..👍👍"+"\u001B[0m");
			   System.out.println(student);
			   break;	   
    		}
    	}
    	if(!status) 
  	    {
  		   System.out.println("\u001B[1m"+"\u001B[31m"+"Student not found for the Entered Details..."+"\u001B[0m");
  	    }
    }
    public void studentSearch()
    {
 	   System.out.println("Enter Student Age");
 	   int studentAge=sc.nextInt();
 	   System.out.println("Enter the Student Stream");
 	   String studentStream=sc.next();
 	   boolean status=false;
 	   for(Student student:list)
 	   {
 		   if(student.getAge()==studentAge && student.getStream().equalsIgnoreCase(studentStream))
 		   {
 			   System.out.println("\u001B[1m"+"\u001B[32m"+"Student Present"+"\u001B[0m");
 			   status=true;
 			   System.out.println(student);
 			   break;
 		   }
 	   }
 	   if(!status) 
 	   {
 		   System.out.println("\u001B[1m"+"\u001B[31m"+"Student not found for the Entered Details..."+"\u001B[0m");
 	   }	      
    }
    public void animateString(String string) throws InterruptedException
    {
 	   for(int i=0;i<string.length();i++)
 	   {
 		   System.out.print("\u001B[1m"+"\u001B[35m"+string.charAt(i)+"\u001B[0m");
 		   Thread.sleep(100);
 	   }
 	   System.out.println();
 		
    }
    		
}

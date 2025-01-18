package student_management_system;

public class StudentManagementSystem 
{
//Main Class
	public static void main(String[] args) throws InterruptedException 
	{
		Management management=new Management();
		management.animateString("Welcome to JSP Students");
		management.animateString("Login to the Application");
		boolean status=management.login();
		if(status)
		{
			while(true)
			{
				int choice=management.details();
				switch(choice)
				{
				  case 1:management.addStudent();
					     break;
				  case 2:management.removeStudent();
					     break;
				  case 3:management.upadteStudentMobileNumber();
					     break;
				  case 4:management.displayStudents();
					     break;
				  case 5:management.studentSearch();
					     break;
				  case 6:System.exit(0);
					     break;
				}
			}
		}

	}

}

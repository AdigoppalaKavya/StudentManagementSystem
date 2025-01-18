package student_management_system;

public class Student 
{
   private int studentId;
   private String studentName;
   private long mobileNumber;
   private int age;
   private String degree;
   private String stream;
   public Student(int studentId,String studentName, long mobileNumber, int age, String degree, String stream) {	
	this.studentId = studentId;
	this.studentName = studentName;
	this.mobileNumber = mobileNumber;
	this.age = age;
	this.degree = degree;
 	this.stream = stream;
   }
   @Override
   public String toString() 
   {
	 return "Student [studentName=" + studentName + ", studentId=" + studentId + ", mobileNumber=" + mobileNumber
			+ ", age=" + age + ", degree=" + degree + ", stream=" + stream + "]";
   }
   public String getStudentName() {
   	return studentName;
   }
   public void setStudentName(String studentName) {
   	this.studentName = studentName;
   }
   public int getStudentId() {
   	return studentId;
   }
   public void setStudentId(int studentId) {
   	this.studentId = studentId;
   }
   public long getMobileNumber() {
   	return mobileNumber;
   }
   public void setMobileNumber(long mobileNumber) {
   	this.mobileNumber = mobileNumber;
   }
   public int getAge() {
   	return age;
   }
   public void setAge(int age) {
   	this.age = age;
   }
   public String getDegree() {
   	return degree;
   }
   public void setDegree(String degree) {
   	this.degree = degree;
   }
   public String getStream() {
   	return stream;
   }
   public void setStream(String stream) {
   	this.stream = stream;
   }
   
   
}

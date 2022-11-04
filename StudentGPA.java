
public class StudentGPA {
private String name;
private int age;
private String major;
private String hobby;
private double gpa;
private int time_spent;
//StudentGPA()
public StudentGPA()
{
this.name="";
this.gpa=0;
this.major="";
this.hobby="";
this.gpa=0;
this.time_spent=0;
}
public StudentGPA(String name, int age, String major, String hobby, double gpa, int time_spent) {
	this.name=name;
	this.age=age;
	this.major=major;
	this.hobby=hobby;
	this.gpa=gpa;
	this.time_spent=time_spent;
}
//StudentGPA(String name, etc)
		//Getter
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getMajor() {
	return major;
}
public String getHobby() {
	return hobby;
}
public double getGpa() {
	return gpa;
}
public int getTime_spent() {
	return time_spent;
}
		//Setter
public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}
public void setMajor(String major) {
	this.major=major;
}
public void setHobby(String hobby) {
	this.hobby=hobby;
}
public void setGpa(double gpa) {
	this.gpa=gpa;
}
public void setTime_spent(int time_spent) {
	this.time_spent=time_spent;
}
public String HonorsEligible() {
	String Honors;
	if(gpa>=3.5)
		Honors="You are Honors Eligible";
	else
		Honors="You are not Honors Eligible";
	return Honors;
}
public static void main(String[] args) {
StudentGPA student1 = new StudentGPA();
student1.setName("Aung");
student1.setAge(18);
student1.setMajor("CS");
student1.setHobby("Game");
student1.setGpa(3.8);
student1.setTime_spent(3);
System.out.println("Student's honors eligibility check: "+student1.HonorsEligible());

student1.setGpa(3.4);
System.out.println("Student's honors eligibility check after second year: "+student1.HonorsEligible());
}

}

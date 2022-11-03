
public class StudentGPA {
private String name;
private int age;
private String major;
private String hobby;
private double expected_GPA;
private int spent_time_learn_JAVA;

StudentGPA(String name,int age,String major,String hobby, double expected_GPA, int spent_time_learn_JAVA)
{
	this.name=name;
	this.age=age;
	this.major=major;
	this.hobby=hobby;
	this.expected_GPA=expected_GPA;
	this.spent_time_learn_JAVA=spent_time_learn_JAVA;
}
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
public double getExpected_GPA() {
	return expected_GPA;
}
public int getSpent_time_learn_JAVA() {
	return spent_time_learn_JAVA;
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
public void setExpected_GPA(double expected_GPA) {
	this.expected_GPA=expected_GPA;
}
public void setSpent_time_learn_JAVA(int spent_time_learn_JAVA) {
	this.spent_time_learn_JAVA=spent_time_learn_JAVA;
}
public static void main(String[] args) {
StudentGPA HonorsEligible = new StudentGPA("Aung", 20, "CS", "Game", 3.66 , 2);
if(HonorsEligible.expected_GPA>3.5)
{
	System.out.println("Eligible for Honors");
}
else {
	System.out.println("Not eligible");
}
}

}

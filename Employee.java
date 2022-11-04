
public class Employee {
private String firstname;
private String lastname;
private String position;
private double salary;
private double hoursWorked;

public Employee()
{
	this.firstname="";
	this.lastname="";
	this.position="";
	this.salary=8.25;
	this.hoursWorked=0;
}
public Employee(String firstname,String lastname,String position,double salary,double hoursWorked)
{
	this.firstname=firstname;
	this.lastname=lastname;
	this.position=position;
	this.salary=salary;
	this.hoursWorked=hoursWorked;
}
//Getter
public String getFirstname() {
	return firstname;
}
public String getLastname() {
	return lastname;
}
public String getPosition() {
	return position;
}
public double getSalary() {
	return salary;
}
public double getHoursWorked() {
	return hoursWorked;
}
//Setter
public void setFirstname(String firstname) {
	this.firstname=firstname;
}
public void setLastname(String lastname) {
	this.lastname=lastname;
}
public void setPosition(String position) {
	this.position=position;
}
public void setSalary(double salary) {
	this.salary=salary;
}
public void setHoursWorked(double hoursWorked) {
	this.hoursWorked=hoursWorked;
}
public double showCurrentPay(){
	double pay=0.0;
	if(hoursWorked<=40)
		pay = hoursWorked*salary;
	else {
	double overtime = hoursWorked-40;
	pay=(40.0 * salary)+(overtime*salary*1.5);
	}
	return pay;
}
public String displayPayCheck() {
StringBuilder sb= new StringBuilder();
sb.append("=====" +firstname.toUpperCase()+""+lastname.toUpperCase()+"=====\n");
sb.append("Hours Worked : "+ hoursWorked + "\n");
sb.append("Position :"+position +"\n");
sb.append("Salary : "+salary+"\n");
sb.append("Total Pay: "+this.showCurrentPay() +"\n");

return sb.toString();
 
}
public static void main(String[] args) {
	Employee worker1 = new Employee("John", "Doe", "The Boss", 20.00, 30);
	System.out.println(worker1.displayPayCheck());
	Employee worker2 = new Employee("Harry", "Potter", "Wizard", 20.00, 50);
	System.out.println(worker2.displayPayCheck());
}
}

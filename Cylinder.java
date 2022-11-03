public class Cylinder {

private double radius;
private double height;
//Constructor
public Cylinder(double radius, double height) {
	this.radius=radius;
	this.height=height;
}
//Getter
	
public double getRadius() {
	return radius;
}
public double getHeight() {
	return height;
}
//Setter
public void setRadius(double radius) {
		this.radius=radius;
}
public void setHeight(double height) {
	this.height=height;
}
//Main
public double areaCylinder() {
	double area=2*Math.PI*radius*height+2*Math.PI*Math.pow(radius, 2);
	return area;
}
public double volumeCylinder() {
	double volume = Math.PI*Math.pow(radius, 2)*height;
	return volume;
}

public static void main(String[] args) {
Cylinder numb1 = new Cylinder(10,5);
System.out.println("Area of cylinder: "+(numb1.areaCylinder()));
System.out.println("Volume is: "+numb1.volumeCylinder());

}



}

package baitap4;

public class ex4_2_2 extends ex4_2 {
 private String school;
 private double pay;
public ex4_2_2(String name, String address, String school, double pay) {
	super(name, address);
	this.school = school;
	this.pay = pay;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public double getPay() {
	return pay;
}
public void setPay(double pay) {
	this.pay = pay;
}
 @Override
 public String toString() {
	 return " ex4_2_2["
			 + super.toString()
			 + ", school= " + school
			 + ", pay=  " + pay 
			 +"]";
 }
}

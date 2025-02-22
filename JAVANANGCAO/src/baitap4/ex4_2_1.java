package baitap4;

public class ex4_2_1 extends ex4_2 {
 private String program;
 private int year;
 private double fee;
public ex4_2_1(String name, String address, String program, int year, double fee) {
	super(name, address);
	this.program = program;
	this.year = year;
	this.fee = fee;
}
public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program = program;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
 public String toString() {
	 return "ex4_2_1[" 
			 + super.toString()
			  + ", program=" + program
              + ", year=" + year
              + ", fee=" + fee
              + "]"; 
 }
}

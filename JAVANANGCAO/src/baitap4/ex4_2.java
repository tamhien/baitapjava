package baitap4;

public class ex4_2 {
private String name;
private String address;
public ex4_2(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getName() {
	return name;
}
public String toString() {
	return "ex4_2[name= " + name + ", address= " + address +"]";
}
}

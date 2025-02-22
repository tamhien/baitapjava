package baitap2;

public class Customer24 {
private int id;
private String name;
private int discount;
public Customer24(int id, String name, int discount) {
	super();
	this.id = id;
	this.name = name;
	this.discount = discount;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public String toString() {
    return name + "(" + id + ")(" + discount + "%)";
}
}

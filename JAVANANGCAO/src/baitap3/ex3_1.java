package baitap3;
class Ex3_1 {
    private double real = 0.0;
    private double imag = 0.0;

    // Constructors
    public Ex3_1() {
    }

    public Ex3_1(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters and Setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Methods
    public boolean isReal() {
        return imag == 0.0;
    }

    public boolean isImaginary() {
        return real == 0.0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(Ex3_1 another) {
        return this.real == another.real && this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public Ex3_1 addInto(Ex3_1 right) {
        this.real += right.real;
        this.imag += right.imag;
        return this; // Trả về chính đối tượng hiện tại
    }

    public Ex3_1 addNew(Ex3_1 right) {
        return new Ex3_1(this.real + right.real, this.imag + right.imag);
    }

    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }

    // Main method for testing
    public static void main(String[] args) {
        Ex3_1 c1 = new Ex3_1(3.1, 4.0);
        Ex3_1 c2 = new Ex3_1(1.2, 2.3);
        
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        
        System.out.println("Is c1 real? " + c1.isReal());
        System.out.println("Is c1 imaginary? " + c1.isImaginary());

        System.out.println("Magnitude of c1: " + c1.magnitude());

        Ex3_1 c3 = c1.addNew(c2);
        System.out.println("c1 + c2 = " + c3);

        c1.addInto(c2);
        System.out.println("c1 after addInto c2: " + c1);
    }
}


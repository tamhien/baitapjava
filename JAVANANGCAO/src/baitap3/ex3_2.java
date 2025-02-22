package baitap3;

import java.util.Arrays;

class Ex3_2 {
    private double[] coeffs; // Mảng chứa các hệ số của đa thức

    // Constructor
    public Ex3_2(double... coeffs) {
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }

    // Trả về bậc của đa thức (chỉ số cao nhất của hệ số không phải 0)
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Đánh giá giá trị của đa thức tại x
    public double evaluate(double x) {
        double result = 0;
        double power = 1; // x^0 ban đầu = 1
        for (double coeff : coeffs) {
            result += coeff * power;
            power *= x; // Nhân thêm x để tính lũy thừa tiếp theo
        }
        return result;
    }

    // Cộng hai đa thức
    public Ex3_2 add(Ex3_2 right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            newCoeffs[i] += this.coeffs[i];
        }
        for (int i = 0; i <= right.getDegree(); i++) {
            newCoeffs[i] += right.coeffs[i];
        }

        return new Ex3_2(newCoeffs);
    }

    // Nhân hai đa thức
    public Ex3_2 multiply(Ex3_2 right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new Ex3_2(newCoeffs);
    }

    // Chuyển đa thức thành chuỗi dạng c_n*x^n + ... + c1*x + c0
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) sb.append(" + ");
                sb.append(coeffs[i]);
                if (i > 0) sb.append("x^").append(i);
            }
        }
        return sb.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        Ex3_2 poly1 = new Ex3_2(1, 2, 3); // 3x^2 + 2x + 1
        Ex3_2 poly2 = new Ex3_2(2, 1, 0, 4); // 4x^3 + x + 2

        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);

        System.out.println("Degree of poly1: " + poly1.getDegree());

        double x = 2;
        System.out.println("poly1 evaluated at x=" + x + ": " + poly1.evaluate(x));

        Ex3_2 sum = poly1.add(poly2);
        System.out.println("Sum: " + sum);

        Ex3_2 product = poly1.multiply(poly2);
        System.out.println("Product: " + product);
    }
}

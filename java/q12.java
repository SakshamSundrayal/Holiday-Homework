// WAP using a function called area to compute the area of the following:
// 1)- circle   2)- square  3)- rectangle


public class q12 {
    // Function for Area of Circle
    // Taking Radius as Parameter
    static double area(int r) {
        return Math.PI * Math.pow(r,2);
    }
    // Function for Area of Square
    // Taking Side as Parameter
    static int area(double s) {
        return (int) Math.pow(s, 2);
    }
    // Function for Area of Rectangle
    // Taking Length and Breadth as Parameter
    static int area(int l, int b) {
        return l * b;
    }
    
    public static void main(String[] args) {
        int radius = 10;
        double side = 12;
        int length = 5;
        int breadth = 3;
        
        System.out.println("Area of Circle : " + area(radius));
        System.out.println("Area of Square : " + area(side));
        System.out.println("Area of Rectangle : " + area(length, breadth));
    }
}
package by.bsu.triangle;

public class TriangleChecker {
    public static void main(String[] args) {
        System.out.println("Hello i am TriangleChecker");
    }

    public static boolean check(double a, double b, double c){
        if ( a > 0 && b > 0 && c > 0){
            return a + b > c && a + c > b && b + c > a;
        }
        else{
            return false;
        }
    }
}

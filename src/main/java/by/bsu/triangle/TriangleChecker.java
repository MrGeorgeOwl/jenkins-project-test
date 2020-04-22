package by.bsu.triangle;

public class TriangleChecker {
    public static void main(String[] args) {
        System.out.println("Hello i am TriangleChecker");
    }

    public static boolean check(double[] sides){
        if ( sides[0] > 0 && sides[1] > 0 && sides[2] > 0){
            return sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] && sides[1] + sides[2] > sides[0];
        }
        else{
            return false;
        }
    }
}

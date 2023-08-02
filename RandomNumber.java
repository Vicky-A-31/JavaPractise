
import java.lang.Math;
public class RandomNumber {
    public static void main(String[] args) {
        // Math.random()*(max - min + 1) + min
        int max = 400, min = 200;
        double n = Math.random()*(max - min + 1) + min;
        int num = (int) n;
        
        System.out.println("Generate a Random Number between 200 to 400 : "+num);
    }
}

import java.util.*;

public class RSR{
    public static void main(String[] args){
        int number = Integer.parseInt(args[0]);
        ArrayList<Integer> RSR = new ArrayList<Integer>();
        

        for(int n=1; n <= number; n++){
            EuclideanAlgorithm GCD = new EuclideanAlgorithm(n, number);
            if(GCD.GCD() == 1){
                RSR.add(n);
            }
        }
        System.out.println(RSR);
    }
}
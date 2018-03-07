import java.util.*;
//This is a program to determine if something is an Euler probable prime to a certain base.

public class EulerProbablePrime{
    public int m;
    public int base;
    //m is the number in question
    public EulerProbablePrime(int num_m, int num_base){
        this.m = num_m;
        this.base = num_base;
    }
    public int Determine(){
        int left_side = 0;
        int right_side = 0;
        left_side = (int) Math.pow(base, ((m-1)/2));
        Legendre Symbol = new Legendre(base, m);
        right_side = Symbol.Symbol() % m;

        EuclideanAlgorithm GCD = new EuclideanAlgorithm(m, base);
        if(GCD.GCD() == 1){
            if(left_side % m == right_side){
                System.out.println(m + " is a euler probable to base " + base);
                return 1;
            }
            else{
                System.out.println(m + " is not a euler probable to base " + base);
                return 0;
            }
        }
        else{
            System.out.println(m + " is not a euler probable to base " + base);
            return 0;
        }
    }
    public static void main(String[] args){
    int m = Integer.parseInt(args[0]); 
    int base = Integer.parseInt(args[1]);
        EulerProbablePrime det = new EulerProbablePrime(m, base);
        det.Determine();
}
}

    
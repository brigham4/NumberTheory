import java.util.*;
//This is a program to factor a number using Fermat's difference of squares method.
//A user can input a number and recieve its factors. 
//This program should primarily be used for someone wanting to factor a public n into its prime components, p and q.

public class FermatFactorization{
    public int factor_this;
    public FermatFactorization(int number){
        this.factor_this = number;
    }
    public ArrayList<Integer> factors(){
        ArrayList<Integer> p_and_q = new ArrayList<Integer>();
        int x = (int) Math.floor(Math.sqrt(factor_this));
        //System.out.println(x);
        int t = 2*x + 1;
        //System.out.println(t);
        int r = (x*x) - factor_this;
        double sqrt = Math.sqrt(r);
        double mew = sqrt;
        double n = mew % 1;
        n = mew - Math.floor(mew);
        //System.out.println(r);
        //double diff = Math.sqrt(r) -  Math.floor(Math.sqrt(r));
        //System.out.println(diff);
        int p = 0;
        int q = 0;
        int y = 0;
        int count = 0;
        while(Math.pow(sqrt, 2) != Math.pow(mew,2)){
            System.out.println("i am not a square");
            r = r + t;
            mew = r;
            //diff = Math.sqrt(r) -  Math.floor(Math.sqrt(r));
            //System.out.println(r);
            t = t + 2;
            //System.out.println(t);
            count++;
            if(count ==100){
                System.out.println("give up, factor with another method");
                break;
            }
        } 
        
            x = (t-1)/2;
            //System.out.println(x);
            y = (int) Math.floor(Math.sqrt(r));
            System.out.println("found a square");
            p = x - y;
            q = x + y;
            p_and_q.add(p);
            p_and_q.add(q);
            System.out.println("p and q are: " + p_and_q);
        
        return p_and_q;
    }

    public static void main(String[] args){
        int factor_this = Integer.parseInt(args[0]);
        FermatFactorization factor =  new FermatFactorization(factor_this);
        factor.factors();
    }
}
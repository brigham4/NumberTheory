import java.util.*;
//This is a program to compute the Legendre symbol (r/p) when p is an odd prime and r 
//is an integer not divisible by p. 
//As a note, this does not work for particularly large p due to computational constraints.
public class Legendre{
    public int r;
    public int p;
    public Legendre(int num_r, int num_p){
        this.r = num_r;
        this.p = num_p;
    }
    public int Symbol(){
        int euler_out = 0;
        int power = (p-1)/2;
        System.out.println("The exponent is: " + power);
        int rtop = (int) Math.pow(r, power);
        System.out.println("r raised to the p is: " + rtop);
        euler_out = rtop % p;
        System.out.println("The output is: " + euler_out);

        if(euler_out == 1){
            System.out.println("There is a solution.");
            return 1;
        }
        if(euler_out == p-1){
            System.out.println("There is no solution.");
            return 0;
        }
        else{
            System.out.println("Something went wrong here, check source.");
            return -1;
        }
    }
    public static void main(String[] args){
    int num_r = Integer.parseInt(args[0]); 
    int num_p = Integer.parseInt(args[1]);
        Legendre is_solution = new Legendre(num_r, num_p);
        is_solution.Symbol();
}
}
import java.util.*;
//This program will compute the totient of any number

public class Totient{
    public int find_totient;
    public Totient(int num){
        this.find_totient = num;
    }
    public int calculate_totient(){
        RSR set = new RSR(find_totient);
        int tot = set.residues().size();
        System.out.println(tot);
        return tot; 
    }

    public static void main(String[] args){
        int find_totient = Integer.parseInt(args[0]);
        Totient phi = new Totient(find_totient);
        phi.calculate_totient();
    }
}
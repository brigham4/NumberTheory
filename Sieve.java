import java.util.*;

public class Sieve{
    public static void main(String[] args){
    int number = Integer.parseInt(args[0]);
    ArrayList<Integer> full_array = new ArrayList<Integer>();
    int upto = (int) Math.floor(Math.sqrt(number));
    ArrayList<Integer> primes = new ArrayList<Integer>();
    int count = 0;

    for(int n=2; n <= number; n++){
        full_array.add(n);
    }
        for(int n=2; n <= number; n++){
            for(int k = 2; k <= upto; k++){
                    System.out.println("This is n: "+ n);
                    System.out.println("This is k: " + k);
                    System.out.println("n mod k= " + n % k);
                    if(n % k == 0 && n != 2 && n != k){
                        System.out.println("Hey, I'm removing " + full_array.get(n-2 - count));
                        full_array.remove(n-2 - count);
                        count++;
                        break;
                    }
                }
            }
        
        System.out.println(full_array);
    }
}
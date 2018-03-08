import java.util.*;

//This program will take in a number and create a list of number from 1 to that number
//Following that, it will remove all number that are definitely NOT square
//That is not to say that all entries remaining in the lsit are square,
//We are just removing ones that we know are not square
public class FermatSieve{
    public static void main(String[] args){
    int number = Integer.parseInt(args[0]);
    ArrayList<Integer> full_array = new ArrayList<Integer>();
    int count = 0;
    
    for(int n=0; n <= number; n++){
        full_array.add(n);
        //fill an array from 1 to n
        System.out.println(full_array);
    }
    for(int n = 0; n <= full_array.size() + count; n++){
        if(n % 20 == 2 || n % 20 == 3 || n % 20 == 7 || n % 20 == 8 || n % 20 == 11 || n % 20 == 12 || n % 20 == 13 || n % 20 == 14 || n % 20 == 15 || n % 20 == 17 || n % 20 == 18 || n % 20 == 19){
            System.out.println( n + " mod 10 is: " + n % 10 );
            System.out.println("I am going to remove: " + n);
            full_array.remove(n - count);
            count++;
        }
    }
    System.out.println(full_array);

    }

}
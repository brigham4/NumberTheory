//In this program I intend to implement the Euclidean algorithm that can be 
//used for, among other things, finding the greatest common divisor of two integers

//Task: given two integers a and b, find their GCD, g.

//This program allows you to put in your own arguments to the algorithm. This can 
//be accomplished by compiling it then running it and giving it to arguments on the
//command line.

public class EuclideanAlgorithm{
    public int number_a;
    public int number_b;
    public EuclideanAlgorithm(int a, int b){
        this.number_a = a;
        this.number_b = b;
    }
    public int GCD(){
        int previous_residual = 0;
        int residual = 1;
        int gcd = 0;
        int quotient = 0;
    
        if(number_a == number_b){
            gcd = number_a;
            //System.out.println(gcd);
            return gcd;
        }
        
        if(number_a>number_b){
            while(residual != 0){
                quotient = (int) Math.floor(number_a/number_b);
                previous_residual = residual;
                residual = number_a-(quotient*number_b);
                if(residual == 0){
                    //if b is a divisor of a then b is their GCD
                    gcd = number_b;
                    break;
                }
                gcd=previous_residual;
                number_a = number_b;
                number_b = residual;
            }
            //System.out.println(gcd);
            return gcd;
        }
        else{
            while(residual != 0){
                quotient = (int) Math.floor(number_b/number_a);
                previous_residual = residual;
                residual = number_b-(quotient*number_a);
                if(residual == 0){
                    //if a is a divisor of b then a is their GCD
                    gcd = number_a;
                    break;
                }
                gcd=previous_residual;
                number_b = number_a;
                number_a = residual;
            }
            //System.out.println(gcd);
            return gcd;
        }
    }
    public static void main(String[] args){
    int number_a = Integer.parseInt(args[0]); 
    int number_b = Integer.parseInt(args[1]);
        EuclideanAlgorithm find_gcd = new EuclideanAlgorithm(number_a, number_b);
        find_gcd.GCD();
}
}

    
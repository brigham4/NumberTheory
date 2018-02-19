//In this program I intend to implement the an algorithm to find the solutions of 
//a diophantine equation, should one exist. If one does not exist then the program
//will inform the user of such. 

//This program allows you to put in your own arguments to the algorithm. This can 
//be accomplished by compiling it then running it and giving it three arguments 
//on the command line. The first two arguments given to the computer will be the 
//coefficients of the variables and the third will be the sum. 

//Note: I could put the euclidean algorithm into this as a subroutine instead of 
//just using gcd(). For the purposes of this I will asuume that my program for the
//euclidean algorithms has "proven" the existence and validity of gcd()

//Note: This will only find all solution, not all of them, or the general solution.

public class DiophantineEquationSolver{
    public static void main(String[] args){
    int variable_a = Integer.parseInt(args[0]); 
    int variable_b = Integer.parseInt(args[1]);
    int sum = Integer.parseInt(args[3]);
    int sum1 = 0;
    //Grabbing the input from user and assigning them to variables.

    //If the GCD of variable_a and variable_b divides the sum then there is 
    //a solution
    if(sum % gcd(variable_a, variable_b)){
        //this checks whether or not the sum is a multiple of the GCD
        
    }
    else{
        System.out.println("There is no solution to this equation");
        //if the GCD of does not divide the sum then there is no solution. 
    }




    }
}
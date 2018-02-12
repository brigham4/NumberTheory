//In this program I intend to implement the an algorithm to find the solutions of 
//a diophantine equation, should one exist. If one does not exist then the program
//will inform the user of such. 

//This program allows you to put in your own arguments to the algorithm. This can 
//be accomplished by compiling it then running it and giving it three arguments 
//on the command line. The first two arguments given to the computer will be the 
//coefficients of the variables and the third will be the sum. 

public class DiophantineEquationSolver{
    public static void main(String[] args){
    int number_a = Integer.parseInt(args[0]); 
    int number_b = Integer.parseInt(args[1]);
    int previous_residual = 0;
    int residual = 1;
    int gcd = 0;
    int quotient = 0;
import java.util.*;

public class perfectsquare {
    public int det_square;
    public perfectsqare(int num){
        this.det_square = n;
    }    
    public int determine(){    
        double number; 
        number= det_square;
        double sqr= Math.sqrt(number);
        //System.out.println(sqr);
        double num=sqr;
        double x;
        x=num%1;
        x=num-Math.floor(num);
        if(x>0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int det_square = Integer.parseInt(args[0]);
        perfectsquare square = new perfectsquare(det_square);
        square.determine();
    }
}

package CS390Asssignment3;

public class Prog1 {

    public double power(double x, int n){
        //base case
        if(n == 1){
            return 1;
        } else{
            //recursive case
            return x * power(x,n - 1);
        }
    }
    //Main method
    public static void main(String[] args){
        Prog1 p1 = new Prog1();

        System.out.println(p1.power(2,3));
    }
}

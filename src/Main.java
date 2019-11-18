import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numOfTests = s.nextInt();
        while (numOfTests > 0){
            int numOfStairs = s.nextInt();
            if(numOfStairs == 1){
                System.out.println(1);
            }
            else if (numOfStairs ==2){
                System.out.println(2);
            }
            else{
                BigInteger sol = BigInteger.valueOf(0);
                BigInteger tmp = BigInteger.valueOf(1);
                BigInteger tmp2 = BigInteger.valueOf(2);
                for(int i = 2 ; i<numOfStairs ; i++){
                    sol = tmp.add(tmp2);
                    tmp = tmp2;
                    tmp2 = sol;
                }
                System.out.println(sol);
            }
            numOfTests--;
        }
    }
}

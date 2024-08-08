package Recurion_Backtracking;
//Print the no of ways to climb stairs if no of stairs are given
import java.util.Scanner;
public class Climb_Stairs {
    int steps(int n){
        if(n<=2)
            return n;
        return steps(n-1)+steps(n-2);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Climb_Stairs ob=new Climb_Stairs();
        System.out.println("Np of ways:"+ob.steps(n));
    }

}


package Arrays;

import java.util.Scanner;

public class remove_dup {
    int remove(int a[]){
        if(a.length<2)
            return a.length;
        int i=1,c=1;
        for(int j=1;j<a.length;j++)
        {
            if(a[j]==a[j-1])
                c++;
            else
                c=1;
            if(c<=2){
                a[i]=a[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    }
}


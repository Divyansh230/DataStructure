package Recurion_Backtracking.Revision;

import java.util.*;
class Keys{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<String> al=new ArrayList<>();
        String a[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       Keys ob=new Keys();
        ob.printcomb(a,s,"",al);
    }
    void printcomb(String a[],String s,String ans,List<String> al){
        if(s.length()==0)
        {
            al.add(ans);
            return ;
        }
        String str=a[Character.getNumericValue(s.charAt(0))-1];
        for(int i=0;i<str.length();i++)
            printcomb(a,s.substring(1),ans+str.charAt(i),al);
    }
}

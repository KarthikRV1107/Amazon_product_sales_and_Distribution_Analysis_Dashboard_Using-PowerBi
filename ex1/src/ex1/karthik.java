package ex1;

import java.util.Scanner;

class karthik {

   public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter values");
           for(int i=0;i<3;i++) {
               String s1=sc.next();
               int x=sc.nextInt();
               System.out.printf("%-40s%10d%n",s1,x);
           }

   }
}


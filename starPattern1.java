import java.util.Scanner;
class Main {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         for(int k=0;k<n;k++){
            if(k==0||k==n-1)
         System.out.print("*");
         else
         System.out.print(" ");
       }
      System.out.println();
      }
   }
}
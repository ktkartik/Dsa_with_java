package number_system;

import java.util.Scanner;
//this code for cover number from one system to another 
// bin<-->decimal
public class Number {
    static int binTodeci(int num){
        int ans=0;
        int pow=1;
        while(num>0){
           int unit_d=num%10;
           ans+=(pow*unit_d);
           pow=pow*2;
           num=num/10;
        }
        return ans;
    }
    static  int deciTobin(int num){
        int pow =1;
        int ans=0;
        while(num>0){
         int parity=num%2;
         ans+=(parity*pow);
         pow=pow*10;
         num/=2;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("enter the binary no =");
        int bin=sc.nextInt();
        System.out.print("enter the decimal no =");
        int deci=sc.nextInt();
        System.out.println(bin+" this binary number convert into decimal no => "+binTodeci(bin));
        System.out.println(deci+" this decimal number convert into binary no => "+deciTobin(deci));

        
    }
}

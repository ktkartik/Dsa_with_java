package weight;
import java.util.Scanner;

class Weight{
    static int profitt(double  num){
        double weighting=num*1000;
        double profitperg=0.075;
        double profit=weighting* profitperg;
        return (int)profit;
    }
    static  int returnweight(double num){
        int Profitweight=profitt( num);
        double weighting=num*1000;
        double returnw=weighting-Profitweight;
        //returnw=returnw/1000;
        System.out.println("Return weight => "+ returnw);
        return 0;
    }
    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the weight in kg => ");
        double weight=sc.nextFloat();
        System.out.println("your profit weight in g => "+profitt(weight));
        returnweight(weight);
        
    }
}
package smallest_largest_element;
import java.util.Scanner;

public class Find{
    static int findlarge(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secontlarge(int arr[]){
        int [] temp=arr.clone();
        int maxv=findlarge(arr);
        for (int i=0;i<arr.length;i++){
            if(temp[i]==maxv){
                temp[i]=Integer.MIN_VALUE;
            }
        }
            maxv=findlarge(temp);
            return maxv;
        }
        
    
    static int smallest(int arr[]){
        int min=Integer.MAX_VALUE;
         for (int i = 0; i< arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int seccondsmallest(int []arr){
        int [] temp= arr.clone();
         int minv=smallest(arr);
        for (int i=0;i<arr.length;i++){
            if(temp[i]==minv){
                temp[i]=Integer.MAX_VALUE;
            }
        }
            minv=smallest(temp);
            return minv;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int [7];
        System.out.print("enter the values in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("largest element of array =>"+" "+findlarge(arr));
        System.out.println("second largest element of arry =>"+" "+secontlarge(arr));
        System.out.println("smallest element of array =>"+" "+smallest(arr));
        System.out.println("second smallest element of array =>"+" "+seccondsmallest(arr));
    }
}
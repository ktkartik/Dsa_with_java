package reverse;

import java.util.Scanner;

public class Reverse {
   //this method return reverse arrray by not creating new array
    static void rev(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        printarray(arr);

    }
    static void swap(int arr[],int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //this method return reverse arrray by creating new array
    static int[] reverse(int arr[]){
       
        int n =arr.length;
        int ans[]=new int[n];
        int j=0;
       
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }

      return ans;
    }
    static void  printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] =new  int [7];
        System.out.println("enter elements in the array => ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        } 
        int ans[]= reverse(arr);  
        printarray(ans);
        int temp[]=arr.clone();
        rev(temp);
         

        
    }
}
    


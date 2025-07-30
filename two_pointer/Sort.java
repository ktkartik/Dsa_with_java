package two_pointer;
import java.util.Scanner;

public class Sort{
    static int[] takearray(){
       Scanner sc =new Scanner(System.in);
        int arr[] =new  int [7];
        System.out.print("enter Zero and one only in the array => "+ " ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        } 
        return arr;
    }
    static  void sortzerotone(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while (i<j) {
          if(arr[i]==1 && arr[j]==0){
            swaparr(arr, i, j);
            i++;
            j--;
          }  
          if(arr[i]==0){
            i++;

          }
          if(arr[j]==1){
            j--;         
           }
     
            
        }
        printarray(arr);
    } 

     static void swaparr(int arr[],int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
     }
       static void  printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       
    }
    public static void main(String[] args) {

            int array[]=takearray();
            sortzerotone(array);
        
    }
}


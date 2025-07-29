import java.util.Scanner;

public class Rotate{
       static void arrayrotate(int arr[],int k){
          int n =arr.length;
          k=k%n;
          rev(arr,0,n-k-1);
          rev(arr,n-k,n-1);
          rev(arr,0,n-1);
          printarray(arr);

       }
       static void rev(int arr[],int i,int j){
        
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        

    }
    static void swap(int arr[],int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //this method rotates array by creating new array  
    static void kstepRotate(int arr[],int k){
        int n =arr.length;
        k=k%n;
        int j=0;
        int ans[] =new int[n];

        for(int i=n-k;i<n;i++){
           ans[j++] =arr[i];

        } 
        for(int i=0;i<n-k;i++){
           ans[j++]=arr[i];
        }
         printarray(ans);
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
        System.out.println("enter the k step => ");
        int k=sc.nextInt();
       kstepRotate(arr, k);
        arrayrotate(arr, k);


    }

}  
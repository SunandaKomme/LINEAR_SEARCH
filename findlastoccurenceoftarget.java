// Find the last occurrence of a target
import java.util.*;
public class findlastoccurenceoftarget{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[]arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int target=sc.nextInt();
         for(int i=n-1;i>=0;i--){
            if(arr[i]==target){
                System.out.print("Element found at index "+i);
                break;
            }
         }
    }
}
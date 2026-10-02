// Find the first element greater than a given value k
import java.util.*;
public class firstelementgreaterthanvaluek{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                System.out.print("Element greater than k is "+arr[i]);
                break;
            }
        }

    }}
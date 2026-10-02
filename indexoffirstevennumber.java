// Find the index of the first even number.
import java.util.*;
public class indexoffirstevennumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print("Index of first even number is "+i);
                break;
            }
        }

    }}

//Find the index of the first negative number.
import java.util.*;
public class indexoffirstnegativenumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print("Index of first negative number "+i);
                break;
            }
        }


    }}

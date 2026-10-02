// Search for a target and print Found / Not Found
import java.util.*;
public class searchfortargetprintfoundnotfound{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
               found=true;
               break;
            }

        }
        if(found){
            System.out.print("Target found");
        }else{
            System.out.print("Target not found");
        }
    }}

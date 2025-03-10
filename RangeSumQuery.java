import java.util.*;
public class RangeSumQuery 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int prefixsum[] = new int[n];
        prefixsum[0]=arr[0];
        for (int i=1;i<n;i++)
        {
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        System.out.println("enter the queries");
        int q = sc.nextInt();
        System.out.println("enter queries(l,r)");
        for (int i=0;i<q;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum;
            if (l == 0) {
                sum = prefixsum[r];
            } 
            else {
                sum = prefixsum[r] - prefixsum[l - 1]; 
            }
            System.out.println("Sum from " + l + " to " + r + " = " + sum);
        }            

        sc.close();
    }
 }    


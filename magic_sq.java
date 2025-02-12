import java.util.Scanner;

public class magic_sq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fdsum = 0, bdsum = 0;
        int n=sc.nextInt();
        int[][]arr= new int[n][n];
        for (int i =0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

         for (int i =0; i<n; i++)
         {
    
            
            fdsum+=arr[i][i];
            bdsum+=arr[i][n-i-1]; 
            
         }
        System.out.println(fdsum+" ");
        System.out.println(bdsum+" ");
         if( fdsum==bdsum)
         {
            System.out.println("its a magic square");
         }
         else
         {
            System.out.println("its not a magic square ");
         }

        }
    
    }


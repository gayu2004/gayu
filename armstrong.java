import java.util.Scanner;
class Java {

    public static void main(String[] args) {

        int n,k,g, total = 0;
        
        System.out.println("");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[]=new int[100000];
        s.close();
         k = n;

        for( ;k!=0;k /= 10)
        {
            g=k % 10;
            total = total + g*g*g;
        }

        if(total == n)
            System.out.println(" yes");
        else
            System.out.println("no");
    }
}

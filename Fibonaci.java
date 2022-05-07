import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int t1=0,t2=1,temp=0,count=0;

        for (int i = 0; i < n+5; i++) {
            if (t1>=n && count<=5) {
                System.out.println(t1);
                count++;
            }
            temp=t1+t2;
            t1=t2;
            t2=temp;
        }

        sc.close();
    }
}

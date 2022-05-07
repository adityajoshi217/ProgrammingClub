import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        int words=1,cnum=0,a=0;
        s=s.trim(); 

        for (int i = 0; i < s.length(); i++) {

           if (Character.isDigit(s.charAt(i))) {
               cnum++;
           }
           else if (s.charAt(i)==' ' && s.charAt(i+1)!=' ')  {
               ++words;
           }
           else if(s.charAt(i)!=' '){
              a++;
           }
        }

        System.out.println("Words are "+words);
        System.out.println("Digits Are:"+cnum);
        System.out.println("Characters Are:"+a);
    }
}

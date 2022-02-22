import java.util.Scanner;
import java.util.StringTokenizer;

public class token {

    static void print(String s){
        System.out.print(s);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        print("\nEnter a line of integers: ");
        String str = s.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int sum =0;
        String token;
        try{
            while(st.hasMoreTokens()){
                token = st.nextToken();
                sum = sum + Integer.parseInt(token);
                print(token+"\n");
            }
            print("The sum of the integers are: " + sum+ "\n");
        }catch(NumberFormatException e){
            System.out.print(e+"\n");
        }
    }
}

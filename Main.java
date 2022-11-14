import java.util.Scanner;
import java.math.*;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(pow2(2));
        int n = input.nextInt();
        char[] chars = new char[pow2(n)];
        for(int i = 0; i < chars.length; i++){
            chars[i] = (char) input.nextInt();
        }
        reverse(chars);
        Box box = new Box("Some value");
        System.out.println(box.value);

    }
    static public Integer pow2(Integer n){
        return n * n;
    }


    static public void reverse(char[] s){
        for (int i = s.length - 1; i >= 0; i--){
            System.out.print(s[i]);
        }
    }
}







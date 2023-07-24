package InOutput;

import java.util.Scanner;

//11382
public class plus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();

        System.out.println(a+b+c);
    }
}

//숫자 범위 확인 중요 !!
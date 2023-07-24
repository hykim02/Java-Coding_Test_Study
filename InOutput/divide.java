package InOutput;

import java.util.Scanner;

//1008
public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(a/b);
        sc.close();
    }
}

//오차 범위를 벗어나지 않게 하기 위해서는 반드시 double형으로 출력
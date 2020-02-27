package day1;

import java.util.Scanner;

public class demo01Scanner {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int max(int a, int b, int c){
        int temp = (a>b?a:b);
        return temp>c?temp:c;
    }
    public static void main(String[] args) {
        //System.in表示从键盘输入

        Scanner sc1 = new Scanner(System.in);
//        int num1 = sc1.nextInt();
//        int num2 = sc1.nextInt();
//        int result = sum(num1,num2);
        int n1 = sc1.nextInt();
        int n2 = sc1.nextInt();
        int n3 = sc1.nextInt();
        System.out.println(max(n1, n2, n3));

    }
}

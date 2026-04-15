package com.stu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tính Tổng của hai phân số");

        System.out.println("Vui lòng nhập tử số của phân số 1: ");
        int a = scanner.nextInt();
        System.out.println("Vui lòng nhập mẩu số của phân số 1: ");
        int b = scanner.nextInt();
        System.out.println("Vui lòng nhập tử số của phân số 2: ");
        int c = scanner.nextInt();
        System.out.println("Vui lòng nhập mẩu số của phân số 2: ");
        int d = scanner.nextInt();

        System.out.println("Tổng của hai phân số là: "+(a*d + b*c)+"/"+b*d);
    }
}
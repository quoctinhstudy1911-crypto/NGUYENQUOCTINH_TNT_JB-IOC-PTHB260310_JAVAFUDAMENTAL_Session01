package com.stu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r=0;
        while (r!=-999) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vui lòng nhập bán kính của hình tròn (Nhập -999: Thoát): ");
            r = Integer.parseInt(scanner.nextLine());
            double A = Math.PI * Math.pow(r, 2);
            System.out.printf("Diện tích của hình tròn là: %.2f", A);
            System.out.println("\n");

        }

    }
}
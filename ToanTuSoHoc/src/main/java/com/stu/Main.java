package com.stu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int  firstNumber, seccondNumber;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số đầu tiên: ");

        firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ hai: ");
        seccondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Kết quả: ");
        System.out.println("firstNumber"+ firstNumber);
        System.out.println("seccondNumber"+ seccondNumber);
        System.out.println("Tổng của hai số là: " + (firstNumber+seccondNumber));
        System.out.println("Hiệu của hai số là: "+ (firstNumber-seccondNumber));
        System.out.println("Thương của hai số là: "+ (firstNumber/seccondNumber));
        System.out.println("Tích của hai số là: "+ (firstNumber*seccondNumber));
        System.out.println("Phần dư của hai số là: "+ firstNumber%seccondNumber);


    }
}
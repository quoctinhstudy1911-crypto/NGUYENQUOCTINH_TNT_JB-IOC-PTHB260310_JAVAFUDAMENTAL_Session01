package com.stu;
import java.util.Scanner;
public class Main {

    public static void hcnSytem( float width , float height )
    {
        float area,perimeter;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập chiều dài của hình chữ nhật: ");
        width  = Float.parseFloat(scanner.nextLine().trim());
        while (width <=0)
        {
            System.out.print("Vui lòng nhập lại chiều dài của HCN: ");
            width  = Float.parseFloat(scanner.nextLine().trim());
        }

        System.out.print("Vui lòng nhập chiều rộng của hình chữ nhật: ");
        height  = Float.parseFloat(scanner.nextLine().trim());
        while (height <=0)
        {
            System.out.print("Vui lòng nhập lại chiều rộng  của HCN: ");
            height  = Float.parseFloat(scanner.nextLine().trim());
        }

        area = width*height;
        perimeter = 2*( width+height);

        int choose= 0;
        while (choose!=-999)
        {
            System.out.println("======================================================");
            System.out.println("1: Diện tích hình chữ nhật");
            System.out.println("2: Chu vi hình chữ nhật");
            System.out.println("-999: Thoát chương trình");
            System.out.println("======================================================");
            System.out.print("Vui lòng chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine().trim());
            if(choose==-999)
            {
                break;
            }
            switch (choose)
            {
                case 1:
                {
                    System.out.printf("Diện tích của hình chữ nhật là: %.2f", area);
                    System.out.print("\n");

                    break;
                }
                case 2:
                {
                    System.out.printf("Diện tích của hình chữ nhật là: %.2f", perimeter);
                    System.out.print("\n");
                    break;
                }
                default:
                {
                    System.out.print("Bạn chọn sai chức năng rồi ");
                    System.out.print("\n");
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {

        hcnSytem(0,0);
    }
}
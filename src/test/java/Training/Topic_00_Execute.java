package Training;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class Topic_00_Execute {
    public static void main(String[] args) {
//        // Bai tap 1: Viet chuong trinh nhap vao ten, tuoi cua mot nguoi. Sau do hien thi ra man hinh:
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        String P1 = name;
//        int P2 = age + 15;
//        System.out.println("After 15 years, age of " + P1 + " will be " + P2);

//        // Bai tap 2: Cho 2 bien kieu so nguyen a va b - viet chuong trinh hoan doi gia tri cua bien a va bien b. sau do hien thi ra man hinh
//        int a = 3;
//        int b = 4;
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a);
//        System.out.println(b);

        // Bai tap 3: Cho hai bien a va b kieu so nguyen - viet chuong trinh hien thi ra man hinh true neu a > b, nguoc lai hien thi ra false
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        boolean isGreaterThan = a > b;
//        System.out.println(isGreaterThan);
        if (a > b) {
            System.out.println("Trueeee");
        } else {
            System.out.println("Falseeeee");
        }

    }


}

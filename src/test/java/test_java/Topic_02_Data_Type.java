package test_java;

import org.openqa.selenium.WebDriver;

public class Topic_02_Data_Type {
    // Primitive type/ value type: Nguyen thuy
    byte bNumber = 6;
    short sNumber = 1500;
    int iNumber = 65000;
    long lNumber = 65000;
    float fNumber = 15.98f;
    double dNumber = 15.98d;
    char cChar = '1';
    boolean status = false;

    // Reference type: Tham chieu

    // String
    String address = "Ho chi Minh";

    // Array: Chua duoc 1 tap hop cac kieu du lieu cung 1 kieu
    String[] studentAddress = {address, "Ha Noi", "Da Nang"};
    Integer[] studentNumber = { 15, 20, 25};

    // Class
    Topic_02_Data_Type topic;

    // Interface
    WebDriver driver;

    // Object
    Object aObject;

    // Collection
    // List/ Set/ Queue/ Map
    public static void main(String[] args) {
    }


}

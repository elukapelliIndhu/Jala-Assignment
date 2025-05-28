import java.io.*;
import java.lang.reflect.*;
import java.sql.*;
import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Methods for each exception case
    public static void case1() {
        int result = 10 / 0;
    }

    public static void case2() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Handled ArithmeticException: " + e.getMessage());
        }
    }

    public static void case3() {
        riskyMethod(); // no try block here
    }

    static void riskyMethod() throws ArithmeticException {
        throw new ArithmeticException("Thrown from method without try block");
    }

    public static void case4() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }

    public static void case5() {
        throw new ArithmeticException("Custom Message from throw");
    }

    public static void case6() throws MyException {
        throw new MyException("This is a user-defined exception");
    }

    public static void case7() {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void case8() {
        int a = 10 / 0;
    }

    public static void case9() {
        int[] arr = new int[3];
        System.out.println(arr[5]);
    }

    public static void case10() throws ClassNotFoundException {
        Class.forName("NonExistentClass");
    }

    public static void case11() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("nofile.txt");
    }

    public static void case12() throws IOException {
        throw new IOException("IO exception generated");
    }

    public static void case13() throws NoSuchFieldException {
        Field field = String.class.getDeclaredField("nonExistentField");
    }

    public static void case14() throws NoSuchMethodException {
        Method method = String.class.getDeclaredMethod("nonExistentMethod");
    }

    public static void case15() {
        String str = null;
        System.out.println(str.length());
    }

    public static void case16() {
        int num = Integer.parseInt("abc");
    }

    public static void case17() {
        String str = "hello";
        System.out.println(str.charAt(10));
    }

    public static void case18() throws SQLException {
        throw new SQLException("SQL exception occurred");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select exception case (1-18), 0 to exit:");
        int choice;

        while (true) {
            System.out.print("\nEnter choice: ");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 0: System.out.println("Exiting."); return;
                    case 1: case1(); break;
                    case 2: case2(); break;
                    case 3: case3(); break;
                    case 4: case4(); break;
                    case 5: case5(); break;
                    case 6: case6(); break;
                    case 7: case7(); break;
                    case 8: case8(); break;
                    case 9: case9(); break;
                    case 10: case10(); break;
                    case 11: case11(); break;
                    case 12: case12(); break;
                    case 13: case13(); break;
                    case 14: case14(); break;
                    case 15: case15(); break;
                    case 16: case16(); break;
                    case 17: case17(); break;
                    case 18: case18(); break;
                    default: System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Caught exception: " + e);
            }
        }
    }
}

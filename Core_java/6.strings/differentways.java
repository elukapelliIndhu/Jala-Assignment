
public class differentways {

    public static void main(String[] args) {
        // 1st method
        String str1;
        str1 = new String("hello");

        // 2nd method
        String str2 = "world";

        // 3rd method
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        System.out.println("Strings: " + str1 + ", " + str2 + ", " + str3);
    }
}

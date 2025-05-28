
public class startend {

    public static void main(String[] args) {
        // equalsIgnoreCase(), startsWith(), endsWith(), compareTo()
        String str1 = "hello";
        String str4 = "hello";
        System.out.println(" EqualsIgnoreCase: " + str1.equalsIgnoreCase(str4));
        System.out.println("   StartsWith 'He': " + str1.startsWith("He"));
        System.out.println("   EndsWith 'lo': " + str1.endsWith("lo"));
        System.out.println("   CompareTo 'Hello': " + str1.compareTo("Hello")); // 0 means equal
    }
}

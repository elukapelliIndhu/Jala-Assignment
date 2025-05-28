
public class splitting {

    public static void main(String[] args) {
        //  Splitting strings with split()
        String str6 = "Java,Python,C++";
        String[] languages = str6.split(",");
        System.out.println(" Split Strings:");
        for (String lang : languages) {
            System.out.println("   " + lang);
        }
    }
}

public class SameHashCodeForStringDemo {
    public static void main(String[] args) {
        String str1 = "Aa";
        String str2 = "BB";

        System.out.println("str1 hashcode: " + str1.hashCode());
        System.out.println("str2 hashcode: " + str2.hashCode());
    }
}

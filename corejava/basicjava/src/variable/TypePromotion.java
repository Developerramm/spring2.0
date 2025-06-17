package variable;

public class TypePromotion {
    public static void main(String[] args) {
        byte b = 100;
//        b = b + 1;
        b = (byte) (b + 1);
        System.out.println(b);

        byte c = 14;
        short d = 432;
        int e = 1234;

        int f = (c + d + e);
        System.out.println(f);
        
    }
}

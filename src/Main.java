import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte b = -10;
        short s1 = 99, s2 = 99;
        float f1, f2;
        boolean q1 = true;

        s1 = (short)Math.pow(b, 2);
        System.out.println("new s1 value = " + s1);

        s2 = (short)(Math.random() * 10);
        System.out.println("random number s2 = "+ s2);

        double d2 = ((Math.random() * (9999 - 1)) + 1);
        System.out.println("random number d2 = "+ d2);

        double d1 = d2/(s1*s2);
        System.out.println("d2/(s1*s2) = "+ d1);

        double y = (Math.tan (Math.pow(1, s2)))/(Math.log(s1));
        System.out.println("expression value = "+ y);
    }
}


import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your width");
        width = sc.nextFloat();
        System.out.println("Enter your height");
        height = sc.nextFloat();
        float dientich = width*height;
        System.out.println("Diện tích là :" +dientich);
    }
}

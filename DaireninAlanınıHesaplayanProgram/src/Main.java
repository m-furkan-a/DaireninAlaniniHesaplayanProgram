import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alan,cevre;
        double r , pi=3.14 , merkezaci , f;

        System.out.print("Dairenin yarıçapını girin : ");
        r = input.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü girin5 : ");
        merkezaci = input.nextDouble();
    /*  alan = pi * r * r ;               Alan Ve Çevre Hesabı
        cevre = 2 * pi * r ;

        System.out.print("Alan : " + alan + " Çevre : " + cevre);      */

        // Ödev Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        f = (pi*(r*r)*merkezaci)/360;
        System.out.print("Daire diliminin alanı : " + f);
    }
}

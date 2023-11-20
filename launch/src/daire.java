import java.util.Scanner ;
public class daire {
    public static void main(String[] args) {

        // DAİRE ALAN FORMÜLÜ HESALAYICI //

        int r ;
        double  π = 3.14  ;

        Scanner input = new Scanner(System.in) ;
        System.out.print("Daire'nin yarı Çapını giriniz  :" );
        r = input.nextInt();

        double alan = ( π * (r * r) );
        double cevre = 2 * π * r ;
        System.out.println("Daire'nin alanı  :" + alan);
        System.out.println("Daire'nin çevresi  :" +cevre);
        























    }
}

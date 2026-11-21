import java.util.Scanner;
public class Contoh02_26{
    public static void main(String[] args) {
        String[] kota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        double[][] suhu = new double[5][7];   
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(kota[i] + " hari " + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        System.out.println("===== DATA SUHU =====");
        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.println("Suhu " + suhu[i][j] + " °C di kota "
                        + kota[i] + " pada hari ke-" + (j + 1));
            }
            System.out.println();
        }

        double maks = suhu[0][0], min = suhu[0][0];
        int kotaMaks = 0, hariMaks = 0, kotaMin = 0, hariMin = 0;

        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                if (suhu[i][j] > maks) {
                    maks = suhu[i][j];
                    kotaMaks = i;
                    hariMaks = j;
                }
                if (suhu[i][j] < min) {
                    min = suhu[i][j];
                    kotaMin = i;
                    hariMin = j;
                }
            }
        }

        System.out.println("===== HASIL =====");
        System.out.println("Suhu tertinggi: " + maks + " °C di " + kota[kotaMaks]
                + " pada hari ke-" + (hariMaks + 1));
        System.out.println("Suhu terendah : " + min + " °C di " + kota[kotaMin]
                + " pada hari ke-" + (hariMin + 1));

        sc.close();
    }
}
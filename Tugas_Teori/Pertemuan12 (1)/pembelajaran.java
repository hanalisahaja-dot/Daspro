import java.util.Arrays;
public class pembelajaran {
    
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        System.out.println("Sebelum : " + Arrays.toString(nilai));
        Arrays.sort(nilai);
        System.out.println("Sesudah : " + Arrays.toString(nilai));
    }
}
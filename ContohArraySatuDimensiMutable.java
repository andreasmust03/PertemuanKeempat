import java.util.Arrays;

public class ContohArraySatuDimensiMutable {

    public static void main(String[] args) {

        String[] names = {"Fitriyanti", "Innas", "Riki", "Faisal", "Gesang", "Erik", "Andreas"};

        System.out.println(Arrays.toString(names));

        String riki = names[2];
        System.out.println(riki);

        int panjangArrayNames = names.length;
        System.out.println("Panjang dari array names adalah " + panjangArrayNames);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Nilai dari indeks ke-" + i + " adalah " + names[i]);
        }
    }
}

import java.util.Arrays;

public class ContohArraySatuDimensiImmutable {

    public static void main(String[] args) {

        String[] animals = new String[5];

        animals[0] = "Sapi";
        animals[1] = "Kambing";
        animals[2] = "Kucing";
        animals[3] = "Ayam";
        animals[4] = "Semut";
        animals[5] = "Hiu";

        String nilaiDariAnimals = Arrays.toString(animals);
        System.out.println(nilaiDariAnimals);
    }
}

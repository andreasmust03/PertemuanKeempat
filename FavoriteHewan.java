public class FavoriteHewan {

    public static void main(String[] args) {

        String[][] animals = {
                {"Serigala" , "Kucing", "Macan", "Ular",},
                {"Kaming", "Sapi", "Gajah", "Jerapah"},
                {"Ayam", "Tikus", "Angsa", "Bebek"}
        };

        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i][0]);
            System.out.println(animals[i][1]);
            System.out.println(animals[i][2]);
            System.out.println(animals[i][3]);
            System.out.println("===============================");
        }
    }
}

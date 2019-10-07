public class ContohArrayDuaDimensiImmutable {

    public static void main(String[] args) {

        String[][] biodatas = new String[6][2];

        biodatas[0][0] = "Fitriyanti";
        biodatas[0][1] = "Sulawesi";

        biodatas[1][0] = "Innas";
        biodatas[1][1] = "Ponorogo";

        biodatas[2][0] = "Faisal";
        biodatas[2][1] = "Madiun";

        biodatas[3][0] = "Riki";
        biodatas[3][1] = "Ponorogo";

        biodatas[4][0] = "Gesang";
        biodatas[4][1] = "Madiun";

        biodatas[5][0] = "Erik";
        biodatas[5][1] = "Ponorogo";

        System.out.println("Nama saya adalah " + biodatas[5][0] + " dan saya beralamat di " + biodatas[5][1]);
    }
}

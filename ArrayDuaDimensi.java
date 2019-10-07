import org.w3c.dom.ls.LSOutput;

public class ArrayDuaDimensi {
    public static void main(String[] args){
        // imutable

        String[][] biodatas = new String[6][2];
        biodatas[0][0] = "Faisal";
        biodatas[0][1] = "ArabBadui";

        biodatas[1][0] = "Muhammad";
        biodatas[1][1] = "Indonesia";

        biodatas[2][0] = "Naruto";
        biodatas[2][1] = "Konoha";

        biodatas[3][0] = "Gaara";
        biodatas[3][1] = "Sunagakure";

        biodatas[4][0] = "Kisame";
        biodatas[4][1] = "Kirigakure";

        biodatas[5][0] = "Pain";
        biodatas[5][1] = "Amegakure";

        System.out.println("Nama Saya adalah " + biodatas[0][0] + " Dan Saya beralamat di " + biodatas[0][1]);
        System.out.println("Nama Saya adalah " + biodatas[2][0] + " Dan Saya beralamat di " + biodatas[2][1]);
    }

}

import java.util.Scanner;

public class hitungDiskon_71200547_C {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Banyak belanjaan: ");
        Integer jumlahBarang = inp.nextInt();

        for (Integer i = 0; i <= jumlahBarang - 1; i += 1) {
            String hargaBarang = String.format("Harga barang ke-%s : ", i + 1);

            Integer harga = inp.nextInt();
            String harga_String = String.format("%s", harga);

            System.out.println(hargaBarang + harga_String);
        }
    }
}
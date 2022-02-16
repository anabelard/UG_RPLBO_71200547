public class Main {
    public static void main(String[] args) {
        Mobil M_71200547 = new Mobil();
        PejalanKaki P_71200547 = new PejalanKaki();

        // Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini: ");
        String kodeLampu = System.console().readLine();

        if (kodeLampu.equals("1")) {
            System.out.println("Lampu Hijau");
            M_71200547.jalan();
            P_71200547.menunggu();
        } else if (kodeLampu.equals("2")) {
            System.out.println("Lampu Kuning");
            M_71200547.kurangiKecepatan();
            P_71200547.bersiap();
        } else if (kodeLampu.equals("3")) {
            System.out.println("Lampu Merah");
            M_71200547.berhenti();
            P_71200547.menyeberang();
        } else {
            System.out.println("Kode lalu lintas tidak valid");
        }

    }

}
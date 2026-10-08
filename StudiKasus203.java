import java.util.Scanner;

public class StudiKasus203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();
        
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen: ");
            int jmlDokumen = sc.nextInt();

            System.out.print("Peringkat juara: ");
            int juara = sc.nextInt();

            if (jmlDokumen < 4) {
                int kurang = 4 - jmlDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Jumlah dokumen: ");
            int jmlDokumen = sc.nextInt();
            
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int statusLolos = sc.nextInt();

            if (jmlDokumen < 4) {
                int kurang = 4 - jmlDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (statusLolos == 1) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }
            }

        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

    }
}

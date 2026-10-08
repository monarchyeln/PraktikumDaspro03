import java.util.Scanner;

public class StudiKasus103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int haraPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalharga, diskon, totalBayar;
        int kembalian, kurang;
        
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = sc.nextInt();

        totalharga = jumlahCup * haraPerCup;
        if (totalharga > 100000) {
            diskon = totalharga * 10 / 100;
        } else {
            diskon = 0;
        }
        totalBayar = totalharga - diskon;
        if (uangBayar > totalBayar) {
            kembalian = uangBayar - totalBayar;
            kurang = 0;
        } else {
            kembalian = 0;
            kurang = totalBayar - uangBayar;
        }

        System.out.println("Total harga: " + totalharga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);
        if (uangBayar > totalBayar) {
            System.out.println("Kembalian: " + kembalian);
        } else {
            System.out.println("Uang yang kurang: " + kurang);
        }
    }
}
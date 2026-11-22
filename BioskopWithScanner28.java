import java.util.Scanner;

public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu Bioskop");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Baris / kolom tidak tersedia. Silakan masukkan baris dan kolom kembali.");
                        continue;
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Warning: kursi baris " + baris + " kolom " + kolom
                                + "sudah terisi" + penonton[baris - 1][kolom - 1]
                                + " Masukkan baris dan kolom kembali");
                        continue;
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data berhasil disimpan");
                    break;
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar penonton");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.printf("%-10s", "***");
                        } else {
                            System.out.printf("%-10s", penonton[i][j]);
                        }
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Program selesai");
                break;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        }

        sc.close();
    }
}
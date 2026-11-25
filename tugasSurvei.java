import java.util.Scanner;

public class tugasSurvei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];
        int nilai;

        System.out.println("data survei(1-5)");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
             
                while (true) {
                    System.out.print("  Pertanyaan " + (j + 1) + ": ");
                    nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        survei[i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Input tidak valid, Masukkan nilai 1-5");
                    }
                }
            }
        }

        System.out.println("Rata-rata responden");
        for (int i = 0; i < survei.length; i++) {
            int totResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totResponden += survei[i][j];
            }
            double rataResponden = (double) totResponden / survei[i].length;
          System.out.println("Responden ke-" + (i + 1) + " : " + rataResponden);
        }

        System.out.println("Rata-rata tiap pertanyaan");
        for (int j = 0; j < survei[0].length; j++) {
            int totPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totPertanyaan += survei[i][j];
            }
            double rataPertanyaan = (double) totPertanyaan / survei.length;
            System.out.printf("Pertanyaan ke- "+ (j + 1) + ":" + rataPertanyaan);
        }

        int totKeseluruhan = 0;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = (double) totKeseluruhan / (survei.length * survei[0].length);
        System.out.println("Rata-rata keseluruhan");
        System.out.printf("Rata-rata keseluruhan: "+ rataKeseluruhan);

        sc.close();
    }
}
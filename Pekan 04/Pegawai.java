import java.util.Scanner;
class Pegawai {
    private String nama;
    private String jabatan;
    private double gaji;
  
    public Pegawai(String nama, String jabatan, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println("\n=== Data Pegawai ===");
        System.out.println("Nama    : " + this.nama);
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("Gaji    : " + this.gaji);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Pegawai    : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jabatan         : ");
        String jabatan = input.nextLine();

        System.out.print("Masukkan Gaji            : ");
        double gaji = input.nextDouble();

        Pegawai p1 = new Pegawai(nama, jabatan, gaji);

        p1.tampilkanInfo();
    }
}

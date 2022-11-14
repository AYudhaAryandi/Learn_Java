import java.util.Scanner;
class JawabanNoTiga {
    public class Cek {


        static int jumlahTopLevel = 0;
        static int jumlahMiddleLevel = 0;
        static int jumlahReggularStaff = 0;
        static int jumlahStaff = 0;

        static boolean success = false;

        public static void main(String[] args) {
            String[] busInfo = {"01-TopLevel", "02-MiddleLevel", "03-RegularStaff", "04-Staff"};
            for (int i = 0; i < 200; i++) {
                Nik();
            }
        }

        static void cekNIKKaryawan(String nik) {
            if (nik.length() <= 10) {

                if (nik.contains("c01")) {
                    success = true;
                    jumlahTopLevel++;
                } else if (nik.contains("j02")) {
                    success = true;
                    jumlahMiddleLevel++;
                } else if (nik.contains("n03")) {
                    success = true;
                    jumlahReggularStaff++;
                } else if (nik.contains("p04")) {
                    success = true;
                    jumlahStaff++;
                } else {
                    success = false;
                    System.out.println("Gagal, Format registrasi tidak terdaftar dalam list karna tidak ada NIK terdaftar");
                }
            } else {
                success = false;
                System.out.println("Gagal, Pastikan jumlah NIK tidak lebih dari 10, silahkan isi ulang NIK");

            }

        }

        static void Nik() {

            Scanner inputRegistrasi = new Scanner(System.in);
            System.out.println("Masukkan NIK untuk mengetahui dimana bis anda");
            String nik = inputRegistrasi.nextLine();
            cekNIKKaryawan(nik);
            if (success) {
                printHasil();
            }

        }
        static void printHasil() {
            System.out.println("Jumlah peserta di bus 01-TopLevel = " + jumlahTopLevel);
            System.out.println("Jumlah peserta di bus 02-MiddleLevel = " + jumlahMiddleLevel);
            System.out.println("Jumlah peserta di bus 03-RegulerStaff = " + jumlahReggularStaff);
            System.out.println("Jumlah peserta di bus 04-Staff = " + jumlahStaff);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        while(true){
            Cek.Nik();
        }
    }
}

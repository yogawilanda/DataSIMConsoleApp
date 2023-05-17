import java.util.ArrayList;
import java.util.Scanner;

// Buatlah sebuah aplikasi yang digunakan untuk melakukan proses pengelolaan data Kepemilikan Surat Izin Mengemudi (SIM). Atribut data yang disimpan adalah : 
// a.	Nama, 
// b.	Tanggal lahir, 
// c.	Tempat lahir,
// d.	Golongan Darah,
// e.	Jenis Kelamin,
// f.	Alamat,
// g.	Tanggal Kadaluarsa SIM,
// h.	Jenis SIM (A/B/C),
// i.	Kota penerbitan SIM.
// Fitur yang harus dibuat adalah :
// a.	Menerima inputan data
// b.	Menampilkan Data seluruh pemilik SIM dan jenis SIM yang dimilikinya. (Hanya NAMA dan JENIS SIM saja)
// Menampilkan Data Lengkap pemilik SIM, dilakukan dengan cara menampilkan nama pemilik SIM dan memilihnya berdasarkan nomor urut yang telah ditampilkan tersebut.

public class App {

    int choices;
    public Scanner input = new Scanner(System.in);

    ArrayList<User> user = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        clearScreen();
        App menu = new App();
        menu.menu();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    void menu() throws Exception {

        clearScreen();
        judul();
        String ulang;
        do {
            choices = input.nextInt();
            input.nextLine();

            switch (choices) {
                case 1:
                    registrasi();
                    break;
                case 2:
                    show();
                    break;

                case 3:
                    clearScreen();

                    System.out.println("Terima kasih, semoga hari anda menyenangkan!");
                    System.exit(1);

                default:
                    break;
            }

            System.out.println("\nUlang?");
            ulang = input.nextLine();

        } while (ulang == "ya");

        menu();
    }

    protected static void judul() {
        System.out.println("Aplikasi Pengelola Kepemilikan SIM\n");
        System.out.println("Silahkan memilih menu yang tersedia (numerik)");
        System.out.println("1. Pendaftaran SIM\n2. Cek Pendaftar\n3. Keluar Aplikasi");

    }

    void registrasi() {

        clearScreen();
        System.out.println("Menu 1 : Registrasi data\n\n");

        System.out.println("Masukkan nama: ");
        String namaUserInput = input.nextLine();

        System.out.println("Masukkan tanggal lahir: ");
        int tanggalLahirInput = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan tempat tinggal: ");
        String tempatinput = input.nextLine();

        // instansiasi user ke dalam method

        user.add(new User(namaUserInput, tanggalLahirInput, tempatinput));
        System.out.println("\nNama \t: " + namaUserInput);
        System.out.println("Tempat : " + tempatinput);
        System.out.println("Tanggal Lahir : " + tanggalLahirInput);
        System.out.println("Total user saat ini adalah: " + user.size() + "\n");

    }

    public void show() {
        int a = user.size();
        System.out.println("Menu 2 : Cek seluruh data pendaftar");
        System.out.println("jumlah pendaftar saat ini : " + a);

        for (User i : user) {
            System.out.println("Nama : " + i.getNama() + "\nTempat: " + i.getTempatLahir());
        }

    }
}

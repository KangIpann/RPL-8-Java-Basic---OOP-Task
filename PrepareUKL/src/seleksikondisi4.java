import java.util.Scanner;

public class seleksikondisi4 {
    public static void main(String[] args) {
        int golongan = 0, tarif = 0;
        String asal, tujuan, pilihan;
        Scanner input = new Scanner(System.in);
        String kolom[][] = { { "1", ".Sedan,Jip,Pickup" }, { "2", ".Truk Ddengan 2 sumbu roda" },
                { "3", ".Truk dengan 3 sumbu roda" } };
        System.out.println("=======SELAMAT DATANG DI TOL=======");
        System.out.println("Dibawah Ini Adalah Seleksi Kendaraan Menurut Golongan");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(kolom[i][j]);
            }
            System.out.println();
        }
        while (true) {
            System.out.print("Masukan Asal Anda :");
            asal = input.next();

            if (asal.equalsIgnoreCase("waru")) {
                System.out.print("Masukan Tujuan Anda :");
                tujuan = input.next();
                if (tujuan.equalsIgnoreCase("Sidoarjo")) {

                    System.out.print("Masukan Golongan Kendaraan Anda : ");
                    pilihan = input.next();
                    if (pilihan.equalsIgnoreCase("1")) {
                        tarif = 6000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("2")) {
                        tarif = 9000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("3")) {
                        tarif = 9000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else {
                        System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
                    }
                } else if (tujuan.equalsIgnoreCase("Porong")) {

                    System.out.print("Masukan Golongan Kendaraan Anda : ");
                    pilihan = input.next();
                    if (pilihan.equalsIgnoreCase("1")) {
                        tarif = 9000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("2")) {
                        tarif = 14000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("3")) {
                        tarif = 14000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else {
                        System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
                    }
                }

            } else if (asal.equalsIgnoreCase("Sidoarjo")) {
                System.out.print("Masukan Tujuan Anda :");
                tujuan = input.next();
                if (tujuan.equalsIgnoreCase("Waru")) {

                    System.out.print("Masukan Golongan Kendaraan Anda : ");
                    pilihan = input.next();
                    if (pilihan.equalsIgnoreCase("1")) {
                        tarif = 6000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("2")) {
                        tarif = 9000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("3")) {
                        tarif = 9000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else {
                        System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
                    }
                } else if (tujuan.equalsIgnoreCase("Porong")) {

                    System.out.print("Masukan Golongan Kendaraan Anda : ");
                    pilihan = input.next();
                    if (pilihan.equalsIgnoreCase("1")) {
                        tarif = 5500;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("2")) {
                        tarif = 8500;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("3")) {
                        tarif = 8500;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else {
                        System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
                    }
                } else {
                    System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
                }

            } else if (asal.equalsIgnoreCase("Porong")) {
                System.out.print("Masukan Tujuan Anda :");
                tujuan = input.next();
                if (tujuan.equalsIgnoreCase("Sidoarjo")) {

                    System.out.print("Masukan Golongan Kendaraan Anda : ");
                    pilihan = input.next();
                    if (pilihan.equalsIgnoreCase("1")) {
                        tarif = 5500;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("2")) {
                        tarif = 8500;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("3")) {
                        tarif = 8500;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else {
                        System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
                    }
                } else if (tujuan.equalsIgnoreCase("Porong")) {

                    System.out.print("Masukan Golongan Kendaraan Anda : ");
                    pilihan = input.next();
                    if (pilihan.equalsIgnoreCase("1")) {
                        tarif = 9000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("2")) {
                        tarif = 14000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else if (pilihan.equalsIgnoreCase("3")) {
                        tarif = 14000;
                        System.out.println("Tarif Yang Dikenakan Adalah = " + tarif);
                    } else {
                        System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
                    }
                } else {
                    System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
                }
            } else {
                System.out.println("Pilihan Anda Tidak Tersedia. Silahkan Inputkan Ulang.");
            }

            System.out.println("Ketik 'Keluar' Bila Sudah Selesai\n Dan Ketik 'Ulang' Untuk Mengulang Inputan");
            String konfirmasi = input.next();
            if (konfirmasi.equalsIgnoreCase("Keluar")) {
                break;
            }
        }
    }
}

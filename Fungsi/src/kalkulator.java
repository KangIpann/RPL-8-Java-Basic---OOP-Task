import javax.swing.*;

public class kalkulator {
    public static double perkalian(double bil1, double bil2, double hasil) {
        hasil = bil1 * bil2;
        return hasil;
    }

    public static double pembagian(double bil1, double bil2, double hasil) {
        hasil = bil1 / bil2;
        return hasil;
    }

    public static double penjumlahan(double bil1, double bil2, double hasil) {
        hasil = bil1 + bil2;
        return hasil;
    }

    public static double pengurangan(double bil1, double bil2, double hasil) {
        hasil = bil1 - bil2;
        return hasil;
    }

    /**
     * @author KangIpannn
     **/

    public static void main(String args[]) {
        double hasil = 0;
        int konfirmasi;
        String riwayat = "Riwayat perhitungan sebelumnya :  ";
        int jumlah_konfirmasi = 0;
        // Bila User meng input yes = 0 maka akan break.
        // Bila User meng input no = 1 maka akan Mengulang Input.
        // Bila User meng input Cancel = 2 maka akan break
        while (true) {
            // System.out.print("Bilangan 1 : ");
            // bil1 = input.nextInt();
            jumlah_konfirmasi++;
            try {
                String masuk = JOptionPane.showInputDialog("Masukan Nilai Pertama");
                double bil1 = Double.valueOf(masuk);
                String pengoperasian = "";
                // System.out.print("Bilangan 2 : ");
                // bil2 = input.nextInt();
                String masuk2 = JOptionPane.showInputDialog("Masukan Nilai Kedua");
                double bil2 = Double.valueOf(masuk2);
                if (bil1 != 0 || bil2 != 0) {
                    // System.out.print("Pilihan Operasi: ");
                    // pil = input.nextInt();
                    String masuk3 = JOptionPane.showInputDialog("" + " Masukan Angka sesuai:  \n" + "x = Perkalian \n"
                            + ": = Pembagian  \n" + "+ = Penjumlahan  \n" + "- = Pengurangan  \n");
                    switch (masuk3) {
                        case "x":
                            konfirmasi = JOptionPane.showConfirmDialog(null, "Hasil :" + perkalian(bil1, bil2, hasil));
                            pengoperasian = " x ";
                            if (konfirmasi == 0) {
                                break;
                            } else if (konfirmasi == 1) {
                                JOptionPane.showMessageDialog(null, "Menjalankan Ulang Program", "Pesan Peringatan",
                                        JOptionPane.WARNING_MESSAGE);
                                System.out.println(jumlah_konfirmasi + ". " + riwayat + bil1 + pengoperasian + bil2
                                        + " = " + hasil);
                            } else if (konfirmasi == 2) {
                                break;
                            }
                            continue;
                        case ":":

                            konfirmasi = JOptionPane.showConfirmDialog(null, "Hasil :" + hasil);
                            pengoperasian = " : ";
                            if (konfirmasi == 0) {
                                break;
                            } else if (konfirmasi == 1) {
                                JOptionPane.showMessageDialog(null, "Menjalankan Ulang Program", "Pesan Peringatan",
                                        JOptionPane.WARNING_MESSAGE);
                                System.out.println(jumlah_konfirmasi + ". " + riwayat + bil1 + pengoperasian + bil2
                                        + " = " + hasil);
                            } else if (konfirmasi == 2) {
                                break;
                            }
                            continue;
                        case "+":
                            konfirmasi = JOptionPane.showConfirmDialog(null,
                                    "Hasil :" + penjumlahan(bil1, bil2, hasil));
                            pengoperasian = " + ";
                            if (konfirmasi == 0) {
                                break;
                            } else if (konfirmasi == 1) {
                                JOptionPane.showMessageDialog(null, "Menjalankan Ulang Program", "Pesan Peringatan",
                                        JOptionPane.WARNING_MESSAGE);
                                System.out.println(jumlah_konfirmasi + ". " + riwayat + bil1 + pengoperasian + bil2
                                        + " = " + hasil);
                            } else if (konfirmasi == 2) {
                                break;
                            }
                            continue;
                        case "-":
                            konfirmasi = JOptionPane.showConfirmDialog(null,
                                    "Hasil :" + pengurangan(bil1, bil2, hasil));
                            pengoperasian = " - ";
                            if (konfirmasi == 0) {
                                break;
                            } else if (konfirmasi == 1) {
                                JOptionPane.showMessageDialog(null, "Menjalankan Ulang Program", "Pesan Peringatan",
                                        JOptionPane.WARNING_MESSAGE);
                                System.out.println(jumlah_konfirmasi + ". " + riwayat + bil1 + pengoperasian + bil2
                                        + " = " + hasil);
                            } else if (konfirmasi == 2) {
                                break;
                            }
                            continue;

                        default:
                            JOptionPane.showMessageDialog(null, "Salah memasukan pilihan", "Pesan Peringatan",
                                    JOptionPane.ERROR_MESSAGE);
                            continue;
                    }
                    if (true) {
                        System.out.println(
                                jumlah_konfirmasi + ". " + riwayat + bil1 + pengoperasian + bil2 + " = " + hasil);
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tolong Masukan Salah Satu Angka Tidak Bernilai 0",
                            "Pesan Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception a) {
                konfirmasi = JOptionPane.showConfirmDialog(null,
                        "Jangan Memasukan Selain Angka!\n" + "                  Ulangi?");
                if (konfirmasi == 0) {
                    JOptionPane.showMessageDialog(null, "Menjalankan Ulang Program", "Pesan Peringatan",
                            JOptionPane.WARNING_MESSAGE);
                    continue;
                } else if (konfirmasi == 1) {
                    break;
                } else if (konfirmasi == 2) {
                    break;
                } else {
                    break;
                }

            }
        }
    }
}

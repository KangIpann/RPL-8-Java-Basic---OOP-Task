import javax.swing.*;

public class Tugas_Pertemuan5 {
    public static void main(String[] args) {
        int harga_laptop = 10000;
        int harga_hardisk = 1500;
        int harga_mouse = 150;
        String input = JOptionPane.showInputDialog("Masukan Jumlah Laptop");
        int laptop = Integer.parseInt(input);
        String input2 = JOptionPane.showInputDialog("Masukan Jumlah Hardisk");
        int hardisk = Integer.parseInt(input2);
        String input3 = JOptionPane.showInputDialog("Masukan Jumlah Mouse");
        int mouse = Integer.parseInt(input3);
        int total_aset_laptop = laptop * harga_laptop;
        int total_aset_hardisk = hardisk * harga_hardisk;
        int total_aset_mouse = mouse * harga_mouse;
        int total = total_aset_laptop + total_aset_hardisk + total_aset_mouse;
        JOptionPane.showMessageDialog(null,
                "Jumlah Laptop : " + laptop + " \n  Jumlah Hardisk : " + hardisk + " \n Jumlah Mouse : " + mouse);
        JOptionPane.showMessageDialog(null,
                "Total Total per barang : \n" + "Total Harga Laptop : " + total_aset_laptop + "K"
                        + "\n Total Harga Hardisk : " + total_aset_hardisk + "K" + "\n Total Harga Mouse : "
                        + total_aset_mouse + "K");
        JOptionPane.showMessageDialog(null, "Total Aset Keseluruhan = " + total + "K");
    }
}

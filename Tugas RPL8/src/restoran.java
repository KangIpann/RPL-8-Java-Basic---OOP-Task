import javax.swing.JOptionPane;

public class restoran {
    public static void main(String[] args) {
        while(true){
            int konfirmasi;
            String input = JOptionPane.showInputDialog("Pilih Menu: \n 1.Rawon/RP.55.000 \n 2.Soto Ayam Lamongan/Rp.35.000 \n 3.Tahu Campur/Rp.20.000");
            String makanan = input.toLowerCase();

            switch (makanan) {
                case "rawon":
                    konfirmasi = JOptionPane.showConfirmDialog(null, "Ingin menambah menu?");
                    if (konfirmasi == 0) {
                        continue;
                    } else if (konfirmasi == 1){break;
            }
        }System.out.println("Nganu");
        }
    }
}

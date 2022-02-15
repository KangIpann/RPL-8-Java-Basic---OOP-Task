public class ukl7 {
    public int biaya(String cottage, int hari, String tipehari, int harga) {
        if (cottage.equalsIgnoreCase("Duku") || cottage.equalsIgnoreCase("Jeruk")) {
            if (tipehari.equalsIgnoreCase("weekday")) {
                harga = 915000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("weekend")) {
                harga = 1025000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("holiday")) {
                harga = 1225000;
                harga *= hari;
            }
        } else if (cottage.equalsIgnoreCase("Alpukat") || cottage.equalsIgnoreCase("Jambu Air")) {
            if (tipehari.equalsIgnoreCase("weekday")) {
                harga = 575000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("weekend")) {
                harga = 695000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("holiday")) {
                harga = 895000;
                harga *= hari;
            }
        } else if (cottage.equalsIgnoreCase("Durian") || cottage.equalsIgnoreCase("Melon")) {
            if (tipehari.equalsIgnoreCase("weekday")) {
                harga = 595000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("weekend")) {
                harga = 715000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("holiday")) {
                harga = 915000;
                harga *= hari;
            }
        } else if (cottage.equalsIgnoreCase("Belimbing") || cottage.equalsIgnoreCase("Mangga")
                || cottage.equalsIgnoreCase("Kedondong")) {
            if (tipehari.equalsIgnoreCase("weekday")) {
                harga = 495000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("weekend")) {
                harga = 575000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("holiday")) {
                harga = 755000;
                harga *= hari;
            }
        }
        return harga;
    }

    public int cek(String cottage) {
        int harga = 0;
        if (cottage.equalsIgnoreCase("Duku") || cottage.equalsIgnoreCase("Jeruk")) {
            harga = 915000;
        } else if (cottage.equalsIgnoreCase("Alpukat") || cottage.equalsIgnoreCase("Jambu Air")) {
            harga = 895000;
        } else if (cottage.equalsIgnoreCase("Durian") || cottage.equalsIgnoreCase("Melon")) {
            harga = 915000;
        } else if (cottage.equalsIgnoreCase("Belimbing") || cottage.equalsIgnoreCase("Mangga")
                || cottage.equalsIgnoreCase("Kedondong")) {
            harga = 495000;
        }
        return harga;
    }
}

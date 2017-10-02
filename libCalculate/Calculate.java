/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;

/**
 *
 * @author user
 */
public class Calculate {

 private double pokok;
    private double dp;
    private double gaji;
    private double tanggungan;
    private int waktu;

    /**
     * @param pokok the pokok to set
     */
    public void setPokok(double pokok) {
        this.pokok = pokok;
    }

    /**
     * @param dp the dp to set
     */
    public void setDp(double dp) {
        this.dp = dp;
    }

    /**
     * @param waktu the waktu to set
     */
    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    /**
     * @param gaji the gaji to set
     */
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    /**
     * @param tanggungan the tanggungan to set
     */
    public void setTanggungan(double tanggungan) {
        this.tanggungan = tanggungan;
    }

    private double hitungTotalCicilan() {
        return pokok - dp;
    }

    private double setBunga() {
        double bunga = 0;
        if (waktu <= 12) {
            bunga = 0.05;
        } else if (waktu > 12 && waktu <= 24) {
            bunga = 0.10;
        } else if (waktu > 24 && waktu <= 36) {
            bunga = 0.15;
        } else if (waktu < 36 && waktu <= 48) {
            bunga = 0.20;
        } else if (waktu > 48 && waktu <= 60) {
            bunga = 0.25;
        } else if(waktu >60 && waktu <=72){
            bunga = 0.30;
        }else if(waktu>72){
            bunga = 0.35;
        } else {
            bunga = 0.40;
        }
        return bunga;
    }

    public double bunga() {
        return setBunga();
    }

    public double totalBunga() {
        double jangkaWaktu = (double) waktu;
        return hitungTotalCicilan() * setBunga() * (jangkaWaktu / 12);
    }

    public double cicilianPerBulan() {
        double jangkaWaktu = (double) waktu;
        return (hitungTotalCicilan() + totalBunga() / jangkaWaktu);
    }

    public double limit() {
        return gaji / (tanggungan + 1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorbmi;
import javax.swing.JOptionPane;

/**
 *
 * @author cwr
 */
public class KalkulatorBMI {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String nama, jk, hasil;
    float tb, tb1, tb2, bb, bmi;
    int act;

    nama = JOptionPane.showInputDialog(null, "Tuliskan Nama Anda");

    jk = JOptionPane.showInputDialog(null, "Jenis Kelamin (Laki-laki/Perempuan)");

    tb = Float.parseFloat(JOptionPane.showInputDialog(null, "Berapa tinggi badan anda? (ditulis dalam satuan cm)"));

    bb = Float.parseFloat(JOptionPane.showInputDialog(null, "Berapa berat badan anda? (ditulis dalam satuan kg)"));

    tb1 = tb / 100;
    tb2 = tb1 * tb1;
    bmi = bb / tb2;

    hasil = "======== Biodata ======== \n" +
      "Nama : " + nama + "\n" +
      "Jenis Kelamin : " + jk + "\n" +
      "Tinggi Badan : " + tb1 + "m" + "\n" +
      "Berat Badan : " + bb + "kg" + "\n" +
      "======= Hasil BMI =======" + "\n" +
      "BMI : " + bmi;
    JOptionPane.showMessageDialog(null, hasil);

    act = JOptionPane.showOptionDialog(null, "Anda ingin keluar?", "Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

    if (act == JOptionPane.YES_OPTION) {
      JOptionPane.showMessageDialog(null, "Program Akan Keluar");
      System.exit(0);
    }

  }
}
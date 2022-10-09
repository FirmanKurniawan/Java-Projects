/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invest;
import javax.swing.JOptionPane;
/**
 *
 * @author cwr
 */
public class Invest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float awal,bunga,laba = 0,invest;
        double tambah,total = 0;
        int bulan;
        String hasil = null;
        awal = Integer.valueOf(JOptionPane.showInputDialog(null, "Investasi Awal (Rp):"));
        bulan = Integer.valueOf(JOptionPane.showInputDialog(null, "Saldo Bulan ke:"));
        bunga = 2/100;
        invest = awal;
        
           for(int i=0; i<bulan; i++){
           laba = invest*2/100;
           total = invest + laba;
           invest = invest + laba;
        
        }
          
           // Untuk membulatkan hasil
           tambah = 0.5;
           total = total + tambah; 
           /////
           
           
           hasil="========= Investasi =========\n"+
                 "Investasi Awal: Rp. "+awal+"\n"+
                 "Saldo Bulan ke- "+bulan+"\n"+
                 "Rp. "+total+"\n"+
                 "==========================";
                 
        JOptionPane.showMessageDialog(null, hasil);

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Require Depedencies mysql-connector
 */

package com.mycompany.siekeusekolah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rico
 */
public class Koneksi {
    public Connection konekDB;
    public Statement perintah;

    public Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/javadb";
            String user = "root";
            String pass = "ricoyoga12";
            
            konekDB = DriverManager.getConnection(url, user, pass);
            perintah = konekDB.createStatement();
            System.out.println("Berhasil Terhubung");
            
        } catch (SQLException salahe) {
            JOptionPane.showMessageDialog(null, "Gagal Terhubung Database");
            System.err.print("Gagal koneksi: " + salahe.getMessage());
        } catch (ClassNotFoundException salahe) {
            System.err.print("Class Tidak Ditemukan: " + salahe.getMessage());
        }
    }
}


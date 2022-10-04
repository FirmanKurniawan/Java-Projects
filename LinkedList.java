/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author zenalarifin
 */
import java.util.LinkedList;
public class LinkedList {
   public static void main(String[] args){
       
   LinkedList<String>nama_buah = new LinkedList();
        System.out.println("====|Nama buah buahan|====");//print title
      nama_buah.add("pepaya");
      nama_buah.add("pisang");
      nama_buah.add("semangka");
      nama_buah.add("jeruk");
      nama_buah.add("manggis");
      nama_buah.add("anggur");
   
        System.out.println("Nama Buah : " + nama_buah);//print list buah
        System.out.println("Jumlah Buah :" + nama_buah.size() + "\n");//print jumlah buah
        System.out.println("==========================");
   
      nama_buah.add(2,"leci");
      nama_buah.add(7,"Mangga");
   
        System.out.println("Nama Buah setelah di tambah element: " + nama_buah);//print list buah di tambah 2 element
        System.out.println("Jumlah Buah : " + nama_buah.size() + "\n");//print jumlah buah setelah di tambah 2 element
        System.out.println("==========================");
    
   LinkedList<Object> nama_buah2 = new LinkedList<>();//object agar bisa menambahkan integer
        nama_buah2.add(100);//menambah int angka 100
        nama_buah2.add(20);// menambah int angka 20
        nama_buah2.set(0,"kacang");//merubah int 100 menjadi string kacang
        
        nama_buah2.addAll(nama_buah);
    System.out.println("Nama Buah di tambah dengan angka dan merubah element : " + nama_buah2 );
    System.out.println("Ambil Buah : " + nama_buah2.get(2));//mengambil buah dengan
    System.out.println("Total Jumlah Buah dan Angka : " + nama_buah2.size());
   }
}

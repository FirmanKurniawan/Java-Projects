/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author zenalarifin
 */

/*
*If most of the elements of the matrix have 0 value, then it is called a sparse matrix
*instead of storing zeroes with non-zero elements, we only store non-zero elements.
* This means storing non-zero elements with triples- (Row, Column, value). 
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
    int sparseMatrix[ ] [ ]=
    {
        {0 , 0 , 3 , 0 , 4 },
        {0 , 0 , 5 , 7 , 0 },
        {0 , 0 , 0 , 0 , 0 },
        {0 , 2 , 6 , 0 , 0 }
    };
// count the number of non-zero elements 
int size=0;
for(int i=0;i<4;i++){
    for(int j=0;j<5;j++){
        if(sparseMatrix[i][j] != 0){
            size++;
        }
    }
}
//now store these values in triple form i.e. row ,column and value
int compactMatrix[][]=new int[3][size];
int k=0;
for(int i=0;i<4;i++){
    for(int j=0;j<5;j++){
        if(sparseMatrix[i][j] != 0){
            compactMatrix[0][k]=i;
            compactMatrix[1][k]=j;
            compactMatrix[2][k]=sparseMatrix[i][j];
            k++;
        }
    }
}
//print the array 
for(int arr[] : compactMatrix){
    for(int a : arr){
        System.out.print(a+" ");
    }
    System.out.println();
}
    }
}

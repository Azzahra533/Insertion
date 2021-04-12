/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Scanner;

/**
 *
 * @author 26218
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.print("Banyaknnya data : ");
        int N = in.nextInt();
        int data [] = new int[N];
        for(int i=0; i<N; i++) {
            System.out.print("Data ke-"+(i+1)+" : ");
            data [i]= in.nextInt();
        }
        
        for(int i=0; i<data.length; i++) {
            int key=data[i];
            int j=i;
            while(j>0 && data[j-1]>key) {
                data [j]=data[j-1];
                j--;
            }
            data[j]=key;
        }
        System.out.print("Data yang telah berurutan : ");
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        
    }
    
}

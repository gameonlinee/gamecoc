/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.ui;

import java.util.Arrays;

public class BubbleSortAsc {
	public static void main(String[] args) {
		//	Variable
		int[] bilangan = {5, 12, 3, 19, 1, 47};
		
		//	Tampilkan bilangan
		System.out.println("Bilangan sebelum di sorting Bubble Sort : "+Arrays.toString(bilangan));
		
		//	Proses Bubble Sort
		System.out.println("\nProses Bubble Sort secara Ascending:");
		for(int a = 0; a < bilangan.length; a++) {
			//	Tampilkan proses Iterasi
			System.out.println("Iterasi "+(a+1));
			for(int b = 0; b < bilangan.length-1; b++) { if(bilangan[b] > bilangan[b+1]) {
					//	proses pertukaran bilangan
					int temp = bilangan[b];
					bilangan[b] = bilangan[b+1];
					bilangan[b+1] = temp;
				}
				
				//	Tampilkan proses pertukaran tiap iterasi
				System.out.println(Arrays.toString(bilangan));
			}
			System.out.println();
		}
		
		//	Tampilkan hasil akhir
		System.out.println("Hasil akhir setelah di sorting: "+Arrays.toString(bilangan));
	}
}
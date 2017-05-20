package com.toy.anagrams.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

import javafx.collections.ArrayChangeListener;

public class Driver {
	static int insert = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Coc> ft = new ArrayList<Coc>();
		ft.add(new Coc("Irhaz", "power", "50", "100", "fkip"));
		ft.add(new Coc("Yudi", "power", "40", "80", "fkip"));
		ft.add(new Coc("Sandy", "power", "20", "50", "fkip"));
		ft.add(new Coc("Satria", "power", "25", "60", "fkip"));
		ft.add(new Coc("Arin", "power", "31", "70", "fkip"));
		ft.add(new Coc("Denis", "power", "28", "60", "fkip"));
		ft.add(new Coc("Farid", "power", "27", "58", "fkip"));
		ft.add(new Coc("Rudi", "power", "31", "69", "fkip"));
		ft.add(new Coc("Debora", "power", "25", "56", "fkip"));
		ft.add(new Coc("Samid", "power", "28", "55", "fkip"));
		
		ArrayList<Coc> fkip = new ArrayList<Coc>();
		fkip.add(new Coc("Riki", "power", "37", "60", "ft"));
		fkip.add(new Coc("Yayan", "power", "40", "55", "ft"));
		fkip.add(new Coc("Yusron", "power", "45", "65", "ft"));
		fkip.add(new Coc("Rofif", "power", "36", "60", "ft"));
		fkip.add(new Coc("Widya", "power", "42", "75", "ft"));
		fkip.add(new Coc("OmFiqqih", "power", "47", "78", "ft"));
		fkip.add(new Coc("Sigit", "power", "44", "75", "ft"));
		fkip.add(new Coc("Alrizal", "power", "44", "60", "ft"));
		fkip.add(new Coc("Koko", "power", "47", "65", "ft"));
		fkip.add(new Coc("Aris", "power", "46", "56", "ft"));
		
		ArrayList<Coc> fikes = new ArrayList<Coc>();
		fikes.add(new Coc("Nanda", "power", "36", "78", "fikes"));
		fikes.add(new Coc("Bobby", "power", "45", "89", "fikes"));
		fikes.add(new Coc("Farid", "power", "27", "56", "fikes"));
		fikes.add(new Coc("Ilham", "power", "37", "68", "fikes"));
		fikes.add(new Coc("Fauzi", "power", "35", "74", "fikes"));
		fikes.add(new Coc("Bam", "power", "39", "65", "fikes"));
		fikes.add(new Coc("Wendy", "power", "38", "74", "fikes"));
		fikes.add(new Coc("Vallen", "power", "48", "95", "fikes"));
		fikes.add(new Coc("Reihan", "power", "43", "76", "fikes"));
		fikes.add(new Coc("Cicil", "power", "39", "69", "fikes"));
		
		Stack<Coc> Clan = new Stack<Coc>();
		
		
		
		Show method = new Show();
		method.showOne();
		insert = scan.nextInt();
		if(insert == 1) {
			method.nameClan();
			insert = scan.nextInt();
			if(insert == 1) {
				for(Coc  c:ft)
					System.out.println(c.getName()+" "+c.getRank()+" "+c.getLevel()+" "+c.getScore());
			}
			else if(insert == 2){
				for(Coc  c:fkip)
					System.out.println(c.getName()+" "+c.getRank()+" "+c.getLevel()+" "+c.getScore());
			}
			else  {
				for(Coc  c:fikes)
					System.out.println(c.getName()+" "+c.getRank()+" "+c.getLevel()+" "+c.getScore());
			}
		}
       
		else if(insert == 2) {
			
			System.out.println("Clan War antara fikes, ft , dan fkip dimenangkan oleh:");
			
		 Clan.push(ft.get(0));
			
			System.out.println(Clan.peek().getKlan());
			System.out.println("Dengan poin:");
			
Clan.push(ft.get(0));
			
			System.out.println(Clan.peek().getScore());
			
			
		}
	}
}

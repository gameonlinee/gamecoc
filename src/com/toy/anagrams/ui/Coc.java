/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.ui;

public class Coc {
	private String name;
	private String rank;
	private String level;
	private String score;
	public String klan;
	
	public Coc(String name, String rank, String level, String score, String klan) {
		setName(name);
		setRank(rank);
		setLevel(level);
		setScore(score);
		setKlan(klan);
	}
	public void setKlan(String klan) {
		this.klan = klan;
	}
	
	public String getKlan() {
		return klan;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setScore(String score) {
		this.score = score;
	}
	
	public String getScore() {
		return score;
	}
}

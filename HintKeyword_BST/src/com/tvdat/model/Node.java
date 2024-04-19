package com.tvdat.model;

public class Node {
	String word;
	Node leftWord;
	Node rightWord;
	public Node(String word) {
		this.word = word;
		this.leftWord = null;
		this.rightWord = null;
	}
}
package com.tvdat.model;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree implements BinarySearchTreeMethod {
	public Node root = null;
	@Override
	public void insertKeyword(String word) {
		root = _insertHelper(root, word);
	}
	
	Node _insertHelper(Node node, String word) {
		if(node == null) {
			return new Node(word);
		}
		if(word.compareTo(node.word) < 0) {
			// insert left
			node.leftWord = _insertHelper(node.leftWord, word);
		}
		else if(word.compareTo(node.word) > 0) {
			// insert right
			node.rightWord = _insertHelper(node.rightWord, word);
		}
		
		return node;
	}
	@Override
	public Node _findNodeWithPrefix(Node node, String prefix) {   // LNR
		if(node == null) return null;
		if(node.word.startsWith(prefix)) return node;
		if(prefix.compareTo(node.word) < 0) {
			return _findNodeWithPrefix(node.leftWord, prefix);
		}
		else {
			return _findNodeWithPrefix(node.rightWord, prefix);
		}
	}
	@Override
	public List<String> _collectWords(Node node) {
		List<String> words = new ArrayList<>();
		_inordeTraversal(node, words);
		return words;
 	}
	void _inordeTraversal(Node node, List<String>words) {    // LNR
		if(node == null) return;
		_inordeTraversal(node.leftWord, words);
		words.add(node.word);
		_inordeTraversal(node.rightWord, words);
	}
	@Override
	public List<String> autoComplete(String prefix) {
		Node currentNode = _findNodeWithPrefix(root, prefix);
		return currentNode == null ? new ArrayList<>() : _collectWords(currentNode);
 	}

}

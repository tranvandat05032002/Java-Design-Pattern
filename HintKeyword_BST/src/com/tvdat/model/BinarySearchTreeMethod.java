package com.tvdat.model;

import java.util.List;

public interface BinarySearchTreeMethod {
	void insertKeyword(String word);
	List<String>autoComplete(String prefix);
	Node _findNodeWithPrefix(Node node, String prefix);
	List<String> _collectWords(Node node);
}

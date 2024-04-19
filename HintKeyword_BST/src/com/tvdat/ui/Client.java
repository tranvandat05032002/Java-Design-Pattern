package com.tvdat.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.tvdat.model.BinarySearchTree;

public class Client {
	public static void main(String[] args) {
		var bst = new BinarySearchTree();
		bst.insertKeyword("hello");
		bst.insertKeyword("application");
		bst.insertKeyword("apple");
		bst.insertKeyword("house");
        System.out.println("Nhập một dòng văn bản:");
			System.out.println("Enter your key search: ");
			String path = "/Users/spiderman/Documents/DHKH_2021-2025/DP_Java/HintKeyword_BST/src/lib/input.txt";
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				while(true) {
					String line = br.readLine();
					if (line == null)
						break;
					List<String> lstResult = bst.autoComplete(line);
					System.out.println("suggestion: " + line);
					for(String item: lstResult) {
						System.out.println(item);
					}
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

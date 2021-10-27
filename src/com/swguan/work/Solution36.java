package com.swguan.work;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * author: swGuan
 * 1. check rows.add() cols.add() and cubes.add() to check any exist
 * 
 * { {'5','3','.','.','7','.','.','.','.'}
 * ,{'6','.','.','1','9','5','.','.','.'} ,{'.','9','8','.','.','.','.','6','.'}
 * ,{'8','.','.','.','6','.','.','.','3'} ,{'4','.','.','8','.','3','.','.','1'}
 * ,{'7','.','.','.','2','.','.','.','6'} ,{'.','6','.','.','.','.','2','8','.'}
 * ,{'.','.','.','4','1','9','.','.','5'} ,{'.','.','.','.','8','.','.','7','9'}
 * }
 * 
 * {{'8','3','.','.','7','.','.','.','.'} ,{'6','.','.','1','9','5','.','.','.'}
 * ,{'.','9','8','.','.','.','.','6','.'} ,{'8','.','.','.','6','.','.','.','3'}
 * ,{'4','.','.','8','.','3','.','.','1'} ,{'7','.','.','.','2','.','.','.','6'}
 * ,{'.','6','.','.','.','.','2','8','.'} ,{'.','.','.','4','1','9','.','.','5'}
 * ,{'.','.','.','.','8','.','.','7','9'}}
 * 
 */
public class Solution36 {

	public boolean isValidSudoku(char[][] board) {
		HashMap<Integer, Set<Character>> rows = new HashMap<>();
		HashMap<Integer, Set<Character>> cols = new HashMap<>();
		HashMap<Integer, Set<Character>> subs = new HashMap<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.')
					continue;

				Set<Character> col = cols.get(j);
				if (col == null) {
					col = new HashSet<>();
					cols.put(j, col);
				}

				Set<Character> row = rows.get(i);
				if (row == null) {
					row = new HashSet<>();
					rows.put(i, row);
				}

				int subIdx = i / 3 + j / 3 * 3;
				Set<Character> sub = subs.get(subIdx);
				if (sub == null) {
					sub = new HashSet<>();
					subs.put(subIdx, sub);
				}

				if (!col.add(board[i][j]) || !row.add(board[i][j]) || !sub.add(board[i][j])) {
					return false;
				}

			}
		}
		return true;
	}

}

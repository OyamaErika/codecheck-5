package codecheck;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		int crd = Integer.parseInt(args[0]);
		ArrayList<Integer> listPower = new ArrayList<Integer>();
		ArrayList<Integer> listCost = new ArrayList<Integer>();
		int num = 0;

		for (int i = 0 ; num < crd; i = i+2) {
			listPower.add(num, Integer.parseInt(args[i+2]));
			listCost.add(num, Integer.parseInt(args[i+3]));
			num++;
		}

		int ans = 0;
		int deleteFlg = 1;

		while (deleteFlg == 1) {
			int mp = Integer.parseInt(args[1]);
			int maxNum = 0;
			int tempNum = 0;
			int deleteNum = 0;

			for (int i = 0, l = listPower.size(); i < l; i++) {
				tempNum = listPower.get(i);
				if (tempNum > maxNum && mp >= tempNum) {
					maxNum = tempNum;
					deleteNum = i;
				}
			}

			if (maxNum == 0) {
				deleteFlg = 0;
			} else {
				mp = mp - maxNum;
				ans = ans + maxNum;
				listPower.remove(deleteNum);
				listCost.remove(deleteNum);
			}
		}
		System.out.println(ans);
		}
	}

package jp.co.aforce.test;

public class MinMax {

	int a = 4;
	int b = 2;
	int c = 10;
	int ans1 = a;
	int ans2 = a;

	public int getMaxValue(int a, int b, int c) {
		if (ans1 < b) {
			ans1 = b;
		}
		if (ans1 < c) {
			ans1 = c;
		}
		return ans1;
	}

	public int getMimValue(int a, int b, int c) {
		if(ans2 > b) {
			ans2 = b;
		} 
		if(ans2 > c) {
			ans2 = c;
		}
		return ans2;
	}
		
		
}

import java.io.*;
public class sixBYsix {

	public static void main(String[] args) {
		int[] sumArr = new int [36];
		int[][] jArr = {
                {-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}
             };
		int maximum = Integer.MIN_VALUE;
		for(int row=0; row<jArr.length-2; row++) {
			for(int column=0; column<jArr.length-2; column++) {
				int sum = (jArr[row][column] + jArr[row][column+1] + jArr[row][column+2]
										 + jArr[row+1][column+1]
					  + jArr[row+2][column] + jArr[row+2][column+1] + jArr[row+2][column+2]
					);
				maximum = Math.max(maximum, sum);
			}
		}
		System.out.println(maximum);
	}
}

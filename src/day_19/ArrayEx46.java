/*
 * # ��÷���� 1��Ʈ
 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
 * 2. �������� 5���� ������ �����ϵ�,
 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
 */

package day_19;

import java.util.Random;

public class ArrayEx46 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[][] lottoSet = new int[5][7];
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;i++)
			{
				int num = ran.nextInt(10);
				lottoSet[i][j] = num;
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;i++)
			{
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

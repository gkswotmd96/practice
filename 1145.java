import java.util.Scanner;


public class one_three {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int SIZE = 5;
	    // 5���� �ڿ���
	    int[] arr = new int[SIZE];
	    int min = 100;

	    // �ڿ��� �Է�. 100���� �۰ų� ���� ���� �ٸ� �ڿ���
	    for (int i = 0; i < SIZE; i++) {
	      arr[i] = sc.nextInt();

	      if (min > arr[i]) {
	        min = arr[i];
	      }
	    }

	    int cnt = 0;
	    while (true) {  // ���� �� �ִ� ���� ū ���� 100 * 99 * 98 = 970,200
	      for (int i = 0; i < SIZE; i++) {
	        if (min % arr[i] == 0) cnt++;
	      }

	      // ��� �� ���� �ڿ����� ���������� ��� �ݺ��� Ż��
	      if (cnt >= 3) break;

	      cnt = 0;
	      min++;
	    }

	    System.out.println(min);
	  }
}


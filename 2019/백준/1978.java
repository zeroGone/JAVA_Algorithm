/* 1978번 소수 찾기
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 입력:
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 출력:
 * 주어진 수들 중 소수의 개수를 출력한다.
 * */
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int[] a = new int[N];
		boolean[] check = new boolean[N];
		
		for(int i=0; i<a.length; i++) {
			a[i]=input.nextInt();
			if(a[i]!=1) check[i]=true;
		}
		
		for(int i=0; i<a.length; i++) for(int j=2; j<a[i]; j++) {
			if(a[i]%j==0) {
				check[i]=false;
				break;
			}
		}
		
		int count = 0;
		for(int i=0; i<check.length; i++) {
			if(check[i]) count++;
		}
		
		System.out.println(count);
	}
}
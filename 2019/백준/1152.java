/* 1152번 단어의 개수 
 * 영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 
 * 이 문장에는 몇 개의 단어가 있을까? 
 * 이를 구하는 프로그램을 작성하시오.
 * 입력:
 * 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 
 * 이 문장의 길이는 1,000,000을 넘지 않는다. 
 * 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.
 * 출력:
 * 첫째 줄에 단어의 개수를 출력한다.
 * */

//졸라 짜증났던 문제
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> wordList = new ArrayList<>();
		
		String sentence = input.nextLine();
		
		StringBuilder builder = new StringBuilder();
		
		//첫번째가 공백일때, 두번째가 공백일때 처리해야했다
		for(int i=0; i<sentence.length(); i++) {
			char word = sentence.charAt(i);
			if(word==' '&&i!=0) {
				wordList.add(builder.toString());
				builder.delete(0, builder.length());
			}else if(i==sentence.length()-1&&word!=' ') {
				builder.append(word);
				wordList.add(builder.toString());
			}
			else builder.append(word);
		}
		
		System.out.println(wordList.size());
	}
}


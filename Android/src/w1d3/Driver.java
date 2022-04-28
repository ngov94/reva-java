package w1d3;

import java.util.Scanner;

import w1d2.Word;

public class Driver {
	

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		NeenasList<Word> list = new NeenasList<Word>();
		boolean running = true;
		
		while(running) {
			String input = in.nextLine();
			if(input.equals("add")) {
				input = in.nextLine();
				Word w = new Word(input.toCharArray());
				list.addToFront(w);
				System.out.println(list);
			}else if(input.equals("exit")) {
				running = false;
			}else if(input.equals("removefront")) {
				list.removeFromFront();
				System.out.println(list);
			}else if(input.equals("get")) {
				input = in.nextLine();
				System.out.println(list.getIndex(Integer.parseInt(input)));
			}else if(input.equals("removeIndex")) {
				input = in.nextLine();
				list.removeIndex(Integer.parseInt(input));
				System.out.println(list);
			}
			
		}
		
		in.close();
	}
}

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
			}else if(input.equals("addAtIndex")) {//TASK 1
				input = in.nextLine();
				String input2 = in.nextLine();
				Word w = new Word(input.toCharArray());
				list.addAtIndex(w,Integer.parseInt(input2));
				System.out.println(list);
			}else if(input.equals("contains")) {//TASK 2
				input = in.nextLine();
				Word w = new Word(input.toCharArray());
				System.out.println(list.contains(w));
				
			}if(input.equals("compareList")) {//TASK 3
				NeenasList<Word> compare = new NeenasList<Word>();
				String dog = "dog";
				String cat = "cat";
				String mouse = "mouse";
				compare.addToFront(new Word(dog.toCharArray()));
				compare.addToFront(new Word(cat.toCharArray()));
				compare.addToFront(new Word(mouse.toCharArray()));
				
				System.out.println(list.equalList(compare));
				System.out.println(list);
				System.out.println(compare);
			}
			
		}
		
		in.close();
	}
}

/**
 * 
 */
package CSCI2010L;

import java.util.*;

/**
 * @author sohel
 *
 */
public class Lab01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] buffer = {10, 56, 1, -45, 101, 33, 31};
		Lab04 lab = new Lab04();
		
		//lab.findMax();
		int [] sortedArray = lab.mySort(buffer);
		
		for(int val: buffer) {
			System.out.println(val);
		}
		
		System.out.println("------------------");
		
		for(int val: sortedArray) {
			System.out.println(val);
		}
		/*	
		ArrayList<ToDoList> taskList = new ArrayList<ToDoList>();
		String strTask;
		ToDoList toDoList;
		boolean status = false;
		
		strTask = "Lab 1";
		ToDoList task1 = new ToDoList(strTask);
		
		strTask = "Lab 2";
		ToDoList task2 = new ToDoList(strTask);

		strTask = "Lab 3";
		ToDoList task3 = new ToDoList(strTask);
		
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		
		for(ToDoList _t: taskList){
			System.out.println(_t.getTask());
		}
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
		final String cmd1 = "Enter a command number (1 to Show, 2 to Add, 3 to Up, 4 to Down, 5 to Complete) or 6 to End\n";
		final String cmd2 = "Enter the task: ";
		final String cmd3 = "Enter a command number (1 to Show, 2 to Add, 3 to Up, 4 to Down, 5 to Complete) or 6 to End\n";
		String task;
		boolean loop = true;
		int option = 0;
		
		do {
			System.out.print(cmd1);
			option = Integer.valueOf(sc.next());
			switch(option) {
				case 1: 
					showList(taskList);
					break;
				case 2: 
					System.out.printf(cmd2);
					task = sc.nextLine();
					toDoList = new ToDoList(task);
					taskList.add(toDoList);
					break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: 
					loop = false;
					break;
				default: break;
			}
			
		}while(loop);
		
		System.out.printf("Program Terminates!\n");
	*/	
			
	}
	
	private static void showList(ArrayList<ToDoList> param) {
		for(ToDoList _t: param){
			System.out.println(_t.getTask());
		}
		
	}

}

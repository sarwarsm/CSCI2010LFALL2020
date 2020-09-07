/**
 * 
 */
package CSCI2010L;

/**
 * @author sohel
 *
 */

import java.util.*;
import java.util.Collections;  // Import the Collections class

public class ToDoList {
	private String task;
	private boolean status;
	
	public ToDoList() {
		task = "";
		status = false;
	}
	
	public ToDoList(String param1) {
		task = param1;
		status = false;
	}

	public void setTask(String param) {
		task = param;
	}
	
	public String getTask() {
		return task;
	}
	
}

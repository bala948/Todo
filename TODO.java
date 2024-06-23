//TODO1.java
import java.util.*;
class TODO1{
public static void main(String args[]){
	ArrayList<String> tasks=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	
	while (true){
		System.out.println("TO-DO List:");
		int sno=1;
		for (String task:tasks){
			System.out.println((sno++)+"."+task);
		}
		System.out.println();
		
		System.out.println("Options:");
		String options="1. Add Task\n";
		options+="2. Remove Task\n";
		options+="3. Quit\n";
		System.out.println(options);
		
		System.out.print("Enter your Choice: ");
		int option=sc.nextInt();
		sc.nextLine();
		
		if (option==1){
			
			System.out.print("Enter the task to add: ");
			String task=sc.nextLine();
			
			tasks.add(task);
			System.out.println("Task added ");
			System.out.println();
			
		}else if (option==2){
			System.out.print("Enter task number to remove: ");
			int taskno=sc.nextInt();
			System.out.println();
			tasks.remove(taskno-1);
			System.out.println("Task removed");
			
		}else if (option==3){
			System.out.println("Good bye!");
			System.exit(0);
		}else{
			System.out.println("Invalid option entered "+option);
		}//else
		
		
		
	}//while()
}//main()
}//class

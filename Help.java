class Help {
	public static void main(String[] args)
	throws java.io.IOException {
		
		System.out.println("Help on:\n\n 1. if\n 2. switch\n 3. for loop\n 4. while loop\n 5. do/while loop\n 6. Break\n 7. Continue\n");
		System.out.println("To quit press q\n");
		
		
		char choice, ignore;
		// do while loop
		do {
			System.out.print("Your choice: "); 
			choice = (char) System.in.read();
			
			// gets rid of new line character
			do {
				ignore = (char)System.in.read();
			} while(ignore != '\n');
			

			if (choice == '1') {
				System.out.println("\n The if:\n\n if(condition) {\n\tstatement sequence;\n }\n");
			}

			else if (choice == '2') {
				System.out.println("\n The switch:\n\n switch(expression) {\n\tcase constant: \n\t\tstatement sequence\n\t\tbreak;\n\t// ...\n }\n");
			}

			else if (choice == '3') {
				System.out.println("\n For Loop: \n\n\t for(initialization; condition; iteration) {\n\t\tstatement sequence\n\t }\n");
			}

			else if (choice == '4') {
				System.out.println("\n While Loop:\n\n\t while (condition) {\n\t\tstatement sequence\n\t }\n");
			}

			else if (choice == '5') {
				System.out.println("\n Do/while Loop:\n\n\t do {\n\t\tstatements\n\t } while (condition);\n");
			}

			else if (choice == '6') {
				System.out.println("\n Break: \n\n\t break;\n");
			}

			else if (choice == '7') {
				System.out.println("\n Continue: \n\n\t continue;\n");
			}

			else if (choice != 'q') {
				System.out.println("\nLook back at the Help list please.\nYour choice is not available....yet.\n");
			}
		
		}
		while (choice != 'q');
	}
}
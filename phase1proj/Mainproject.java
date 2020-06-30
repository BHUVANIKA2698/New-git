package phase1proj;

import java.util.*;

public class Mainproject {

		public static void main(String[] args) 
		{
			Projectbo projbo=new Projectboimplements();
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Welcome to Project");
				int input = 0;
				do {
					System.out.println("Press 1 to add file to the existing folder");
					System.out.println("Press 2 to delete file to the existing folder");
					System.out.println("Press 3 to return the files in ascending order");
					System.out.println("Press 4 to search the file from existing folder");
					
					input =scanner.nextInt();
					
					switch (input) 
					{
					case 1:
						System.out.println(" enter the file name to create");
						String filename=scanner.next();
						projbo.createfiles(filename);
						break;
					case 2:
						System.out.println("enter a file name to delete");
							String fname=scanner.next();
							projbo.delete(fname);
							break;
					case 3:
						System.out.println("you will find all files in ascending order");
						projbo.listallfiles();
						break;
					case 4:
						System.out.println("enter the file name to search");
						String nametosearch=scanner.next();
						projbo.search(nametosearch);
						break;
					case 5:
						break;
					}
				}
				while(input!=3);
			}
			System.out.println("end");
			}
		}

		

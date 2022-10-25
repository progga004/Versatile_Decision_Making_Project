//Name: Progga Paromita Dutta
//Id:114751436

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * This is the main class which makes use of all the classes of the tree
 * @author Progga Paromita Dutta
 *
 */
public class TreeDriver 
{
/**
 * This is the main method which makes use of all the classes
 * @param args-unused
 * @throws IOException when the file is not found
 
 */
	public static void main(String[] args) throws IOException

	{
		Scanner input=new Scanner(System.in); 
		BufferedReader reader; 
		int childNumber=0; 
		String parentLabel="";
		String[]split;
		int track=0;
		Tree newTree=new Tree(); // creating new object
		TreeNode newNode = new TreeNode(); // creating new node
		System.out.println("L - Load a Tree.");
		System.out.println("H - Begin a Help Session.");
		System.out.println("T - Traverse the Tree in preorder.");
		System.out.println("Q - Quit");
		String choice;
		do {
			System.out.println("Choice>"); 
			choice=input.nextLine();
			choice=choice.toUpperCase(); 
			
		
		switch(choice)
		{ 
			 
			case"L": 
			{
				String line=""; 
				
				System.out.println("Please enter the file name: ");
				String s=input.nextLine();
				
				try
				{
					reader=new BufferedReader(new FileReader(s));
				
					line=reader.readLine(); 
					int i=1;
					
					while(line!=null)
					{
						while(i<=4)
						{
							if(i==1)
							{
	
								 newNode.setLabel(line);
								
								
								break; 
							}
							else if(i==2)
							{
								
								newNode.setPrompt(line);
								
								break; 
							}
							else if(i==3)
							{
								
								newNode.setMessage(line);
								
								
								if(newTree.getRoot()==null)	
									break;
								
								else
								{
															
									newTree.addNode(newNode.getLabel(), newNode.getPrompt(),newNode.getMessage(),parentLabel);
									track--;								
									
									if(track<1)
									{
										break; 
									}
									
									i=0; 
									break; 
								}
							}
							else if(i==4)
							{
								
								split=line.split(" "); 
								if(split.length!=2) 
									throw new IllegalArgumentException(); 
								parentLabel=split[0]; 
								childNumber=Integer.parseInt(split[1]);
								
								if(newTree.getRoot()==null)
								{
									newTree.setRoot(newNode);
									track=childNumber; 
								}
								else
								{
									track=childNumber; 
									
								}
								
								
								(newTree.getNodeReference(parentLabel)).setChildNumber(childNumber); 							
								
								i=0;
								break; 
							}
						}
						line=reader.readLine();//read the next line
						i++; 						
						
					}
				}catch(FileNotFoundException e)
				{
					System.out.println("File is not found!!");	
					e.printStackTrace();
				} catch (StringOutOfRangeException e) {
					e.printStackTrace();
				}
				System.out.println("Tree created successfully!");
				break; 
			}
			
			case"H": 
			{
				System.out.println("You have selected to begin a help session!");
				System.out.println("Session starting...");
		    	
				try
				{
					newTree.beginSession();
				}catch(NullPointerException e)
				{
					e.printStackTrace(); 
				}
				if(newTree.getRoot()!=null)
				System.out.println("Thank you for using the automated help service!");
				break; 
			}
			case"T": 
			{
				System.out.println("Traversing the tree in preorder: ");
				try
				{
					newTree.preOrder();
				}catch(NullPointerException e)
				{
					e.printStackTrace();
				}
				break; 
			}
			case"Q": 
			{
				System.out.println("Thank you for using our automated help system!");
				
				
				break; 
			}
			default: 
			{
				System.out.println("Invalid choice!! Please enter an option from the menu..\n");
				break; 			
			}
			
		}
		
		}while(choice!="Q");
		
		
	}
}


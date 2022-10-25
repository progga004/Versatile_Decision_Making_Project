//Name: Progga Paromita Dutta
// Id:114751436
import java.util.Scanner; 
/**
 * This class is implemented to add a node to the tree
 * @author Progga Paromita Dutta
 *
 */
public class Tree 
{
	private TreeNode root; 
	Scanner input=new Scanner(System.in);
	boolean debug=false;
	private TreeNode newNode;
	/**
	 * This is a no argument constructor which sets the root to null
	 */
	public Tree()
	{
		root=null; 
	}
	/**
	 * This setter method is used to set the root of the tree
	 * @param node-the node that has to be set
	 */
	public void setRoot(TreeNode node) 
	{ 
		this.root=node;
	}
	/**
	 * @return the root of the tree
	 */
	public TreeNode getRoot()
	{
		return root; 
	}
	/**
	 * This is a method to get the reference of the parent node
	 * @param root-the main node of a tree
	 * @param parentLabel-the label that has to be referenced
	 * @return the treenode where it has to be added
	 */
public TreeNode getNodeReference_helper(TreeNode root, String parentLabel) {
		
	if(debug)
	{
		System.out.println(root.getLabel()+" "+root.getLabel().length());
		System.out.println(parentLabel+" "+parentLabel.length());
	}
		if(root.getLabel().trim().equals(parentLabel.trim()))
		{
		   return root;
		}
		else if(root.getLeft1()!=null && (root.getLeft1().getLabel().trim()).equals(parentLabel.trim()))
			{return root.getLeft1(); }
		else if(root.getMiddle2()!=null && (root.getMiddle2().getLabel().trim()).equals(parentLabel.trim()))
			return root.getMiddle2(); 
		else if(root.getRight3()!=null && (root.getRight3().getLabel().trim()).equals(parentLabel.trim()))
			return root.getRight3();
		else if(root.getLeft4()!=null && (root.getLeft4().getLabel().trim()).equals(parentLabel.trim()))
			return root.getLeft4(); 
		else if(root.getMiddle5()!=null && (root.getMiddle5().getLabel().trim()).equals(parentLabel.trim()))
			return root.getMiddle5();
		else if(root.getRight6()!=null && (root.getRight6().getLabel().trim()).equals(parentLabel.trim()))
			return root.getRight6();
		else if(root.getLeft7()!=null && (root.getLeft7().getLabel().trim()).equals(parentLabel.trim()))
			return root.getLeft7();
		else if(root.getMiddle8()!=null && (root.getMiddle8().getLabel().trim()).equals(parentLabel.trim()))
			return root.getMiddle8();
		else if(root.getRight9()!=null && (root.getRight9().getLabel().trim()).equals(parentLabel.trim()))
			return root.getRight9();
		//recursion starts from here
		if(root.getLeft1()!=null)
		{
			newNode=getNodeReference_helper(root.getLeft1(),parentLabel);
			if(newNode!=null)
				return newNode; 
		}
		if(root.getMiddle2()!=null)
		{
			newNode=getNodeReference_helper(root.getMiddle2(),parentLabel);
			if(newNode!=null)
				return newNode;
		}
		if(root.getRight3()!=null)
		{
			newNode=getNodeReference_helper(root.getRight3(),parentLabel); 
			if(newNode!=null)
				return newNode;
		}
		if(root.getLeft4()!=null)
		{
			newNode=getNodeReference_helper(root.getLeft4(),parentLabel); 
			if(newNode!=null)
				return newNode; 		
		}
		if(root.getMiddle5()!=null)
		{
			newNode=getNodeReference_helper(root.getMiddle5(),parentLabel); 
			if(newNode!=null)
				return newNode; 		
		}
		if(root.getRight6()!=null)
		{
			newNode=getNodeReference_helper(root.getRight6(),parentLabel); 
			if(newNode!=null)
				return newNode; 		
		}
		if(root.getLeft7()!=null)
		{
			newNode=getNodeReference_helper(root.getLeft7(),parentLabel); 
			if(newNode!=null)
				return newNode; 		
		}
		if(root.getMiddle8()!=null)
		{
			newNode=getNodeReference_helper(root.getMiddle8(),parentLabel); 
			if(newNode!=null)
				return newNode; 		
		}
		if(root.getRight9()!=null)
		{
			newNode=getNodeReference_helper(root.getRight9(),parentLabel); 
			if(newNode!=null)
				return newNode; 		
		}
		return null;
		
	}
	/**
	 * This method is implemented to find the node with the given parentLabel
	 * @param parentLabel-the label that has to be found
	 * @return a node with the expected result
	 */
	
	public TreeNode getNodeReference(String parentLabel)
	{
		return getNodeReference_helper(this.root,parentLabel);	
	}
	public boolean addNode(String label, String prompt, String message, String parentLabel) 
	{
		
		TreeNode p=getNodeReference(parentLabel); // creation of a newNode
		if(p==null)
			throw new NullPointerException(); 		
		
		if(p.getLeft1()==null)
		{
			addNodeLeft1(label,prompt,message,p); 
			return true; 
		}
		else if(p.getMiddle2()==null)
		{
			addNodeMiddle2(label,prompt,message,p); 
			return true; 
		}
		else if(p.getRight3()==null)
		{
			addNodeRight3(label,prompt,message,p); 
			return true; 
		}
		else if(p.getLeft4()==null)
		{
			addNodeLeft4(label,prompt,message,p); 
			return true; 
		}
		else if(p.getMiddle5()==null)
		{
			addNodeMiddle5(label,prompt,message,p); 
			return true; 
		}
		else if(p.getRight6()==null)
		{
			addNodeRight6(label,prompt,message,p); 
			return true; 
		}
		else if(p.getLeft7()==null)
		{
			addNodeLeft7(label,prompt,message,p); 
			return true; 
		}
		else if(p.getMiddle8()==null)
		{
			addNodeMiddle8(label,prompt,message,p); 
			return true; 
		}
		else if(p.getRight9()==null)
		{
			addNodeRight9(label,prompt,message,p); 
			return true; 
		}
		else 
			return false; }
	/**
	 * This method is used to add a node 1 on the left	
	 * @param label-the label that has to be set
	 * @param prompt-the prompt that has to be set
	 * @param message-the message that has to be shown
	 * @param parentNode-the root node that has to added to
	 */
		public void addNodeLeft1(String label, String prompt, String message,TreeNode parentNode)
		{
				
			TreeNode p=new TreeNode(label,prompt,message);
			p.setLeft1(null);
			p.setMiddle2(null);
			p.setRight3(null);
			p.setLeft4(null);
			p.setMiddle5(null);
			p.setRight6(null);
			p.setLeft7(null);
			p.setMiddle8(null);
			p.setRight9(null);
			parentNode.setLeft1(p); 
		}
		
	/**
	 * This method is used to add a node 2 on the middle	
	 * @param label-the label that has to be set
	 * @param prompt-the prompt that has to be set
	 * @param message-the message that has to be shown
	 * @param parentNode-the root node that has to added to
	 */
		
		public void addNodeMiddle2(String label,String prompt,String message,TreeNode parentNode)
		{
				
			TreeNode p=new TreeNode(label,prompt,message);
			p.setLeft1(null);
			p.setMiddle2(null);
			p.setRight3(null);
			p.setLeft4(null);
			p.setMiddle5(null);
			p.setRight6(null);
			p.setLeft7(null);
			p.setMiddle8(null);
			p.setRight9(null);
			parentNode.setMiddle2(p);
		}
		
	/**
	 * This method is used to add a node 3 on the right	
	 * @param label-the label that has to be set
	 * @param prompt-the prompt that has to be set
	 * @param message-the message that has to be shown
	 * @param parentNode-the root node that has to added to
	 */
		public void addNodeRight3(String label,String prompt,String message,TreeNode parentNode)
		{
			
			TreeNode p=new TreeNode(label,prompt,message);
			p.setLeft1(null);
			p.setMiddle2(null);
			p.setRight3(null);
			p.setLeft4(null);
			p.setMiddle5(null);
			p.setRight6(null);
			p.setLeft7(null);
			p.setMiddle8(null);
			p.setRight9(null);
			parentNode.setRight3(p);
		}
		
	/**
	 * This method is used to add a node 4 on the left	
	 * @param label-the label that has to be set
	 * @param prompt-the prompt that has to be set
	 * @param message-the message that has to be shown
	 * @param parentNode-the root node that has to added to
	 */
		public void addNodeLeft4(String label,String prompt,String message,TreeNode parentNode)
		{TreeNode p=new TreeNode(label,prompt,message);
		p.setLeft1(null);
		p.setMiddle2(null);
		p.setRight3(null);
		p.setLeft4(null);
		p.setMiddle5(null);
		p.setRight6(null);
		p.setLeft7(null);
		p.setMiddle8(null);
		p.setRight9(null);
		parentNode.setLeft4(p); 
		}
		
	/**
	 * This method is used to add a node 5 on the middle	
	 * @param label-the label that has to be set
	 * @param prompt-the prompt that has to be set
	 * @param message-the message that has to be shown
	 * @param parentNode-the root node that has to added to
	 */
		public void addNodeMiddle5(String label,String prompt,String message,TreeNode parentNode)
		{
			TreeNode p=new TreeNode(label,prompt,message);
			p.setLeft1(null);
			p.setMiddle2(null);
			p.setRight3(null);
			p.setLeft4(null);
			p.setMiddle5(null);
			p.setRight6(null);
			p.setLeft7(null);
			p.setMiddle8(null);
			p.setRight9(null);
			parentNode.setMiddle5(p); 
		}
		
	/**
	 * This method is used to add a node 6 on the right	
	 * @param label-the label that has to be set
	 * @param prompt-the prompt that has to be set
	 * @param message-the message that has to be shown
	 * @param parentNode-the root node that has to added to
	 */
		public void addNodeRight6(String label,String prompt,String message,TreeNode parentNode)
		{
			TreeNode p=new TreeNode(label,prompt,message);
			p.setLeft1(null);
			p.setMiddle2(null);
			p.setRight3(null);
			p.setLeft4(null);
			p.setMiddle5(null);
			p.setRight6(null);
			p.setLeft7(null);
			p.setMiddle8(null);
			p.setRight9(null);
			parentNode.setRight6(p); 
		}
		/**
		 * This method is used to add a node 7 on the right	
		 * @param label-the label that has to be set
		 * @param prompt-the prompt that has to be set
		 * @param message-the message that has to be shown
		 * @param parentNode-the root node that has to added to
		 */
		public void addNodeLeft7(String label,String prompt,String message,TreeNode parentNode)
		{
			TreeNode p=new TreeNode(label,prompt,message);
			p.setLeft1(null);
			p.setMiddle2(null);
			p.setRight3(null);
			p.setLeft4(null);
			p.setMiddle5(null);
			p.setRight6(null);
			p.setLeft7(null);
			p.setMiddle8(null);
			p.setRight9(null);
			parentNode.setLeft7(p); 
		}
		/**
		 * This method is used to add a node 8 on the middle	
		 * @param label-the label that has to be set
		 * @param prompt-the prompt that has to be set
		 * @param message-the message that has to be shown
		 * @param parentNode-the root node that has to added to
		 */
		public void addNodeMiddle8(String label,String prompt,String message,TreeNode parentNode)
		{
			TreeNode p=new TreeNode(label,prompt,message);
			p.setLeft1(null);
			p.setMiddle2(null);
			p.setRight3(null);
			p.setLeft4(null);
			p.setMiddle5(null);
			p.setRight6(null);
			p.setLeft7(null);
			p.setMiddle8(null);
			p.setRight9(null);
			parentNode.setMiddle8(p); 
		}
		/**
		 * This method is used to add a node 9 on the right	
		 * @param label-the label that has to be set
		 * @param prompt-the prompt that has to be set
		 * @param message-the message that has to be shown
		 * @param parentNode-the root node that has to added to
		 */
		public void addNodeRight9(String label,String prompt,String message,TreeNode parentNode)
		{
			TreeNode p=new TreeNode(label,prompt,message);
			p.setLeft1(null);
			p.setMiddle2(null);
			p.setRight3(null);
			p.setLeft4(null);
			p.setMiddle5(null);
			p.setRight6(null);
			p.setLeft7(null);
			p.setMiddle8(null);
			p.setRight9(null);
			parentNode.setRight9(p); 
		}
		/**
	/**
	 * This is the method to add a node to the existing tree
	 * @param label-the label that has to be given
	 * @param prompt-the prompt that has to be given
	 * @param message-the message that has to be shown
	 * @param parentLabel-the parentLabel where it has to added
	 * @return true or false whether it is added or not
	 */
	/*public boolean addNode(String label, String prompt, String message, String parentLabel) 
	{
		
		TreeNode p=getNodeReference(parentLabel); // creation of a newNode
		if(p==null)
			throw new NullPointerException(); 		
		
		if(p.getLeft1()==null)
		{
			addNodeLeft1(label,prompt,message,p); 
			return true; 
		}
		else if(p.getMiddle2()==null)
		{
			addNodeMiddle2(label,prompt,message,p); 
			return true; 
		}
		else if(p.getRight3()==null)
		{
			addNodeRight3(label,prompt,message,p); 
			return true; 
		}
		else if(p.getLeft4()==null)
		{
			addNodeLeft4(label,prompt,message,p); 
			return true; 
		}
		else if(p.getMiddle5()==null)
		{
			addNodeMiddle5(label,prompt,message,p); 
			return true; 
		}
		else if(p.getRight6()==null)
		{
			addNodeRight6(label,prompt,message,p); 
			return true; 
		}
		else if(p.getLeft7()==null)
		{
			addNodeLeft7(label,prompt,message,p); 
			return true; 
		}
		else if(p.getMiddle8()==null)
		{
			addNodeMiddle8(label,prompt,message,p); 
			return true; 
		}
		else if(p.getRight9()==null)
		{
			addNodeRight9(label,prompt,message,p); 
			return true; 
		}
		else 
			return false; 
	}*/
	

	/**
	 * This method is used to print the tree order in preorder form
	 * @throws NullPointerexception when no tree is loaded
	 */
    public void preOrder() throws NullPointerException
    {
    	if(root==null)
    		throw new NullPointerException("No tree is here");
    	if(root!=null)
    		preOrder(root); //the helper method to traversal tree in preorder form
    }
    /**
     * This is the helper method of preOrder method
     * @param root-the root from where it will be begining
     */
    public void preOrder(TreeNode root)
    {
    	System.out.println("Label: "+root.getLabel());
    	System.out.println("Prompt: "+root.getPrompt());
    	System.out.println("Message: "+root.getMessage());
    	
    	if(root.getLeft1()!=null)
    		preOrder(root.getLeft1()); 
    	if(root.getMiddle2()!=null)
    		preOrder(root.getMiddle2()); 
    	if(root.getRight3()!=null)
    		preOrder(root.getRight3()); 
    	if(root.getLeft4()!=null)
    		preOrder(root.getLeft4()); 
    	if(root.getMiddle5()!=null)
    		preOrder(root.getMiddle5());
    	if(root.getRight6()!=null)
    		preOrder(root.getRight6());
    	if(root.getLeft7()!=null)
    		preOrder(root.getLeft7());
    	if(root.getMiddle8()!=null)
    		preOrder(root.getMiddle8());
    	if(root.getRight9()!=null)
    		preOrder(root.getRight9());   	
    }	
   
    /**
     * This method is implemented to start questioning and answering the session
     * @throws NullPointerException when no tree is created
     */
    public void beginSession() throws NullPointerException
    {
    	if(root==null)
    		throw new NullPointerException("No tree has been created");
    	// checking whether the tree is leaf or not 
    	if(root.isLeaf()==true)
		{
			System.out.println(root.getMessage());
			return; 
		}
    	
    	System.out.println(root.getMessage());
    	//condition for 9 children 
    	for(int i=0;i<root.getChildNumber();i++)
    	{
    		if(i==0)
    			System.out.println((i+1)+"-"+root.getLeft1().getPrompt());
    		if(i==1)
    			System.out.println((i+1)+"-"+root.getMiddle2().getPrompt());
    		if(i==2)
    			System.out.println((i+1)+"-"+root.getRight3().getPrompt());
    		if(i==3)
    			System.out.println((i+1)+"-"+root.getLeft4().getPrompt());
    		if(i==4)
    			System.out.println((i+1)+"-"+root.getMiddle5().getPrompt());
    		if(i==5)
    			System.out.println((i+1)+"-"+root.getRight6().getPrompt());
    		if(i==6)
    			System.out.println((i+1)+"-"+root.getLeft7().getPrompt());
    		if(i==7)
    			System.out.println((i+1)+"-"+root.getMiddle8().getPrompt());
    		if(i==8)
    			System.out.println((i+1)+"-"+root.getRight9().getPrompt());
    	}
    	System.out.println("0-Exit Session");
    	System.out.print("Choice>");
    	String s=input.nextLine();
    	switch(s)
    	{
    		 
    		case "1":
    		{
    	    	System.out.println("\n");
    			System.out.println(root.getLeft1().getMessage());
    			beginSession(root.getLeft1());
    			break; 
    		}
    		
    		case "2": 
    		{
    	    	System.out.println("\n");
    			System.out.println(root.getMiddle2().getMessage());
    			beginSession(root.getMiddle2()); 
    			break; 
    		}
    		
    		case "3": 
    		{
    	    	System.out.println("\n");
    			System.out.println(root.getRight3().getMessage());
    			beginSession(root.getRight3()); 
    			break; 
    		}
    		case"4": 
    		{
    			System.out.println("\n");
    			System.out.println(root.getLeft4().getMessage());
    			beginSession(root.getLeft4()); 
    			break; 
    		}
    		case"5": 
    		{
    			System.out.println("\n");
    			System.out.println(root.getMiddle5().getMessage());
    			beginSession(root.getMiddle5()); 
    			break; 
    		}
    		case"6": 
    		{
    			System.out.println("\n");
    			System.out.println(root.getRight6().getMessage());
    			beginSession(root.getRight6()); 
    			break; 
    		}
    		case"7": 
    		{
    			System.out.println("\n");
    			System.out.println(root.getLeft7().getMessage());
    			beginSession(root.getLeft7()); 
    			break; 
    		}
    		case"8": 
    		{
    			System.out.println("\n");
    			System.out.println(root.getMiddle8().getMessage());
    			beginSession(root.getMiddle8()); 
    			break; 
    		}
    		case"9": 
    		{
    			System.out.println("\n");
    			System.out.println(root.getRight9().getMessage());
    			beginSession(root.getRight9()); 
    			break; 
    		}
    		case "0": 
    		{
    			return; 
    		}
    	}    	  	
    }
    /**
     * This is the helper method of the begin session method
     * @param node-the node that has to be used to start
     */
     public void beginSession(TreeNode node)
     {
     	// checking the leaf condition
 		if(node.isLeaf()==true)
 		{
 			System.out.println(node.getMessage());
 			return; 
 		}
 		
     	
     	
     	for(int i=0;i<node.getChildNumber();i++)
     	{
     		if(i==0)
     			System.out.println((i+1)+"-"+node.getLeft1().getPrompt());
     		if(i==1)
     			System.out.println((i+1)+"-"+node.getMiddle2().getPrompt());
     		if(i==2)
     			System.out.println((i+1)+"-"+node.getRight3().getPrompt());
     		if(i==3)
     			System.out.println((i+1)+"-"+root.getLeft4().getPrompt());
     		if(i==4)
     			System.out.println((i+1)+"-"+root.getMiddle5().getPrompt());
     		if(i==5)
     			System.out.println((i+1)+"-"+root.getRight6().getPrompt());
     		if(i==6)
     			System.out.println((i+1)+"-"+root.getLeft7().getPrompt());
     		if(i==7)
     			System.out.println((i+1)+"-"+root.getMiddle8().getPrompt());
     		if(i==8)
     			System.out.println((i+1)+"-"+root.getRight9().getPrompt());
     	}
     	
     	System.out.println("0-Exit Session");
       	System.out.print("Choice>");
     	String choice2=input.nextLine();
     	
     	switch(choice2)
     	{
     		
     		case "1": 
     		{	
     	    	System.out.println("\n");
     			System.out.println(node.getLeft1().getMessage());
     			beginSession(node.getLeft1()); 
     			break; 
     		}
     		
     		case "2": 
     		{
     	    	System.out.println("\n");
     			System.out.println(node.getMiddle2().getMessage());
     			beginSession(node.getMiddle2()); 
     			break; 
     		}
     		
     		case "3": 
     		{
     	    	System.out.println("\n");
     			System.out.println(node.getRight3().getMessage());
     			beginSession(node.getRight3()); 
     			break; 
     		}
     		case"4": 
     		{
     			System.out.println("\n");
     			System.out.println(root.getLeft4().getMessage());
     			beginSession(root.getLeft4()); 
     			break; 
     		}
     		case"5": 
     		{
     			System.out.println("\n");
     			System.out.println(root.getMiddle5().getMessage());
     			beginSession(root.getMiddle5()); 
     			break; 
     		}
     		case"6": 
     		{
     			System.out.println("\n");
     			System.out.println(root.getRight6().getMessage());
     			beginSession(root.getRight6()); 
     			break; 
     		}
     		case"7": 
     		{
     			System.out.println("\n");
     			System.out.println(root.getLeft7().getMessage());
     			beginSession(root.getLeft7()); 
     			break; 
     		}
     		case"8": 
     		{
     			System.out.println("\n");
     			System.out.println(root.getMiddle8().getMessage());
     			beginSession(root.getMiddle8()); 
     			break; 
     		}
     		case"9": 
     		{
     			System.out.println("\n");
     			System.out.println(root.getRight9().getMessage());
     			beginSession(root.getRight9()); 
     			break; 
     		}
     		
     		case "0": 
     		{
     			return; 
     		}
     	}
  
    
    }

}

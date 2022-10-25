//Name: Progga Paromita Dutta
// Id:114751436
/**
 * This class is implemented to describe the characteristics of a node
 * @author Progga Paromita Dutta
 *
 */
public class TreeNode {
	
	private TreeNode[] tree=new TreeNode[9]; 
	private String label; 
	private String message; 
	private String prompt;
	private int childNumber;
/**
 * This is a no argument constructor to hold the nine children of the root
 */
	public TreeNode()
	{
		
		for(int a=0;a<9;a++)
		{
			tree[a]=null; // nine children in an array
		}		
		
	}
	/**
	 * This is a constructor for creating a tree node object
	 * @param label-the label that has to be set
	 * @param message-the message that has to be shown
	 * @param prompt-the prompt that has to be shown
	 */
	public TreeNode(String label,String message,String prompt)
	{
		this.label=label;
		this.message=message;
		this.prompt=prompt;
	}
/**
 * @return the number of children of a node
 */
	
	public int getChildNumber()
	{
		return childNumber; 
	}
	/**
	 * @return the left node 1 subtree
	 */
	public TreeNode getLeft1()
	{
		return tree[0]; 
	}
	/**
	 * @return the middle node 2 subtree
	 */
	public TreeNode getMiddle2()
	{
		return tree[1]; 
	}
	/**
	 * @return the right node 3 subtree
	 */
	
	public TreeNode getRight3()
	{
		return tree[2];  
	}
	/**
	 * @return the left node 4 subtree
	 */
	
   public TreeNode getLeft4()
	{
		return tree[3]; 
	}
   /**
    * @return the middle node 5 subtree
    */
	
	public TreeNode getMiddle5()
	{
		return tree[4]; 
	}
	/**
	 * @return the right node 6 subtree
	 */
	
	public TreeNode getRight6()
	{
		return tree[5]; 
	}
	/**
	 * @return the left node 7 subtree
	 */
	public TreeNode getLeft7()
	{
		return tree[6]; 
	}
	/**
	 * @return the middle node 8 subtree
	 */
	public TreeNode getMiddle8()
	{
		return tree[7]; 
	}
	/**
	 * @return the right node 9 subtree
	 */
	
	public TreeNode getRight9()
	{
		return tree[8]; 
	}
	/**
	 * @return the message to be displayed on the screen
	 */
	
	public String getMessage()
	{
		return message; 
	}
	/**
	 * @return the prompt message to be shown
	 */
	public String getPrompt()
	{
		return prompt; 
	}
	/**
	 * @return the label of the node
	 */
	public String getLabel()
	{
		return label; 
	}
	 /**
	  * This setter method is used to set the child number of a node
	  * @param childNumber-the childnumber that has to be set
	  */
	public void setChildNumber(int childNumber)
	{
		this.childNumber=childNumber; 
	}
	/**
	  * This setter method is used to set the label of a node
	  * @param label-the label that has to be set
	  * @throws StringOutOfRangeException when the string is greater than length in 60
	  */
	public void setLabel(String label) throws StringOutOfRangeException
	{
		try {
		if(label.length()>60)
			throw new StringOutOfRangeException("String should not be more than 60 characters.");
		}
		catch(StringOutOfRangeException e)
		{
			System.out.println(e.getMessage());
		}
		this.label=label; 
	}
	/**
	 * This setter method is used to set the message that has to be shown
	 * @param message-the message that has to be set
	 * @throws StringOutOfRangeException when the string is greater than length in 60
	 */
	
	public void setMessage(String message) throws StringOutOfRangeException
	{
		try {
		if(message.length()>60)
			throw new StringOutOfRangeException("String should not be more than 60 characters." ); 
		}
		catch(StringOutOfRangeException e)
		{
			System.out.println(e.getMessage());
		}
		this.message=message; 
	}
	/**
	 * This setter method is to set the prompt message
	 * @param prompt-the prompt that has to be set
	 * @throws StringOutOfRangeException when the string is greater than length in 60
	 */
	
	public void setPrompt(String prompt) throws StringOutOfRangeException
	{
		try {
		if(prompt.length()>60)
			throw new StringOutOfRangeException("String should not be more than 60 characters"); 
		}
		catch(StringOutOfRangeException e)
		{
			System.out.println(e.getMessage());
		}
		this.prompt=prompt; 
	}
	/**
	 * This setter method is to set the leftNode of a tree
	 * @param left-the node that has to be set
	 */
	
	public void setLeft1(TreeNode node)
	{
		this.tree[0]=node; 
	}
	/**
	 * This setter method is used to set the middle node 2
	 * @param node-the node that has to be set
	 */
	public void setMiddle2(TreeNode node)
	{
		this.tree[1]=node; 
	}
	/**
	 * This method is used to set the node 3
	 * @param node-the node that has to be set
	 */
	public void setRight3(TreeNode node)
	{
		this.tree[2]=node; 
	}
	/**
	 * This method is used to set the node 4
	 * @param node-the node that has to be set
	 */
	public void setLeft4(TreeNode node)
	{
		this.tree[3]=node; 
	}
	/**
	 * This method is used to set the node 5
	 * @param node-the node that has to be set
	 */
	public void setMiddle5(TreeNode node)
	{
		this.tree[4]=node; 
	}
	/**
	 * This method is used to set the node 6
	 * @param node
	 */
	public void setRight6(TreeNode node)
	{
		this.tree[5]=node; 
	}
	/**
	 * This method is used to set the node 7
	 * @param node-the node that has to be set
	 */
	public void setLeft7(TreeNode node)
	{
		this.tree[6]=node; 
	}
	
	/**
	 * This method is used to set the node 8
	 * @param node-the node that has to be set
	 */
	public void setMiddle8(TreeNode node)
	{
		this.tree[7]=node; 
	}
	/**
	 * This method is used to set the node 9
	 * @param node-the node that has to be set
	 */
	public void setRight9(TreeNode node)
	{
		this.tree[8]=node; 
	}
	/**
	 * This method is used to check whether a node is leaf or not
	 * @return
	 */
	public boolean isLeaf()
	{
		// checking condition
		if(tree[0]==null && tree[1]==null && tree[2]==null )
			return true;
		else 
			return false; 
	}
	
	
}


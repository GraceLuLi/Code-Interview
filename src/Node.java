
public class Node {
	int value;
	Node next;	
	boolean visited;
	Node(int val)
	{
		value = val;
		visited = false;
	}
	//@Override
	public boolean equals(Node n)
	{
		if(value == n.value) return true;
		else return false;
	}
}
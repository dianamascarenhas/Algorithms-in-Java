/*Author: Diana Mascarenhas
Program comprises of the following functions of a Single Link List
1. Print a Linked List
2. SEARCH a particular node
3. ADD node to the FRONT of the Linked List
4. ADD node at a specific location
5. ADD node at the end
6. DELETE node at the beginning
7. DELETE node at the end
8. DELETE node at a specific location
9. Delete LL
10. Length of LL
11. Function to give the Nth Node in a Linked List from the Front
12. Function to give the Nth Node in a Linked List from the END
13. Function to print the middle of a Linked List
14. Function that counts the number of times a given int occurs in a Linked List



*/
package linkedList;

import java.lang.Math;

public class LinkedList 
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	//Function to PRINT a Linked List
	public void printLL()
	{
		Node n = head;
		if(n == null)
			System.out.println("\nEmpty Linked List");
		while(n!=null)
		{
			System.out.print(" "+n.data);
			n=n.next;
		}
		System.out.println();
	}
	//SEARCH a particular node
	public boolean search_node(int data)
	{
		if(head == null)
			{
			System.out.println("\nNode not present");
			return false;
			}
		Node second = head;
		while(second != null)
		{
			if(second.data == data)
			{
				return true;
			}
			second = second.next;
		}
		 return false;
	}
	
	//ADD node to the FRONT   Time complexity of push() is O(1)
		public void insert_beginning(int new_data)
		{
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
			System.out.println("The node inserted in the beginning is: " +new_data);
			printLL();
			System.out.println("Length of Linked List is "+length_LL());
			
		}
	
	// ADD node at a specific location
	public void insert_at_loc(int position, int new_data)
	{
		System.out.println("Inserting" +new_data+ " node at Location "+position);
		Node new_node = new Node(new_data);
		
			Node second = head;
			//Scan till the previous node of the Position
			for(int i=0;i<(position-2);i++)
			{
				if(second == null)
				break;
				second=second.next;	
			}    //2,12,52==> 2 62 12 52
			if(second!=null)
			{
				new_node.next = second.next;
				second.next = new_node;
			}
			printLL();
			System.out.println("Length of Linked List is "+length_LL());
	}
	
	// ADD node at the end
	public void insert_end(int new_data)	//O(n) complexity, since it traverses all nodes
	{
		Node new_node= new Node(new_data);
		//Check if LL exists
		// If head is null, means there is no LL. So, create a New LL given the New Node
		if(head == null)
		{
			head = new_node;
			return;
		}	
		System.out.println("Inserting" +new_data+ " node at the end");
		new_node.next=null;
		Node last = head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next = new_node;
		printLL();
		System.out.println("Length of Linked List is "+length_LL());
		return;	
	}
	
	//DELETE node at the beginning
	public void delete_beginning()
	{
		Node second = head;
		if(second == null)
			System.out.println("\nLinked list Is Empty");
		else 
		{
			System.out.println("\nThe deleted node from beginning is "+second.data);
			second = second.next;
			head = second;
		}
		printLL();
		System.out.println("Length of Linked List is "+length_LL());
		
	}
		
	//DELETE node at the end
	public void delete_end()
		{
			Node first = head;
			Node second = head;
			if(first == null)
				System.out.println("\nLinked list Is Empty");
			else
			{
				while(first.next!=null)
				{
					second = first;
					first = first.next;
					
				}
				System.out.println("\nDeleted Node from the end is " +first.data);
				second.next = null;	
			}	
			printLL();
			System.out.println("Length of Linked List is "+length_LL());
		}
	
	//DELETE node at a specific location
	public void delete_at_loc(int position)
	{
		Node second = head;
		Node first = head;
		if(position == 0)
			System.out.println("No Elements present at Pos 0. Enter Position 1 or greater");
		else if(position == 1)
			delete_beginning();
		else
		{
			System.out.println("Deleting element at location "+position);
			for(int i=0;i<(position-1);i++)
			{
				if(second == null)
					break;
				second = first;
				first = first.next;	
			}
			second.next= first.next;
		}
		printLL();
		System.out.println("Length of Linked List is "+length_LL());
	}
	
	//Function deletes the Linked List
	public void delete_LL()
	{
		System.out.println("Lindked List Deleted");
		head = null;
		printLL();
		System.out.println("Length of Linked List is "+length_LL());
	}
	
	// Function returns the Length of the Linked List
	public int length_LL()
	{
		Node first = head;
		int count = 0;
		while(first!=null)
		{
			first = first.next;
			count++;
		}
		//System.out.println("Length of Linked List is "+ count);
		return count;
	}
	
	//Function to give the Nth Node in a Linked List from the Front
	//e.g:  A B C D E, and if n=2, then return B
	public void node_at_index_from_front(int index)
	{
		int count =0;
		int node_at_index;
		Node second = head;
		int length = length_LL();
		if(length < index || index < 0)
		{
			System.out.println("******No Element at index**** "+index);
		}
		while(second != null)
		{
			count++;
			if(count == index)
				{
				node_at_index = second.data;
				System.out.println("Node_at_index" +index+ " is " +node_at_index);
				break;
				}
			second = second.next;
		}
	}
	
	
	//Function to give the Nth Node from the end of a Linked List
	//e.g:  A B C D E, and if n=4, then return B
	public void node_at_index_from_end(int index)
	{
		Node first = head;
		int length = length_LL();
		if(index >length)
			System.out.println("Index cant be greater than the length of the Linked List which is "+length);;
		int i;
		for(i=1; i<length-index+1; i++)
		{
			first = first.next;
		}
		printLL();
		System.out.println("The node at index position "+index+ " is " +first.data);
		
	}
	
	//Function to print the middle of a Linked List
	public void print_middle_LL()
	{
		int i,mid;
		int length = length_LL();
		if(length%2 == 0)
			mid = length/2;
		else
			mid = (length/2) + 1;
		Node first = head;
		for(i=0;i<mid-1;i++)
		{
			first = first.next;	
		}
		System.out.println("$$$$$$$$   The Middle of the LinkedList is $$$$$$$$ " +first.data);
	}
	
	// Write a function that counts the number of times a given int occurs in a Linked List
	public void count_specified_number(int x)
	{
		Node first = head;
		int length = length_LL();
		int i, count=0;
		if(first == null)
		{
			System.out.println("\nLinked list Is Empty");
		}
		else
		{
			//for(i=0;i<length;i++)
			while(first != null)
			{
				if(first.data != x)
					first = first.next;
				else
				{
					count++;
					first = first.next;
				}	
			}
		}
		if(count == 0)
			System.out.println("Number " +x+ " does not exist in the Linked List");
		else
			System.out.println("The Number "+x+ " appeared " +count+ " times in the LinkedList");
	}
	

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		ll.head.next = new Node(10);
		ll.head.next.next = new Node(1000);
		ll.insert_end(52);
		ll.insert_beginning(12);
		ll.insert_beginning(2);
		ll.print_middle_LL();
		ll.insert_at_loc(2,62);
		
		ll.delete_beginning();
		if(ll.search_node(62))
			System.out.println("------Number is present-------");
		else
			System.out.println("*********Number not present*****");
		
		ll.insert_beginning(200);
		
		ll.print_middle_LL();
		ll.insert_beginning(300);
		
		ll.delete_end();
		ll.print_middle_LL();
		ll.insert_beginning(400);
		ll.print_middle_LL();
		ll.delete_at_loc(5);
		ll.count_specified_number(-1);;
		ll.node_at_index_from_front(-1);
		ll.node_at_index_from_end(4);
		ll.delete_LL();	
	}
}

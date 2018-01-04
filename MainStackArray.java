// Author: Diana
// Stack Implementation using Array
// Limitations of Array, elements can't be really deleted. 
//They are only dereferenced

class StackImp 
{
	int a[]= new int[10];
	int top;
	StackImp()
	{
		top=-1;
	}
	void push(int e)
	{
		if(top==9)
		{
			System.out.println("Stack is full, can't add more elements");
		}
		else
		{
			a[++top]=e;
		}
	}// End Push
	boolean isEmpty()
	{
		if(top<0)
			return true;
		else
			return false;	
	}// End isEmpty
	
	void pop() 
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty");		
		}
		else
		{
			System.out.println(a[top--]);
		}
	}// End Pop
	void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty");		
		}
		else
		System.out.println("Topmost element of the stack is:" +a[top]);
		
	}// End Peek
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty");		
		}
		else
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Stack Element" +a[i]);			
			}
			
		}
	}// End Display

}// End Class

class MainStackArray
{
public static void main(String args[])
{
	StackImp e= new StackImp();
	for(int i=0;i<10;i++)
	{
		e.push(i);
	}
	e.display();
	e.peek();
	System.out.println("Remove Function invoked");
	for(int i=0;i<10;i++)
	{
		e.pop();
	}	
	e.peek();
	/*System.out.println("Adding elements again");
	for(int i=100;i<106;i++)
	{
		e.push(i);
	}
	e.display();
	*/
	}
}
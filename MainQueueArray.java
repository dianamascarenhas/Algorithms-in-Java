// Author: Diana
// Queue Implementation using Array
// Limitations of Array, elements can't be really deleted. They are only dereferenced
// Limitations: Even after deleting elements from Queue, when v we try to add a new element, Queue shows FULL
// No Peek Function


class QueueImp
{
int q[]= new int[10];
int front, rear;
	QueueImp()
{
	front=0; rear=-1;
}
void enqueue(int e)
{
if(rear==9)
{
System.out.println("Queue is Full, More elements cannot be added");	
}
else
{
q[++rear]=e;	
}
}
boolean isEmpty()
{
if(rear<front)
	return true;
else 
	return false;
}

void dequeue()
{
if(isEmpty())
{
System.out.println("Queue is empty, cannot Remove any elements from an empty queue");	
}
else
{
System.out.println("Removed ELement:" +q[front++]);	
}
}
void display()
{
if(isEmpty())
{
System.out.println("Queue is empty, cannot Remove any elements from an empty queue");	
}
else
{
System.out.println("Queue Elements are:");
int temp=front;
while(temp<=rear)
{
System.out.println(q[temp++]);	
}
}
}
}
public class MainQueueArray 
{
	public static void main(String args[])
	{
		QueueImp o= new QueueImp();
		System.out.println("Inserting elements");
		for(int i=0;i<=9;i++)
		{
			o.enqueue(i);
		}
		o.display();
		
		System.out.println("deleting elements");
		for(int i=0;i<=9;i++)
		{
			o.dequeue();
		}
		o.display();
		o.enqueue(5);
		
	}

}

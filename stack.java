/**
 * @author Reece Bly
 */
import java.lang.reflect.Array;
import java.util.Arrays;


public class Stack<T>
{
	private T[] stackData;
	private int count;
	private int maxSize;
	private int top;
	
	public Stack() // default array
	{
		count = 0;
		top = -1;
		maxSize = 200;
		stackData =(T[])new Object[maxSize];

	} // end ArrayStackBly
	
	
	public void push(T newEntry) // push new item on stack
	{
		if (count < maxSize-1)
		{
			count++;
			top++;
			stackData[maxSize] = newEntry;
		}
		else;
		
	} // end push
	
	public T pop() // remove item that was most recently put on to stack
	{	
		if (count < 1)
		{
			return null;
		}
		
		T item = stackData[count];
		
		count--;
		top--;

		return item;
	} // end pop
	
	public T stackTop() // get most recently added item
	{
		if (isEmpty())
		{
			return null;
		}
		
		return stackData[count];
	} // end stackTop
	
	public boolean isEmpty() // tell if stack is empty
	{
		return count < 1;
	} // end isEmpty
	
	public boolean isFull()  // tell if stack is full
	{
		return count > maxSize-1;
	}
	
	public void popAll() // clears the entire array
	{
		count = 0;
		maxSize = 200;
		stackData = (T[]) new Object[maxSize];
	}// end popAll
	
} // end Stack class

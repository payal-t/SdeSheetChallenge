/*
Problem statement: Implement a stack using an array.
Note: Stack is a data structure that follows the Last In First Out (LIFO) rule.

Explanation: 

push(): Insert the element in the stack.

pop(): Remove and return the topmost element of the stack.

top(): Return the topmost element of the stack

size(): Return the number of remaining elements in the stack.

Intuition: As we know stack works on the principle of last in first out, so we have to put elements in an 
array such that it keeps track of the most recently inserted element. Hence we can think of using a Top variable
 which will help in keeping track of recent elements inserted in the array.

Approach:

Declare an array of particular size.
Define a variable “Top” and initialize it as -1.
push(x): insert element is the array by increasing top by one.
pop(): check whether top is not equal to -1 if it is so, return top and decrease its value by one.
size(): return top+1.
*/
import java.util.*;
class implStackArr{

	int size=10000;
	int arr[] =new int[size];
	int top=-1;

	void push()
	{
		top++;
		arr[top]=x;
	}
	int pop(){
		int x=arr[top];
		top--;
		return x;
	}

	int top(){
		return arr[top];
	}

	int size(){
		return top +1 ;
	}
public static void main(String[] args)
{

	implStackArr s= new implStackArr();
	s.push(6);
	s.push(3);
	s.push(7);
	System.out.println("Top of the stack before deleting any element " + s.top());
    System.out.println("Size of the stack before deleting any element " + s.size());
    System.out.println("The element deleted is " + s.pop());
    System.out.println("Size of the stack after deleting an element " + s.size());
    System.out.println("Top of the stack after deleting an element " + s.top());


}
}
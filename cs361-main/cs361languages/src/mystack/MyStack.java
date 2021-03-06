/**
 * 
 */
package mystack;

/**
 * @author Hamsira Pathan and Kaiyin Chen
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {
	
	//public MyStack<T>.MyNode<T> front;
	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}
	
//	private MyStack<T> (MyNode<T> front1) {
//        front1 = front1;
//    }

	public T pop() {
		// TODO To complete
		T node = theStack.val;
        theStack = theStack.next;
        return node;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> finger = theStack;
		MyNode<T> node = new MyNode<T> (v, null);
		theStack = node;
		theStack.next = finger;

		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> inte = new MyStack<Integer>();
		inte.push(1);
		inte.push(2);
		inte.pop();
		inte.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		
		MyStack<Person> person = new MyStack<Person>();
		Person p1 = new Person("Kaiyin", "Chen");
		Person p2 = new Person("Christelle", "Scharff");
		person.push(p1);
		person.push(p2);
		
	}

}

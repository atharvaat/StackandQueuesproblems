package StackandQueuesproblems;

public class Stack {
	Node top;
    Node next;
  
    public class Node {
        int data;
        Node next;
    }
    public void Node() {
        this.top = null;
    }
   
    public void push(int number) {
        Node node = new Node();
        node.data = number;
        node.next = top;
        top = node;
    }
    
    public boolean isEmpty() {
       
        return top == null;
        }

     
    public int peek() {

      
        if (!isEmpty()) {
            return top.data;
            }

            else {

                System.out.println("stack is empty.");

                return -1;
            }

        }
        public void pop() {

      

            while (top != null) {

                System.out.println("this is peak now :: " + peek());

                top = top.next;

                System.out.println("one item removed from stack...");
            }
          
            System.out.println("now stack is empty :: ");
        }

  
    public void printStack() {

        Node node = top;
 

        while (node != null) {

            System.out.println(node.data);

            node = node.next;

        }
    }
	public static void main(String[] args) {
		Stack stackoperation = new Stack();

        stackoperation.push(70);   
        stackoperation.push(30);  
        stackoperation.push(56);  
        stackoperation.printStack();      
        stackoperation.pop();           
        stackoperation.printStack();     

	}

}
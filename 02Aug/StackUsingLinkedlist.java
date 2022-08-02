package DataStructure;
class StackUsingLinkedlist {
    
    private class Node {
        int data; 
        Node next; 
    }
    
    Node top=null;
    
   
    
    public void push(int x) 
    {
        
        Node new_node = new Node();
        new_node.data = x;
        new_node.next = top;
        top = new_node;
    }
    
    public boolean isEmpty()
    {
        return top == null;
    }
    
    public int peek()
    {
        
        if (isEmpty()==false) {
            return top.data;
        }
        else {
            System.out.println("empty");
            return -1;
        }
    }
    
    public void pop() 
    {
        
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        
        top = (top).next;
    }
    public void display()
    {
        
        if (isEmpty()) {
            System.out.println("\nStack Underflow");
           
        }
        else {
            Node temp = top;
            while (temp != null) {
                
                System.out.println( temp.data);
                
                temp = temp.next;
            }
        }
    }


public static void main(String[] args)
{
    
    StackUsingLinkedlist sll = new StackUsingLinkedlist();
    
    sll.push(1);
    sll.push(2);
    sll.push(3);
    sll.push(4);
    
    sll.display();
    
   System.out.println( "Peek value::"+sll.peek());
    
    sll.pop();
    sll.pop();
    System.out.println("Stack after Deletion");
    sll.display();
    
    
}
}
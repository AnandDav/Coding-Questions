/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList.Singly;

/**
 *
 * @author a_dav
 */
public class SinglyLinkList {
    public Node Head = null;
    public Node Tail = null;
    
    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(Head==null)
        {
            Head = newNode;
            Tail = newNode;
        }
        else
        {
            Tail.next = newNode;
            Tail = newNode;
        }
    }
    void displayList()
    {
        Node current = Head;
        if(Head==null)
        {
            System.out.println("   List Is Empty ");
        }
        while(current!=null)
        {
            System.out.println(""+current.data);
            current = current.next;
        }
    }
    void addNodeafter(int data, int newData)
    {
        Node newNode = new Node(newData);
         Node current = Head;
       //  Node Previous = Head;
          if(Head==null)
        {
            System.out.println("    List is Empty");
        }
           while(current!=null)
        {
            if(current.data == data)
            {
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
          //  Previous = current;
            current = current.next;
            
        }
    }
    
    void addNodebefore(int data, int newData)
    {
        Node newNode = new Node(newData);
         Node current = Head;
        Node Previous = Head;
          if(Head==null)
        {
            System.out.println("    List is Empty");
        }
       while(current!=null)
        {
            if(current.data == data && current == Head)
            {
               
                newNode.next = current;
                Head = newNode;
                break;
            }
            if(current.data == data)
            {
                newNode.next = current;
                Previous.next =newNode;
              break;
            }
            Previous = current;
            current = current.next;
            
        }
    }       
           
    void removeNode(int data)
    {
        Node current = Head;
        Node Previous = Head;
        
        if(Head==null)
        {
            System.out.println("    List is Empty");
        }
        while(current!=null)
        {
            if(current.data == data)
            {
                
                Previous.next = current.next;
                break;
            }
            Previous = current;
            current = current.next;
            
        }
    }
    
    public static void main(String[] args) {
            SinglyLinkList linklist = new SinglyLinkList();
            linklist.addNode(1);
            linklist.addNode(2);
            linklist.addNode(3);
            linklist.addNode(4);
            linklist.addNode(5);
            linklist.displayList();
            linklist.removeNode(5);
            linklist.displayList();
            linklist.addNodeafter(4,5);
            linklist.displayList();
            linklist.addNodebefore(1, 0);
            linklist.displayList();
    }
    
    
}

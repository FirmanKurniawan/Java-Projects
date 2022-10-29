import java.util.*;

/*  Class Node  */
    class Node
    {
        protected double data;
        protected Node next, prev;
     
        /* Constructor */
        public Node()
        {
            next = null;
            prev = null;
            data = 0;
        }
        /* Constructor */
        public Node(double data, Node next, Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        /* Function to set link to next node */
        public void setLinkNext(Node n)
        {
            next = n;
        }
        /* Function to set link to previous node */
        public void setLinkPrev(Node p)
        {
            prev = p;
        }    
        /* Function to get link to next node */
        public Node getLinkNext()
        {
            return next;
        }
        /* Function to get link to previous node */
        public Node getLinkPrev()
        {
            return prev;
        }
        /* Function to set data to node */
        public void setData(double d)
        {
            data = d;
        }
        /* Function to get data from node */
        public double getData()
        {
            return data;
        }
    }
     
    /* Class linkedList */
    class linkedList
    {
        protected Node start;
        protected Node end ;
        public int size;
     
        /* Constructor */
        public linkedList()
        {
            start = null;
            end = null;
            size = 0;
        }
        
        
        /*Function to insert element  */
        public void insert(double d)
        {
            Node nptr = new Node(d, null, null);        
            if (start == null)
            {
                nptr.setLinkNext(nptr);
                nptr.setLinkPrev(nptr);
                start = nptr;
                end = start;
            }
            else
            {
                nptr.setLinkPrev(end);
                end.setLinkNext(nptr);
                start.setLinkPrev(nptr);
                nptr.setLinkNext(start);
                end = nptr;    
            }
            size++;
        }
        
        /* Function to display status of list */
        public void display()
        {
            System.out.print("\nCircular Doubly Linked List = ");
            Node ptr = start;
            if (size == 0) 
            {
                System.out.print("empty\n");
                return;
            }
            if (start.getLinkNext() == start) 
            {
                System.out.print(start.getData()+ " "+ptr.getData()+ "\n");
                return;
            }
            System.out.print(start.getData()+ " ");
            ptr = start.getLinkNext();
            while (ptr.getLinkNext() != start) 
            {
                System.out.print(ptr.getData()+ "  ");
                ptr = ptr.getLinkNext();
            }
            System.out.print(ptr.getData()+ " ");
            ptr = ptr.getLinkNext();
            System.out.print(ptr.getData()+ "\n");
        }
        public Iterator<Integer> Iterator()
        {
            
            return null;
        }
    }
     
    /* Class CircularDoublyLinkedList */
    public class CircularDoublyLinkedList
    {    
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            
            /* Creating object of linkedList */
            linkedList list = new linkedList();
            
            System.out.println("run :");
            
            System.out.println("exit - to end the loop");
            
            /*  Perform list operations  */
           for(int i=1; i<=5; i++)
           {
                try
                {
                System.out.println("Enter the Node");
                     list.insert( scan.nextDouble() );  
                } 
                catch (InputMismatchException e) 
                {
                    list.display();
                    System.exit(0); 
                }
               }     
                   
            /* For Displaying the List*/
                 list.display();
                 
               /* Scanner Close*/
                   scan.close();
        }
}

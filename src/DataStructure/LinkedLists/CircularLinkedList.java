package DataStructure;

public class CircularLinkedList {
    public static void main(String[] args) {
        CLL c = new CLL();
        c.addNodeAtStart(3);
        c.addNodeAtStart(2);
        c.addNodeAtStart(1);
        c.print();
        c.deleteNodeFromStart();
        c.print();
        c.addNodeAtEnd(4);
        c.print();
        System.out.println("Size of linked list: "+ c.getSize());
        System.out.println("Element at 2nd position: "+ c.elementAt(2));
    }
}

class NodeCircular
{
    public int data;
    public NodeCircular next;

    public NodeCircular(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class CLL
{
    public NodeCircular head;
    public NodeCircular tail;
    public int size;

    public CLL()
    {
        this.head = null;
        this.tail = null;
    }

    public void addNodeAtStart(int number)
    {

        NodeCircular newNode = new NodeCircular(number);
        if (this.size == 0)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else
        {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        this.size++;

    }

    public void addNodeAtEnd(int number)
    {
        NodeCircular newNode = new NodeCircular(number);
        if (this.size == 0)
        {
            this.addNodeAtStart(number);
            return;
        }
        else
        {
            this.tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        this.size++;
    }

    public void deleteNodeFromStart()
    {
        if (this.size == 0)
        {
            System.out.println("Nothing to delete");
        }
        if (this.size == 1)
        {
            this.head = null;
            this.tail = null;
        }
        else {
            tail.next = head.next;
            head = head.next;
        }
        this.size--;

    }

    public int elementAt(int index)
    {
        NodeCircular temp = this.head;

        if (index > this.size)
        {
            System.out.println("Index is not a valid number");
        }
        else{
            int num = 0;
            while(num!=index-1) {
                temp = temp.next;
                num++;
            }
        }
        return temp.data;
    }

    public void print()
    {
        System.out.print("Circular Linked List:");
        NodeCircular temp = head;
        if(size<=0){
            System.out.print("List is empty");
        }else{
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
            while(temp!=head);
        }
        System.out.println();
    }
    //get Size
    public int getSize(){
        return size;
    }
}

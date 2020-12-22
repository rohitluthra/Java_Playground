package DataStructure;

import java.util.Scanner;

public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Creating object of linkedList */
        LinkedList list = new LinkedList();
        System.out.println("Doubly Linked List Test\n");
        char ch;

        /* Perform list operations */

        do {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insertAtStart(scan.nextInt());
                    break;

                case 2:
                    System.out.println("Enter integer element to insert");
                    list.insertAtEnd(scan.nextInt());
                    break;

                case 3:
                    System.out.println("Enter integer element to insert");
                    int num = scan.nextInt();
                    System.out.println("Enter position");
                    int pos = scan.nextInt();
                    if (pos < 1 || pos > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(num, pos);
                    break;

                case 4:
                    System.out.println("Enter position");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break;

                case 5:
                    System.out.println("Empty status = " + list.isEmpty());
                    break;

                case 6:
                    System.out.println("Size = " + list.getSize() + " \n");
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;

            }

            /* Display List */
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
    }
}
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;

    }

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(int data, Node n, Node p)
    {
        this.data = data;
        this.next = n;
        this.prev = p;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getData()
    {
        return this.data;
    }

    public void setData(int incoming)
    {
        this.data = incoming;
    }
}
class LinkedList{
    public Node start;
    public Node end;
    public int size;

    public LinkedList()
    {
        this.size = 0;
        this.start = null;
        this.end = null;
    }

    public boolean isEmpty()
    {
        return this.size==0;
    }
    public int getSize()
    {
        return  this.size;
    }

    public void insertAtStart(int val)
    {
        Node newNode = new Node(val);
        if (this.size == 0)
        {
            this.start = newNode;
            this.end = this.start;
        }
        else {

            this.start.setPrev(newNode);
            newNode.setNext(start);
            this.start = newNode;
        }
        this.size++;

    }

    public void insertAtEnd(int val)
    {
        Node newNode = new Node(val);
        if (this.size == 0)
        {
            this.start = newNode;
            this.end = this.start;
        }
        else {

            this.end.setNext(newNode);
            newNode.setPrev(end);
            this.end = newNode;
        }
        this.size++;
    }


    public void insertAtPos(int val, int pos)
    {
        if (pos > this.size || pos < 0)
            System.out.println("Position entered in out of range");
        if (pos == 1) {
            insertAtStart(val);
            return;
        }
        int count = 0;
        Node temp = start;
        while(count != pos-1)
        {
            temp = temp.next;
            count++;
        }
        /**
         * set next of current to new node
         * set prev of new node to current
         * set next of new node to current.next.next
         * current.next.next , prev will be my new node
         */
        Node newNode =  new Node(val);
        newNode.setPrev(temp);
        newNode.setNext(temp.next);
        temp.next.setPrev(newNode);
        temp.setNext(newNode);
        this.size++;
    }

    public void deleteAtPos(int pos)
    {

        if (pos > this.size || pos <= 0)
            System.out.println("Position entered in out of range");
        if (pos == 1)
        {
            if (this.size == 1)
            {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getNext();
            start.setPrev(null);
            this.size--;
        }
        if (pos == size) {
            this.end = this.end.getPrev();
            System.out.println(end.data);
            this.end.next = null;
            this.size--;
        }
        else {
            int count = 0;
            Node temp = start;
            while (count != pos - 1) {
                temp = temp.next;
                count++;
            }
            /**
             * set next of current to new node
             * set prev of new node to current
             * set next of new node to current.next.next
             * current.next.next , prev will be my new node
             */
//        temp.getPrev().setNext(temp.getNext());
//        temp.getNext().setPrev(temp.getPrev());
            Node p = temp.getPrev();
            Node n = temp.getNext();
            p.setNext(n);
            n.setPrev(p);
            this.size--;
        }
    }

    public void display()
    {
        System.out.print("\nDoubly Linked List = ");

        if (size == 0) {
            System.out.print("empty\n");
            return;
        }

        if (start.getNext() == null) {
            System.out.println(start.getData());
            return;
        }

        Node ptr = start;
        System.out.print(start.getData() + " <-> ");
        ptr = start.getNext();

        while (ptr.getNext() != null) {
            System.out.print(ptr.getData() + " <-> ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData() + "\n");
    }
}

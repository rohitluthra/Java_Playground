package DataStructure;

import java.util.LinkedList;

public class SinglyLinkedList {
    public Node head;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
        this.head = null;
    }


    class Node {

        public Object item;
        public Node next;

    }

    /*
     * Insert Node at next available position
     * */

    public void insertNode(String item) {
        Node newNode = new Node();
        newNode.item = item;
        Node current = this.head;

        if (this.size == 0) {
            insertFirstNode(item);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            this.size++;
        }
    }

    /*
     * Insert Node at first position
     * */
    public void insertFirstNode(String item) {
        Node newNode = new Node();
        newNode.item = item;
        if(this.size>1)
        {
            newNode.next = this.head;
            this.head = newNode;
        }
        else
        {
            newNode.next = null;
            this.head = newNode;
        }

        this.size++;
    }

    /*
     * Insert Node at nth position
     * */
    public void insertnThNode(String item, int position){
        Node newNode = new Node();
        newNode.item = item;
        Node current = this.head;
        int i =0 ;
        if (position > this.size)
            System.out.println("Cannot add Node because nth value is high");
        else {
            if (position == 0) {
                newNode.next = this.head;
                this.head = newNode;
            } else {
                while (i != position) {
                    i++;
                    current = current.next;
                }
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;

            }
            this.size++;
        }

    }

    /*
     * Delete Node at nth  position
     * */

    public void deletenThNode(int position){
        if (this.size < position)
        {
            System.out.println("Input is large");
        }
        if (this.size == 0)
        {
            System.out.println("Empty List");
        }

        Node current = this.head;
        Node temp = current;
        int temp1 = 0;
        while(temp1 != position-2)
        {
            temp1++;
            current = current.next;
        }
        current.next = current.next.next;
        this.head = temp;
        this.size--;
    }

    /*
     * Delete first Node
     * */

    public void deleteFirstNode() {
        if(this.head != null){
            this.head = this.head.next;
            this.size--;
        }else{
            System.out.println("Linked list is empty");
        }

    }

    /*
     * Delete last Node
     * */

    public void deleteLastNode() {
        Node currentNode = this.head;
        if(this.size == 1){
            this.head = null;
            this.size = 0;
        }else{
            Node prevNode = null;
            while (currentNode.next != null) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = null;
            this.size--;
        }
    }

    public boolean checkIfNodeExist(String value) {
        if (this.size < 0){
            return false;
        }
        Node current = this.head;
        while(current !=null)
        {
            if (current.item == value)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Object findNodeAt(int pos) {
        if (this.size < 0 || pos > this.size){
            return "Position doesnt exist or SLL is empty";
        }
        Node current = this.head;
        int temp = 0;
        while (temp!= pos-1)
        {
            temp++;
            current = current.next;
        }

        return current.item;

    }

    public void printAllNodes(){
        Node temp = this.head;
        if (temp ==null){
            System.out.println("Nothing in the singly linked List");
        }
        while(temp!= null)
        {
            System.out.print(temp.item + " -> ");
            temp = temp.next;
        }
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Current Size of the list is: "+list.getSize());

        list.insertNode("test1");
        list.insertNode("test2");
        list.insertNode("test3");
        list.insertNode("test4");
        list.insertNode("test5");
        list.insertNode("test6");
        list.insertNode("test7");
        list.printAllNodes();

        System.out.println();

        System.out.println("\nFinding item test2 in the Linked list: " + list.checkIfNodeExist("test2"));


        System.out.println("Finding item nonExist in the Linked list: " + list.checkIfNodeExist("nonExist"));

        System.out.println();

        System.out.println("Finding item at location 4: " + list.findNodeAt(4));

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getSize());
        System.out.println("Adding test1st at start of the Node");
        list.insertFirstNode("test1 st");
        list.printAllNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getSize());
        System.out.println("Adding testNth at 2nd Location");
        list.insertnThNode("test Nth", 6);
        System.out.println();
        list.printAllNodes();

        System.out.println("Current Size of the list is: "+list.getSize());
        System.out.print("\n\nDeleting first node");
        list.deleteFirstNode();
        System.out.println();
        list.printAllNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getSize());
        System.out.println("Deleting last node");
        list.deleteLastNode();
        System.out.println();
        list.printAllNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getSize());
        System.out.println("\nDeleting node from 4th location");
        list.deletenThNode(4);
        list.printAllNodes();
    }


}

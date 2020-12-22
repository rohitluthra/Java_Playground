package DataStructure.BinarySearchTree;

import java.util.*;

public class BinarySearchTree {

    public int data;
    BinarySearchTree left;
    BinarySearchTree right;
    BinarySearchTree parent;

    static int numberOfElements = 0;
    public BinarySearchTree root;


    public BinarySearchTree()
    {
        this.left = null;
        this.right = null;
        this.parent = null;
    }


    public void add(int data)
    {
        /*
        * check if the root is null, if yes then initiate root
        * if no then loop to them most suitable position and add the item there.
        * */

        BinarySearchTree newNode = new BinarySearchTree();
        newNode.data = data;
        if (numberOfElements == 0)
        {
            root = newNode;
        }
        else
        {
            BinarySearchTree temp = root;
            while(temp !=null)
            {
                if (temp.data < data)
                {
                    if (temp.right !=null) {
                        temp = temp.right;
                        continue;
                    }
                    else
                    {
                        temp.right = newNode;
                        newNode.parent = temp;
                        break;
                    }
                }
                else{
                    if (temp.left !=null) {
                        temp = temp.left;
                        continue;
                    }
                    else
                    {
                        temp.left = newNode;
                        newNode.parent = temp;
                        break;
                    }
                }
            }
        }
        numberOfElements++;
    }

    public void display(String pattern) throws Exception {
        System.out.print("Tree : ");
        if(root==null){
            throw new Exception("Empty tree!");
        }
        //InOrder Traversal
        if(pattern=="inOrder"){
            inorder(root);
            System.out.println();
        }
        else{
            //PreOrder Traversal.
            if(pattern=="preOrder"){
                preorder(root);
                System.out.println();
            }
            else{
                //PostOrder Traversal.
                if(pattern=="postOrder"){
                    postorder(root);
                    System.out.println();
                }
                //Level-Order Traversal.
                else{
                    levelorderDisplay(root);
                    System.out.println();
                }
            }
        }
    }

    public BinarySearchTree inorder(BinarySearchTree root)  {
        //System.out.println(root.data+ " ");

        if (root == null)
            return root;

            /*
            * left, root, right
            * */
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
        return root;
    }
    public BinarySearchTree preorder(BinarySearchTree root)
    {

        if (root == null)
            return root;

        /*
         * root, left, right
         * */
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        return root;
    }
    public BinarySearchTree postorder(BinarySearchTree root)
    {

        if (root == null)
            return root;

        /*
         * left, right, root
         * */
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.data + " ");

        return root;
    }

    public BinarySearchTree levelorderDisplay(BinarySearchTree root)
    {
        if (root == null)
        {
            return root;
        }

        Queue<BinarySearchTree> q = new LinkedList<BinarySearchTree>();
        q.add(root);
        while(!q.isEmpty())
        {
            BinarySearchTree pop = q.remove();
            System.out.println(pop.data + " ");
            if (pop.left != null) {
                q.add(pop.left);
            }
            if (pop.right != null)
                q.add(pop.right);
        }

        return root;
    }
    public void print2DUtil(BinarySearchTree root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += 10;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = 10; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");

        // Process left child
        // Process left child
        print2DUtil(root.left, space);
    }


    public boolean findNode(int number) {
        if (root == null)
        {
            return false;
        }
        BinarySearchTree temp = root;
        while(temp != null)
        {
            if (temp.data ==  number)
                return true;

            if (temp.data > number)
                if (temp.left != null)
                    temp = temp.left;
            if (temp.data < number)
                if (temp.right !=null)
                    temp  = temp.right;
        }
        return false;
    }


}

class BinaryNode
{
//    public int data;
//    BinaryNode parent;
//    BinaryNode left;
//    BinaryNode right;
//    public int height;
//
//    public BinaryNode(int number)
//    {
//        this.data = number;
//        this.parent= null;
//        this.left = null;
//        this.right = null;
//        this.height = 0;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public BinaryNode getParent() {
//        return parent;
//    }
//
//    public void setParent(BinaryNode parent) {
//        this.parent = parent;
//    }
//
//    public BinaryNode getLeft() {
//        return left;
//    }
//
//    public void setLeft(BinaryNode left) {
//        this.left = left;
//    }
//
//    public BinaryNode getRight() {
//        return right;
//    }
//
//    public void setRight(BinaryNode right) {
//        this.right = right;
//    }
public static void main(String [] args){
    BinarySearchTree tree = new BinarySearchTree();
    try{
        tree.add(10);
        tree.add(12);
        tree.add(20);
        tree.add(100);
        tree.add(56);
        tree.add(1);
        tree.add(67);
        tree.add(2);
        tree.add(4);
        tree.add(9);
        tree.add(82);

        System.out.println("Find 1 : " + tree.findNode(1));

        //tree.print2DUtil(tree.root, 10);

        System.out.println("InOrder");
        tree.display("inOrder");

        System.out.println("PreOrder");
        tree.display("preOrder");

        System.out.println("PostOrder");
        tree.display("postOrder");

        System.out.println("LevelOrder");
        tree.display("levelOrder");
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}

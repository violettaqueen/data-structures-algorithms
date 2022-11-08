package com.cydeo.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TooManyListenersException;

public class MyTree {

    TNode root;

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {

                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                //if rightChild id not null, branch into right subtree
                current = current.rightChild;
            }
        }
    }

    void preOrderTraversal(TNode root) {

        // recursive algorithm / RECURSION

        if (root == null) return;  //termination
        System.out.println(root.value);  //visit root
        preOrderTraversal(root.leftChild);  //visit left subtree
        preOrderTraversal(root.rightChild); //visit right subtree
    }

    void inOrderTraversal(TNode root) {

        if (root == null) return;
        inOrderTraversal(root.leftChild);  //go to left until null
        System.out.println(root.value + ", ");
        inOrderTraversal(root.rightChild); //branch into the right
    }

    void postOrderTraversal(TNode root) {

        if (root == null) {
            return;
        }
        postOrderTraversal(root.leftChild); // branch into left subtree
        postOrderTraversal(root.rightChild); //branch and finish right subtree
        System.out.println(root.value + ", "); //visit root
    }

    void levelOrderTraversal() {  //use Queue if we need in order elements
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {  //until Queue becomes empty
            TNode toVisit = queue.poll(); //
            //if you have n number of children
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
    }

    public boolean contains(int value) {

        if (root == null) return false;
        TNode current = root;
        while (current != null) {  //this loop will continue

            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }
        }
        return false;  //if I can't find it
    }

    public boolean isLeaf(TNode node){
        return node.leftChild == null && node.rightChild == null;  //means is a leaf
    }

    public void printLeaves(TNode root){
        // traverse in order
        if (root==null)return; //do not do anything
        //perform in order traversal, Root->Left_>right - recursively
        if (isLeaf(root)) {
            System.out.println(root.value + ", ");
        }else{
            printLeaves(root.leftChild);
            printLeaves(root.rightChild);
        }
    }

    public int countLeafNodes(TNode root){

        if (root == null)return 0;

        if (isLeaf(root))return 1; //count as one because root is one

        return countLeafNodes(root.leftChild) + countLeafNodes(root.rightChild);
    }

    public int findSumOfLeaves(TNode root){

        if (root == null)return 0;

        if (isLeaf(root))return root.value;

        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild); //collect left and right subtrees value
    }

    //task 6
    public int height(TNode root){
        if (root==null)return -1;
        if (isLeaf(root))return 0;
        return 1+ Math.max(height(root.leftChild), height(root.rightChild));


    }
}

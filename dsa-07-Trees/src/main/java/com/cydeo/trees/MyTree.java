package com.cydeo.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null){
            root = newNode;
            return;
        }
        TNode current = root;
        while (true){
            if( value <= current.value){

                if (current.leftChild == null){
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild == null){
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
}

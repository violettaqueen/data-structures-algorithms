package com.cydeo.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;
    void insert(int value){

    }
    void preOrderTraversal(TNode root){

        // recursive algorithm / RECURSION

        if (root == null) return;
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    void inOrderTraversal(TNode root){

        if( root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    void postOrderTraversal(TNode root){

        if (root == null){
            return;
        }
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value + ", ");
    }
    void levelOrderTraversal(){
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TNode toVisit = queue.poll();
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
    }
}

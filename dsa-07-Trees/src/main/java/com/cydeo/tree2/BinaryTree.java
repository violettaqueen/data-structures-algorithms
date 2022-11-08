package com.cydeo.tree2;

public class BinaryTree {

    //find a maximum number in tree

    public int maxInBinaryTree(TNode root){

        int maxValue = Integer.MAX_VALUE;

        if (root != null){
            int leftMax = maxInBinaryTree(root.leftChild);
            int rightMax = maxInBinaryTree(root.rightChild);

            if (leftMax > rightMax){
                maxValue = leftMax;
            } //otherwise
            maxValue = rightMax;
        }
        if(root.value > maxValue ){
            maxValue = root.value;
        }
        return maxValue;
    }

    public static boolean searchInBinaryTree(TNode root, int value){

        if (root == null){         //check if root is null
            return false;
        }
        if (root.value == value){ //check if root data == to data to find
            return true;
        } // check leftChild, then check rightChild
        return searchInBinaryTree(root.leftChild, value) || searchInBinaryTree(root.rightChild, value);
    }




}

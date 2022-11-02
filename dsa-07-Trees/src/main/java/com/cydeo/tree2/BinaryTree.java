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
            }
            maxValue = rightMax;
        }
        if(root.value > maxValue ){
            maxValue = root.value;
        }
        return maxValue;


    }





}

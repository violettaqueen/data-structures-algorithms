package queue;

import java.util.NoSuchElementException;

public class MyQueue <T>{

    //type T nodes, front and back address

    QNode<T> front;
    QNode<T> back;
    int size;

    boolean isEmpty(){
        return front == null;
    }

    T peek(){   //return value of front
        return (T) front.value;
    }

    void enqueue(T item){
        QNode<T> node = new QNode<>(item);
        if (isEmpty()){
            front = back = node; //assign
        }else{
            back.next = node;
            back = node;
        }
        size++;
    }

    T dequeue(){
        QNode frontNode;
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (front == back){
            frontNode = front;
            front = back = null;
        }else{
            frontNode = front;
            front = front.next;
        }
        size --;
        return (T) front.value;
    }

    int size(){
        return size;
    }
}

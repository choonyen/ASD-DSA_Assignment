/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Iterator;

/**
 *
 * @author MSI GL62 6QF
 */
public class LinkedList<T> implements List<T> {

    private int numberOfEntries = 0;
    private Node firstNode = null;
    
    @Override
    public void add(T data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            firstNode = newNode;
        }
        else{
            Node currentNode = firstNode;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        numberOfEntries++;
    }

    @Override
    public int numberOfEntries() {
        return numberOfEntries;
    }

    @Override
    public void edit(T oldData, T newData) {
        if(!isEmpty()){
            Node currentNode = firstNode;
            while(!currentNode.data.equals(oldData) && currentNode.next != null)
                currentNode = currentNode.next;
            if(currentNode.data.equals(oldData)){
                currentNode.data = newData;
            }
        }
    }

    @Override
    public T get(int position) {
        T item = null;
        if(!isEmpty()){
            Node currentNode = firstNode;
            if(numberOfEntries >= position){
                for(int i = 0; i < position; i++)
                    currentNode = currentNode.next;
                item = currentNode.data;
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        if(numberOfEntries == 0)
            return true;
        return false;
    }

    @Override
    public Iterator<T> getIterator() {
        return new LinkedIterator();
    }

    private class LinkedIterator implements Iterator<T> {

        private Node currentNode;
        
        public LinkedIterator() {
            currentNode = firstNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if(hasNext()){
                T returnData = currentNode.data;
                currentNode = currentNode.next;
                return returnData;
            }
            else{
                return null;
            }
        }
    }

    private class Node {

        T data;
        Node next;
        
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }  
}

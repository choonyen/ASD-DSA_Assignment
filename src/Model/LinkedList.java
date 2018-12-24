/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 *
 * @author lamzn
 */
public class LinkedList<T> implements List<T> { //implementation class of List ADT, is store linked collection of object.
    
    private int numberOfEntries = 0;  // store the number of entries in the list
    private Node firstNode = null;   // point to first data of the list
    
    
    
    @Override
    public void add(T data) {        //add data to list, if the list is empty, pointing firstNode to the data,else add the data to the back of the list. 
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
    public int numberOfEntries() {   // return number of entries in the list
        return numberOfEntries;
    }

    @Override
    public void edit(T oldData,T newData) {   // edit by replace the oldData to newData in the list.
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
    public T get(int position) {     //return the object from the list in the position
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
    public boolean isEmpty() {   // determine whether the list is empty by check the numberOf Entries is 0 or not.
        if(numberOfEntries == 0)
            return true;
        return false;
    }
    
    public Iterator<T> getIterator(){     // get iterator
        return new LinkedIterator();
    }

    private class LinkedIterator implements Iterator<T>{   //a class implements Iterator
        
        private Node currentNode;
        
        public LinkedIterator(){    // the currentNode by default pointing firstNode.
            currentNode = firstNode;
        }

        @Override
        public boolean hasNext() {   // check whether is the end of the list
            return currentNode != null;
        }

        @Override
        public T next() {   // if not end of the list, return the currentNode and point the currentNode to next Node.
            if (hasNext()) {
                T returnData = currentNode.data;
                currentNode = currentNode.next;
                return returnData;
            }
            else{
                return null;
            }
        }
    }
    
    
    private class Node{      
        T data;
        Node next;
        
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }  
}



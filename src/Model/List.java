/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Iterator;

/**
 *
 * @author LENOVO
 */
public interface List<T>{    //interface ADT implementation for ADT List
    
    public void add(T data); //for add object to the list 
    public int numberOfEntries(); // return number of entries in the list
    public void edit(T oldData,T newdata); // replace the oldData by newData
    public T get(int position); // return the object in the position of list
    
    public boolean isEmpty(); // determine whether the list is empty
    public Iterator<T> getIterator(); // return iterator that pointing the first data of the list
    
    
}

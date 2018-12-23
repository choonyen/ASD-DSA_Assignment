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
public interface List<T> {  
    
    public void add(T data);
    public int numberOfEntries();
    public void edit(T oldData, T newData);
    public T get(int position);
    
    public boolean isEmpty();
    public Iterator<T> getIterator();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_ds;

/**
 *
 * @author liksh
 */
public class InjuryReserveStack<E> {

    private java.util.ArrayList<E> injuryReserve = new java.util.ArrayList<E>();
    
    public int getSize(){
        return injuryReserve.size();
    }
    
    public E peek(){
        if (isEmpty()){
            throw new IllegalStateException("The stack is empty");
        }

        return injuryReserve.get(injuryReserve.size()-1);
    }
    
    public void addInjured (E e){
        injuryReserve.add(e);
        
        //remove from roster
        
    }
    
    public E pop(){
        if (isEmpty()){
            throw new IllegalStateException("The stack is empty");
        }
        //find the last element
        E e = injuryReserve.get(getSize()-1);
        //remove the last element
        injuryReserve.remove(e);
        //return the element that has been removed
        return e;
    }
    
    public E removeRecovered(String id){
        if (isEmpty()){
            throw new IllegalStateException("The stack is empty");
        }
        //find the last element
        E e = injuryReserve.get(id);
        //remove the last element
        injuryReserve.remove(e);
        //return the element that has been removed
        return e;
    }
    
    public boolean isEmpty(){
        return getSize()==0;
        //return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return "Stack: "+injuryReserve.toString();
    }
    
    public static void main(String[] args) {
        
    }
    
}
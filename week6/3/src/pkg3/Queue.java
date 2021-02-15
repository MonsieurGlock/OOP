/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author admin
 */
public class Queue {
    int size;
    int[] elements;

    public Queue() {
        elements = new int[2];
    }
    
    public void enqueue(int v){
        
        size++;
        if(size == elements.length){
            int[] newElement = new int[elements.length];
            for(int i = 0 ; i < newElement.length ; i++){
                newElement[i] = elements[i];
            }
            elements = new int[size+1];
            for(int i = 0 ; i < newElement.length ; i++){
                elements[i] = newElement[i];
            }
        }
        elements[size-1] = v;
        
    }

    public int getSize() {
        return size;
    }
    public void dequeue(){
        size--;
        for(int i = 0 ; i < elements.length - 1; i++){
            elements[i] = elements[i+1];   
        }
        int[] newElement = new int[elements.length];
        for(int i = 0 ; i < newElement.length ; i++){
            newElement[i] = elements[i];
        }
        elements = new int[elements.length-1];
        for(int i = 0 ; i < newElement.length -1 ; i++){
            elements[i] = newElement[i];
        }
    }
    public void empty() {
        elements = new int[8];
    }
    
}

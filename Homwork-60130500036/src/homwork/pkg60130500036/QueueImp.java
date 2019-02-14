/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homwork.pkg60130500036;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mild-TN
 */
public class QueueImp<T> implements Queue<T> {
  
  protected  ArrayList<T> list; 
  
  public QueueImp(){
    list = new ArrayList<>();
  }
  
  @Override
  public void addValueForQueue(T s){
    list.add(s);
  }
  
  @Override
  public int sizeQueue(){
    return list.size();
  }
  
  @Override
  public String isEmpty(){
    return "Q is not empty.";
  }
  
  @Override
  public void removeQ(){
  
  }

  @Override
  public String toString() {
    return "QueueImp{" + "list=" + list + '}';
  }
  
  
}

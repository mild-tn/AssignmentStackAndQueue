/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homwork.pkg60130500036;

import java.util.ArrayList;

/**
 *
 * @author Mild-TN
 */
public class StackAndQueue<T> implements Stack<T>,Queue<T>{
  private ArrayList<T> arrayListStack;
  private ArrayList<T> arrayListQ;
  int sizeStack;
  int sizeQ;

  public StackAndQueue() {
    this.arrayListStack = new ArrayList<>();
    this.arrayListQ = new ArrayList<>();
    this.sizeStack = 0;
    this.sizeQ = 0;
  }
  
  @Override
  public int sizeStack() {
    return arrayListStack.size();
  }
  
  @Override
  public int sizeQueue() {
    return arrayListQ.size();
  }

  @Override
  public String isEmpty() {
    if(sizeStack == 0){
      return "Stack is empty.";
    }else if(sizeQ == 0){
      return "Queue is empty.";
    }else{
      return "Stack and Queue isn't empty." ;
    }
  }

  @Override
  public void addValueForStack(T input) {
    sizeStack++;
    arrayListStack.add(input);
  }

  @Override
  public void addValueForQueue(T input) {
    sizeQ++;
    arrayListQ.add(input);
  }
  
  public void removeStack() {
    int numberOfLast = arrayListStack.size() - 1;
    arrayListStack.remove(numberOfLast);
  }
  
  public void removeQ(){
    int numberOfQ = arrayListQ.size()- (arrayListQ.size() - 1) - 1;
    arrayListQ.remove(numberOfQ);
  }
  
  
  @Override
  public String toString() {
    return  " arrayListStack=" + arrayListStack 
            + "\n arrayListQ=" + arrayListQ;
  }
  
}

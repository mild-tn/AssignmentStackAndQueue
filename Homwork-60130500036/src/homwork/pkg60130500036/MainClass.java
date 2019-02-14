/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homwork.pkg60130500036;

import java.util.Stack;

/**
 *
 * @author Mild-TN
 */
public class MainClass {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    StackAndQueue<String> sq = new StackAndQueue<String>();
    System.out.println("Empty : " + sq.isEmpty());
    
    
    sq.addValueForStack("Hello");
    sq.addValueForStack("Test");
    sq.addValueForStack("Me");
    sq.addValueForStack("Hi");
    
    
    System.out.println("Size Stack : " + sq.sizeStack() + " Size Q : "+ sq.sizeQueue());
    System.out.println("Empty : " + sq.isEmpty());
    
    System.err.println("Add Stack : "+ sq.toString());
    sq.removeStack();
    sq.removeStack();
    System.err.println("Remove : "+ sq.toString());
        
    sq.addValueForQueue("Q1");
    sq.addValueForQueue("Q2");
    sq.addValueForQueue("Q3");
    sq.addValueForQueue("Q3");
    
    System.out.println("Empty : " + sq.isEmpty());
    
    sq.removeQ();
    sq.removeQ();
    System.out.println("Remove Q : " + sq.toString());
  }
  
}

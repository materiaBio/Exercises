/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeOperations;

/**
 *
 * @author Tamara
 */
public class Node {
    
        Node left;
        Node right;
        String value;
        
        Node(String value){
        this.value = value;
        }
        
        public void setLeftNode(Node left){
        this.left = left;
        }
        
        public void setRightNode(Node right){
        this.right = right;
        }
    
}

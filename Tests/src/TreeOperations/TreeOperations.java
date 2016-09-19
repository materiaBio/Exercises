
package TreeOperations;

/**
 * @author Tamara
 */
public interface TreeOperations {
    
   public void printLeftNodes(Node root);
   public void printRightNodes(Node root);
   public void printLeaves(Node root);
   public void printPreorderIterative(Node root);
   public void printPostorderIterative(Node root);
   public void printInorderIterative(Node root);
   public void printPreorderRecursive(Node root);
   public void printPostorderRecursive(Node root);
   public void printInorderRecursive(Node root);
   public TreeIterator iterator();
   public void printBoundary(Node root);
   public void printVerticalSum();
     
}

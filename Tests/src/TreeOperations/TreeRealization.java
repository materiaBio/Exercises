package TreeOperations;

import java.util.Stack;

/**
 * @author Tamara
 */
public class TreeRealization implements TreeOperations {

    @Override
    public void printLeftNodes(Node root) {
        while (root.left != null || root.right != null) {
            System.out.print(root.value + " ");
            root = root.left;
        }
    }

    @Override
    public void printRightNodes(Node root) {
        Stack<Node> stack = new Stack<Node>();
        while (root != null) {

            root = root.right;
            if (root != null && (root.right != null || root.left != null)) {
                stack.add(root);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().value + " ");
        }

    }

    @Override
    public void printLeaves(Node root) {
        if (root != null) {
            printLeaves(root.left);

            if (root.left == null && root.right == null) {
                System.out.print(root.value + " ");
            } else {
                printLeaves(root.right);
            }
        }
    }

    @Override
    public void printPreorderIterative(Node root) {

        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node n = stack.pop();
            System.out.print(n.value + " ");

            if (n.right != null) {
                stack.push(n.right);
            }

            if (n.left != null) {
                stack.push(n.left);
            }
        }

    }

    @Override
    public void printPostorderIterative(Node root) {

        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        Node parent = null;

        while (!stack.empty()) {
            Node current = stack.peek();

            if (parent == null || parent.left == current || parent.right == current) {
                if (current.left != null) {
                    stack.push(current.left);
                } else if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    System.out.print(current.value + " ");

                }
            } else if (current.left == parent) {
                if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    System.out.print(current.value + " ");

                }

            } else if (current.right == parent) {
                stack.pop();
                System.out.print(current.value + " ");

            }

            parent = current;
        }

    }

    @Override
    public void printInorderIterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();

        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                Node n = stack.pop();
                System.out.print(n.value + " ");
                root = n.right;
            }
        }
    }

    @Override
    public void printPreorderRecursive(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        printPreorderRecursive(root.left);
        printPreorderRecursive(root.right);
    }

    @Override
    public void printPostorderRecursive(Node root) {
        if (root == null) {
            return;
        }
        printPostorderRecursive(root.left);
        printPostorderRecursive(root.right);
        System.out.print(root.value + " ");
    }

    @Override
    public void printInorderRecursive(Node root) {
        if (root == null) {
            return;
        }
        printInorderRecursive(root.left);
        System.out.print(root.value + " ");
        printInorderRecursive(root.right);
    }

    @Override
    public TreeIterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printBoundary(Node root) {
        printLeftNodes(root);
        printLeaves(root);
        printRightNodes(root);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printVerticalSum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

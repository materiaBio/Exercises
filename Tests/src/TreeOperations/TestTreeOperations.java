package TreeOperations;

/**
 *
 * @author Tamara
 */
public class TestTreeOperations {

    public static void main(String[] args) {

        Node n88 = new Node("F");
        Node n33 = new Node("B");
        Node n100 = new Node("G");
        Node n11 = new Node("A");
        Node n66 = new Node("D");
        Node n144 = new Node("I");
        Node n44 = new Node("C");
        Node n77 = new Node("E");
        Node n133 = new Node("H");

        n88.setLeftNode(n33);
        n88.setRightNode(n100);

        n33.setLeftNode(n11);
        n33.setRightNode(n66);

        n66.setLeftNode(n44);
        n66.setRightNode(n77);

        n100.setRightNode(n144);
        n144.setLeftNode(n133);

        TreeOperations op = new TreeRealization();

        System.out.println("-----PREORDER Recursive------");
        System.out.println("Correct answer is: F B A D C E G I H");
        op.printPreorderRecursive(n88);
        System.out.println("");

        System.out.println("-----PREORDER Iterative------");
        System.out.println("Correct answer is: F B A D C E G I H");
        op.printPreorderIterative(n88);
        System.out.println("");

        System.out.println("\n**************************************************************\n");

        System.out.println("\n-----POSTORDER Recursive------");
        System.out.println("Correct answer is: A C E D B H I G F");
        op.printPostorderRecursive(n88);
        System.out.println("");

        System.out.println("\n-----POSTORDER Iterative------");
        System.out.println("Correct answer is: A C E D B H I G F");
        op.printPostorderIterative(n88);
        System.out.println("");

        System.out.println("\n**************************************************************\n");
        System.out.println("\n-----INORDER Recursive------");
        System.out.println("Correct answer is: A B C D E F G H I");
        op.printInorderRecursive(n88);
        System.out.println("");

        System.out.println("\n-----INORDER Iterative------");
        System.out.println("Correct answer is: A B C D E F G H I");
        op.printInorderIterative(n88);
        System.out.println("");

        System.out.println("\n**************************************************************\n");

        System.out.println("\n-----LEAVES-------");
        System.out.println("Correct answer is: A C E H");
        op.printLeaves(n88);
        System.out.println("");

        System.out.println("\n**************************************************************\n");

        System.out.println("\n-----LEFT NODES-------");
        System.out.println("Correct answer is: F B");
        op.printLeftNodes(n88);
        System.out.println("");

        System.out.println("\n**************************************************************\n");

        System.out.println("\n-----RIGHT NODES-------");
        System.out.println("Correct answer is: I G");
        op.printRightNodes(n88);
        System.out.println("");

        System.out.println("\n**************************************************************\n");

        System.out.println("\n-----CLOCKWISE-------");
        System.out.println("Correct answer is: F B A C E H I G");
        op.printBoundary(n88);
        System.out.println("");

        System.out.println("\n**************************************************************\n");

    }

}

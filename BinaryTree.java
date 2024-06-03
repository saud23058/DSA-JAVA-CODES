import java.util.Scanner;

public class BinaryTree {
  private class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
      this.value = value;
    }
  }

  Node root;

  public void insertRoot(Scanner scanner) {
    System.out.println("Enter The roort Value : ");
    int value = scanner.nextInt();
    root = new Node(value);
    pupolated(scanner, root);
  }

  public void pupolated(Scanner scanner, Node node) {
    System.out.println("Do you want to add the value of the left of : " + node.value);
    boolean left = scanner.nextBoolean();
    if (left) {
      System.out.println("Enter the value of left of : " + node.value);
      int value = scanner.nextInt();
      node.left = new Node(value);
      pupolated(scanner, node.left);
    }
    System.out.println("Do you want to add the value of the right of : " + node.value);
    boolean right = scanner.nextBoolean();
    if (right) {
      System.out.println("Enter the value of right of : " + node.value);
      int value = scanner.nextInt();
      node.right = new Node(value);
      pupolated(scanner, node.right);
    }
  }

  public void display() {
    display(this.root, " ");
  }

  private void display(Node node, String space) {
    if (node == null) {
      return;
    }
    System.out.println(space + node.value);
    display(node.left, space + "\t");
    display(node.right, space + "\t");
  }

}

class SecondTreeMethodBySir {
  private class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }

  Node root;

  public void insertRoot(int value) {
    if (root != null) {
      System.out.println("Root Node is Already Present");
      return;
    }
    root = new Node(value);
  }

  public void insertLeftChild(int parentValue, int value) {
    Node parent = searchNode(root, parentValue);
    if (parent == null) {
      System.out.println("Parent not found...");
      return;
    }
    if (parent.left != null) {
      System.out.println("Left child already has a value..");
      return;
    }
    Node newNode = new Node(value);
    parent.left = newNode;
  }

  public void insertRightChild(int parentValue, int value) {
    Node parent = searchNode(root, parentValue);
    if (parent == null) {
      System.out.println("Parent not found...");
      return;
    }
    if (parent.right != null) {
      System.out.println("Right child already has a value..");
      return;
    }
    Node newNode = new Node(value);
    parent.right = newNode;
  }

  public Node searchNode(Node node, int key) {
    if (node == null) {
      return null;
    }
    if (node.value == key) {
      return node;
    }
    Node leftNode = searchNode(node.left, key);
    if (leftNode != null) {
      return leftNode;
    }
    return searchNode(node.right, key);
  }

  public void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.println(node.value);
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder(Node node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.println(node.value);
    inOrder(node.right);
  }

  public void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value);
  }

  public static void main(String[] args) {
    SecondTreeMethodBySir secondTree = new SecondTreeMethodBySir();
    secondTree.insertRoot(10);
    secondTree.insertLeftChild(10, 5);
    secondTree.insertRightChild(10, 15);
    secondTree.insertLeftChild(5, 3);
    secondTree.insertRightChild(5, 7);

    System.out.println("Pre-order traversal:");
    secondTree.preOrder(secondTree.root);

    System.out.println("In-order traversal:");
    secondTree.inOrder(secondTree.root);

    System.out.println("Post-order traversal:");
    secondTree.postOrder(secondTree.root);
  }
}

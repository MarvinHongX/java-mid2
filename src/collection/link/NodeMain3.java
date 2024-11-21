package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        System.out.println(first);

        System.out.println("모든 노드 탐색하기");
        printAll(first);

        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        System.out.println("특정 index의 노드 조회하기");
        Node index2Node = getNode(first, 2);
        System.out.println("index2Node = " + index2Node);

        System.out.println("데이터 마지막에 추가하기");
        add(first, "D");
        System.out.println(first);
        System.out.println("데이터 뒤에 추가하기");
        addAt(first, "F");
        System.out.println(first);
    }

    private static void printAll(Node node) {
        while (node != null) {
            System.out.printf("%s ", node.item);
            node = node.next;
        }
        System.out.println();
    }
    private static Node getLastNode(Node node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }
    private static Node getNode(Node node, int index) {
        for (int i = 0; i < index; i++) {
            node = node.next;
            if (node == null) {
                break;
            }
        }
        return node;
    }
    private static void add(Node node, Object item) {
        Node newNode = new Node(item);
        getLastNode(node).next = newNode;
    }
    private static void addAt(Node node, Object item) {
        Node newNode = new Node(item);
        newNode.next = node.next;
        node.next = newNode;
    }
}

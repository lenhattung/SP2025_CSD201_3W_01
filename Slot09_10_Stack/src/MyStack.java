
public class MyStack {

    Node top;

    public MyStack(Node top) {
        this.top = top;
    }

    // insert an element at the top position
    public void push(int x) {
        // Create new node with given data
        Node newNode = new Node(x);

        // Make the new node point to the current top
        newNode.next = top;

        // Update top to point to the new node
        top = newNode;
    }

    public void load() {
        this.push(10);
        this.push(14);
        this.push(7);
        this.push(7);
        this.push(3);
        this.push(2);
        this.push(15);
        this.push(9);
    }
}

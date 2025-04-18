
// Test the stack implementation
class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Load predefined elements
        stack.load();

        // Display the stack
        stack.display();

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element
        stack.pop();
        System.out.println("After popping an element:");
        stack.display();

        // Push a new element
        stack.push(25);
        System.out.println("After pushing 25:");
        stack.display();
    }
}
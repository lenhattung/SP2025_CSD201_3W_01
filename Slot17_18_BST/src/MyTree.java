
public class MyTree {

    Node root;

    public MyTree() {
        this.root = null;
    }

    public void load() {
        insert(20);
        insert(10);
        insert(30);
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        insert(100);

    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node p, int value) {
        if (p == null) {
            p = new Node(value);
        } else if (value < p.info) {
            p.left = insertRec(p.left, value);
        } else if (value > p.info) {
            p.right = insertRec(p.right, value);
        }
        return p;
    }

    public void visit(Node p) {
        System.out.println(p.info + " ");
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        } else {
            visit(p);
            preOrder(p.left);
            preOrder(p.right);
        }
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        } else {
            inOrder(p.left);
            visit(p);
            inOrder(p.right);
        }
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        } else {
            postOrder(p.left);
            postOrder(p.right);
            visit(p);
        }
    }

    int search(Node p, int x) {
        if (p == null) {
            return 0; // Không tìm thấy
        }
        if (p.info == x) {
            return 1; // Tìm thấy
        }

        if (x < p.info) {
            return search(p.left, x);
        } else {
            return search(p.right, x);
        }
    }

    // 1. Test f1 - compute height
    public int f1() {
        return 0;
    }

    // 2. Test f2 - count nodes
    public int f2() {
        return 0;
    }

    // 3. Test f3 - count leaf nodes
    public int f3() {
        return 0;
    }

    // 4. Test f4 - compute sum of nodes 
    public int f4() {
        return 0;
    }

    // 5. Test f5 - Pre-Order 
    public void f5() {

    }

    // 6. Test f6 - In-Order
    public void f6() {

    }

    // 7. Test f7 - Post-Order
    public void f7() {

    }

    // 8. Test f8 - Search
    int f8(int n) {
        return 0;
    }
}

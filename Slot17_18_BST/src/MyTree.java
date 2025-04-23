public class MyTree {
    Node root;

    public MyTree() {
        this.root = null;
    }

    public void insert(int value){
        root = insertRec(root, value);
    }
    private Node insertRec(Node p, int value){
        if(p==null){
            p = new Node(value);
        }else if(value < p.info){
            p.left = insertRec(p.left, value);
        }else if(value> p.info){
            p.right = insertRec(p.right, value);
        }
        return p;
    }
}

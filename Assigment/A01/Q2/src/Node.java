class Node{
    Phone info;
    Node next;
    Node pre;
    Node () {}
    Node (Phone x, Node p1, Node p2) {
        this.info = x; // data stored inside the node
        this.next = p1; // link to the next node
        this.pre = p2;
    }
    Node (Phone x) {
        this(x,null,null);
    }
 }

class Phone{
    int ID;
    String name;
    int price;
    Phone () {}
    Phone (int a, String n,int p) {
        this.ID = a;
        this.name = n; // data stored inside the node
        this.price = p; // link to the next node
    }
 }


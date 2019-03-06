class QueueLinkedList<D> implements Queue<D> {
    Node firstnode;
    Integer size;

    QueueLinkedList() {
        firstnode = null;
        size = 0;
    }
    public void push(D a) {
        Node node = new Node();
        node.data = a;
        node.next = null;

        if (firstnode == null) {
            firstnode = node;
            size++;
        } else {
            Node node1 = new Node();
            node1 = firstnode;
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = node;
            size++;
        }
    }
    public D pop() {
        D value=null;
        if (firstnode == null) {
            System.out.println("List is already empty");
        }
        if (firstnode.next == null) {
            value=firstnode.data;
            firstnode = null;
            size--;
        }
        else{
        Node n = new Node();
        Node n1 = new Node();
        n=firstnode;
        firstnode=null;
        firstnode=n.next;
        size--;
    }
    return value;
    }
    public D peek()
    {
        D value=null;
        if (firstnode.next == null) {
            value=firstnode.data;
        }
        else{
        Node n = new Node();
        Node n1 = new Node();
        n = firstnode;
        n1 = n.next;
        while (n1.next != null) {
            n1 = n1.next;
            n = n.next;
        }
        value=n.data;
    }
    return value; 
    }
    public Integer length()
    {
        return size;
    }
}

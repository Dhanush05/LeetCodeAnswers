class Solution {
    HashMap<Node,Node> copy = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        if(this.copy.containsKey(head)){
            return this.copy.get(head);
        }
        Node node = new Node(head.val, null, null);
        this.copy.put(head, node);
        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);
        return node;
    }
}

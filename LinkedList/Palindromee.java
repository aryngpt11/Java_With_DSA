package LinkedList;

public class Palindromee {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; // to get the size of the LL

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Slow fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // 1 step
            fast = fast.next.next; // 2 steps
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!= fast){
            prev =fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null &&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1 !=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }
        while(head2 !=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;

        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getMid( head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        return merge(newLeft,newRight);
    }

    public static void main(String[] args) {
       /*  Palindromee ll = new Palindromee();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome());*/
        /* head=new Node(1);
        //head.next=new Node(2);
        Node temp=new Node(2);
        head.next=temp; 
        head.next.next=new Node(3);
        head.next.next.next=temp;
        //head.next.next.next=head;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle()); */
        Palindromee pl=new Palindromee();
        pl.addFirst(1);
        pl.addFirst(2);
        pl.addFirst(3);
        pl.addFirst(4);
        pl.addFirst(5);
        pl.print();
        pl.head=pl.mergeSort(pl.head);
        pl.print();
        
    } 
}

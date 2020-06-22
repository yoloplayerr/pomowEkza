package helping;

import java.util.ArrayList;

public class LinkedList
{
    public Node head;
    public Node tail;
    Comparator comp;

    public LinkedList()
    {
    	comp=new Comparator();
        head = null;
        tail = null;
    }

    public void addInTail(Node item) {
        if (this.head == null)
            this.head = item;
        else
            this.tail.next = item;
        this.tail = item;
    }

    public Node find(Person value) {
        Node node = this.head;
        while (node != null) {
            if (comp.compare(node.value ,value )==0)
                return node;
            node = node.next;
        }
        return null;
    }

    public ArrayList<Node> findAll(Person value) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node node = this.head;
        while (node != null) {
            if (comp.compare(node.value ,value )==0)
                nodes.add(node);
            node = node.next;
        }
        return nodes;
    }

    public boolean remove(Person _value)
    {
        boolean flag = false;
        if(head == null){
            flag = false;
        } else if(head == tail && comp.compare(head.value,_value) == 0){
            head = null;
            tail = null;
            flag = true;
        }else{
            Node tmp = head;
            if(comp.compare(head.value,_value) == 0){
                head = head.next;
                flag = true;
            }else{
                while(tmp.next != null){
                    if(comp.compare(head.value,_value) == 0){
                        flag = true;
                        Node t = tmp.next;
                        tmp.next = t.next;
                        if(t.next == null){
                            tail = tmp;
                        }
                        break;
                    }
                    else{
                        tmp = tmp.next;
                    }
                }
            }
        }
        return flag;
    }

    public void removeAll(Person _value)
    {
        boolean flag = true;
        while(flag){
            flag = remove(_value);
        }
    }

    public void clear()
    {
        head = null;
        tail = null;
    }

    public int count()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertAfter(Node _nodeAfter, Node _nodeToInsert)
    {
        if(tail == _nodeAfter){
            addLast(_nodeToInsert.value);
        }else{
            Node tmp = head;
            while((tmp != null) && (tmp != _nodeAfter)){
                tmp = tmp.next;
            }
            if(tmp != null){
                Node n = new Node(_nodeToInsert.value);
                n.next = tmp.next;
                tmp.next = n;
            }
        }

    }
    public void addLast(Person new_data){

        if(head == null){
            addFirst(new_data);
        }
        else{
            Node tmp = new Node(new_data);
            tail.next = tmp;
            tail = tail.next;
        }
    }
    public void addFirst(Person new_data) {
        head = new Node(new_data);
        tail = head;
    }
    public void log(){

        Node temp = head;

        if(head == null){

            System.out.println("empty list");

        }

        while(temp!= null){

            System.out.print(temp.value+" ");

            temp = temp.next;

        }

        System.out.println();

    }
}

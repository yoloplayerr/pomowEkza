package helping;

public class Node
{
    public Person value;
    public Node next;
    public Node prev;

    public Node(Person _value)
    {
        value = _value;
        next = null;
        prev = null;
    }
}

public interface OrderedList{
    // returns the number of filled elements
    public int size();
    
    // returns the string representation of the list: [el0, el1, ...,]
    public String toString();
    
    // appends value at appropriate index
    public void add( int value);
    
    // returns value that corresponds to the given index
    public int get(int index);
    
    // removes value at given element, and returns that value
    public int remove(int index);


}
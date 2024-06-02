package CTDL;

public class MyArray {
    private int[] array;
    private int size;
    private int capacity;

    // Initialize an array with the given initial capacity
    public MyArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    // Add an element to the array
    public void append(int element) {
        // Check if the array is full
        if (size == capacity) {
            System.out.println("The array is full, new elements cannot be added.");
            return;
        }
        array[size] = element;
        size++;
    }
    //Accessing an element via index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[index];
    }
}
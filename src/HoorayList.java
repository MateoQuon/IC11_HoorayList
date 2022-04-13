import java.util.Arrays;

public class HoorayList <E>{  // E = placeholder for reference type (Element)

    private static final int DEFAULT_CAPACITY = 10;
    private int mCapacity;
    private int mSize;
    private E[] mData;

    public HoorayList(){
        this(DEFAULT_CAPACITY);
    }

    public HoorayList(int capacity){
        mCapacity = capacity;
        mSize = 0;
        mData =(E[]) new Object[mCapacity];
    }
    public E get(int index){
        if (index >= mSize || index < 0)
            throw new IndexOutOfBoundsException("Index must be between 0 and " + mSize);
        return mData[index];
    }
    public E set(int index, E element){
        E temp = this.get(index);
        mData[index] = element;
        return temp;
    }

    public boolean add(E element){
        // Adds to end of HoorayList
        if (mSize >= mCapacity) {
            // Double capacity + copy old vals to new array
            mCapacity *= 2;
            E[] newData =(E[]) new Object[mCapacity];
            for (int i = 0; i < mSize; i++) {
                newData[i] = mData[i];
            }
            // Update mData to newData
            mData = newData;

        }
        mData[mSize++] = element;
        return true;
    }
    public E remove (int index) {
        E temp = mData[index];

        for (int i = index; i < mSize; i++) {
            mData[i] = mData[i+1];
        }
        mSize--;

        return temp;
    }
    //public boolean add(int index, E element){}
    public void clear(){
        mData =(E[]) new Object[mCapacity];
    }

    @Override
    public String toString() {
        String output = "[";
        for (int i = 0; i < mSize; i++) {
            output += mData[i] + ", ";
        }
        return output + "Hooray!]";
    }
}

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {
    Integer ele;
        Iterator<Integer> itr;
	    boolean noElement;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr = iterator;
        moveItr();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return ele;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(noElement) 
            throw new NoSuchElementException();
        else{
            Integer result = ele;
            moveItr();
            return result;
        }
	}
	
	@Override
	public boolean hasNext() {
	   return !noElement;// not true   
	}
    
    public void moveItr(){
        if(itr.hasNext()){
        ele = itr.next(); 
        }else{
            noElement = true;
        }
}
}

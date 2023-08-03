/*
 * Student First Name: Hyungu
 * Student Last Name: Lee
 * Student BU Number: U00125976
 * Purpose: 
 */

public class Set  {
    private static final int SIZE = 10; // default size of initial set
                                
    private int[] set;      // array referece to the set
    private int size;       // current size of the set
    private int next;       // index to next available slot in the set array
    
    
    public Set(int[] set, int size, int next) {
        set = new int[SIZE];
        this.size = size;
        next = 0;
    }
 
 
    public Set(int[] arr) {
        for (int number : arr) 
        insert(number);
    }
    
    public Set clone() {
        Set clone = this.Set();
        for (int i = 0; i < next; i++) {
            clone.insert(set[i]);
        } return clone;

    }

    public void insert(int k) {
        if (!member(k)) {
            if (next == SIZE) {
                resize();
            }
            set[next] = k;
            next++;
        }
    }

    /** 
     * This method reallocates the array set to twice as 
     * big and copies all the elements over.
     * This method is called only by the insert method
     * when it cannot insert another element to the set.
     *
     * Note that this is the reason that in this class
     * the member size is not a class variable (i.e. static)
     * and it is not final, because the set can grow and size
     * will be modified accordingly.
     */
    
    private void resize() {
        size *= 2;

	// Create a new array double the size
        int[] temp = new int[size];

	// Copy all the elements from the current set
	// to the new set
        for(int i = 0; i < set.length; ++i) {
            temp[i] = set[i];
        }

	// Assign to the set reference the newly
	// resized array that represents the set.
        set = temp;
    }

    public  String toString()  {
        String data = "[";
        for (int i = 0; i < next; i++) {
            data += set[i];
            if (i != next - 1) {
            data += ",";
            }
        }
        data += "]";
        return data;
    }
    public int cardinality() {
        return next;
    }
    
    public  boolean isEmpty() {
        return next == 0;
    }
      
    public boolean member(int k) {
        for (int i = 0; i < next; i++) {
            if (set[i] == k) {
            return true;
            }
        }
        return false;    
    }    
   
    public  boolean subset(Set S) {
        for (int i = 0; i < next; i++) {
            if (!S.member(set[i])) {
                return false;
            }
        }
        return true;     
    }
    
    public  boolean equal(Set S) {
        if (this.size() == S.size()) {
            for (int i = 0; i < next; i++) {
                if (!S.member(set[i])) {
                return false;
                }
            }
            return true;
        }        
    }
       
    public void delete(int k) {
        for (int i = 0; i < next; i++) {
            if (set[i] == k) {
                set[i] = set[next - 1];
                next--;
                break;
            }
        }
    }

    public Set union(Set S) {
        Set unionSet = this.clone();
        for (int i = 0; i < S.next; i++) {
            unionSet.insert(S.set[i]);
        }
        return unionSet;
    }
   
    public Set intersection(Set S) {
        Set interSet = new Set();
        for (int i = 0; i < next; i++) {
            if (S.member(set[i])) {
            interSet.insert(set[i]);
            }
        }
        return interSet;
    }
 
    
    public Set setdifference(Set S) {
        Set differenceSet = new Set();
            for (int i = 0; i < next; i++) {
                if (!S.member(set[i])) {
                    differenceSet.insert(set[i]);            
                }
            }
            return differenceSet;
    }


}    



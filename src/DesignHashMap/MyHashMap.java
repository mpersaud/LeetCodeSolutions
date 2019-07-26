package DesignHashMap;

class MyHashMap {

    class Entry {

        int key;
        int value;
        Entry next;

        Entry(int key, int value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;

        }

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

    }

    Entry[] associateArray;
    int maxSize = 1000000;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {

        associateArray = new Entry[maxSize];


    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        Entry entry = new Entry(key, value);
        int hash = getHash(key);
        Entry list = associateArray[hash];

        if (list == null) {
            associateArray[hash] = entry;
            return;
        } else {
            Entry itr = list;

            while (itr.next != null) {
                if (itr.key == key) {
                    itr.value = value;
                    return;
                }
                itr = itr.next;
            }

            if (itr.key == key) {
                itr.value = value;
            } else {
                itr.next = entry;

            }
        }


    }


    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {

        int hash = getHash(key);

        Entry itr = associateArray[hash];

        while (itr != null) {

            if (itr.key == key) {
                return itr.value;
            }
            itr = itr.next;
        }
        return -1;

    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {

        int hash = getHash(key);

        Entry itr = associateArray[hash];
        if(itr==null)
            return;

        if (itr.key == key) {
            associateArray[hash] = itr.next;
            return;
        }

        while (itr.next != null) {

            if (itr.next.key == key) {
                itr.next = itr.next.next;
                return;
            }
            itr = itr.next;
        }


    }

    public int getHash(int key) {

        return key % maxSize;
    }




    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */

    public static void main(String[] args) {

        int key=1;
        int value=3;
         //Your MyHashMap object will be instantiated and called as such:
          MyHashMap obj = new MyHashMap();
//          obj.put(key,value);
//          //int param_2 = obj.get(key);
//          int param_2 = obj.get(2);
//          System.out.println(param_2);
//          obj.remove(key);
//          param_2 = obj.get(1);
//          System.out.println(param_2);

        obj.remove(14);
        obj.get(4);




    }
}
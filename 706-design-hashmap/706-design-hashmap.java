class MyHashMap {

    final int[] map = new int[1000001];
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        map[key]=value;
        if(value==0) map[key]=-1;;
    }
    
    public int get(int key) {
        if(map[key]==0) return -1;
        if(map[key]==-1) return 0;
        return map[key];
    }
    
    public void remove(int key) {
        map[key]=0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
package model;

public class Teatherr extends User implements Teacher<Integer> {

    Integer id;
    static int cnt = 0;
    @Override
    public Integer getID() {
        return id;
    }
    
    public Teatherr(String name) {
        super(name);
        cnt++;
        this.id = cnt;
    }
    @Override 
    public String toString() {
        return Integer.toString(id);
    }
}

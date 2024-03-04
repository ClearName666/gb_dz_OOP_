package model;

public class Studentt extends User implements Student<Integer>{

    Integer id;
    static int cnt = 0;

    @Override
    public Integer getID() {
        return id;
    }
    
    public Studentt(String name) {
        super(name);
        cnt++;
        this.id = cnt;
    }
    @Override
    public String toString() {
        return Integer.toString(id);
    }

}

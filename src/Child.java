public class Child {
    protected int money;
    private int id;

    public Child(int id) {
        this.id = id;
        this.money = 0;
    }

    public String toString(){
        return " " + this.money;
    }

}

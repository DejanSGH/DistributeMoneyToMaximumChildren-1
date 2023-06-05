import java.util.Arrays;

public class Solution {

    private int money;
    private int numberOfChildren;
    protected int numOfEightDollarsChild;
    private Child[] children;

    public Solution(int money, int numberOfChildren) {
        this.money = money;
        this.numberOfChildren = numberOfChildren;
        children = new Child[numberOfChildren];
        for (int i = 0; i < numberOfChildren; i++) {
            children[i] = new Child(i);
        }
    }

    public int distMoney(int money, int numberOfChildren){
        numOfEightDollarsChild = 0;
        if(money < numberOfChildren){
            return -1;
        }
        for (int i = 0; i < numberOfChildren; i++) {
            children[i].money += 1;
            this.money -= 1;
        }
        for (int i = 0; i < numberOfChildren; i++) {
            if(this.money >= 7){
                children[i].money += 7;
                this.money -= 7;
            }
            else{
                if(children[i].money + this.money == 4){
                    children[0].money += this.money;
                    this.money = 0;
                }
                children[i].money += this.money;
                this.money = 0;
            }
        }
        for (int i = 0; i < numberOfChildren; i++) {
            if(children[i].money == 8){
                numOfEightDollarsChild ++;
            }
        }
        System.out.println(numOfEightDollarsChild);
        return numOfEightDollarsChild;
    }

    public String toString(){
        System.out.println(Arrays.toString(children));
        return " ";
    }

}

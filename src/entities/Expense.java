package entities;

public class Expense {

    private Integer value;
    private Integer valueLimit;

    public Expense(Integer value, Integer valueLimit){
        this.value = value;
        this.valueLimit = valueLimit;
    }

    public int addAmount(int amount){
        return value += amount;
    }

    public void setValueLimit(int valueLimit){
        this.valueLimit = valueLimit;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

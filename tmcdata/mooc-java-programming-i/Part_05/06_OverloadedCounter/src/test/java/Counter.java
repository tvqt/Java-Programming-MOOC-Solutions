public class Counter {
    private int number;

    public Counter(int startValue) {
        this.number = startValue;
    }
    
    public Counter() {
        this(0);
    }
    
    public int value() {
        return this.number;
    }

    public void increase(int increaseBy) {
        this.number += increaseBy;
    }

    public void decrease(int decreaseBy) {
        this.number -= decreaseBy;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        increase(-1);
    }

}

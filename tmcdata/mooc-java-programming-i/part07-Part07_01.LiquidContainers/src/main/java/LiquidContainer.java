public class LiquidContainer {
    private int volume;

    public LiquidContainer() {
        this.volume = 0;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        this.volume = this.volume + amount;
        if (this.volume > 100) {
            this.volume = 100;
        }
    }

    public void move(int amount, LiquidContainer container) {
        if (amount < 0) {
            return;
        }

        if (this.volume < amount) {
            amount = this.volume;
        }

        this.volume = this.volume - amount;
        container.add(amount);
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.volume = this.volume - amount;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    public int getVolume() {
        return this.volume;
    }
}

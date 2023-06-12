
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        double affordableMeal = 2.50;
        if (payment >= affordableMeal) {
            this.money += affordableMeal;
            this.affordableMeals++;
            return payment - affordableMeal;
        } else {
            return payment;
        }
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        double heartyMeal = 4.30;
        if (payment >= heartyMeal) {
            this.money += heartyMeal;
            this.heartyMeals++;
            return payment - heartyMeal;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMeal = 2.50;
        if (card.balance() >= affordableMeal) {
            card.takeMoney(affordableMeal);
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMeal = 4.30;
        if (card.balance() >= heartyMeal) {
            card.takeMoney(heartyMeal);
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

public class Dice {

    int numOfDice;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numOfDice; i++) {
            sum += (int) (Math.random() * 6) + 1;
        }
        return sum;
    }
}

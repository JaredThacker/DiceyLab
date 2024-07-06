public class Simulation {

    Integer numDice;
    Integer rolls;


    public Simulation(int numDice, int rolls) {
        this.numDice = numDice;
        this.rolls = rolls;
    }

    public void runSim(){
        Dice dice = new Dice(numDice);
        Bins bin = new Bins(numDice, numDice*6);
        bin.createBins();
        for (int i = 0; i < rolls; i++){
            Integer eachRoll = dice.tossAndSum();
            bin.incrementBin(eachRoll);
        }
    }

    public void printRes(){
        Bins bin = new Bins(numDice, numDice*6);
        System.out.println("***");
        System.out.println("Simulation of " +numDice + " dice tossed for " + rolls + " times.");
        System.out.println("***\n");

        for (Integer key : bin.binMap.keySet()){
            float ratio = ((bin.binMap.get(key))/ (float) rolls);
            int starNum = (int) (ratio * 100);
            String stars = "*".repeat(starNum);
            System.out.format("%3d : %8d : %.2f %s %n" , key, bin.binMap.get(key), ratio, stars);
        }
    }


    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1000000);
        sim.runSim();
        sim.printRes();
    }
}

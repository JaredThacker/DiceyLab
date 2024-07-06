import java.util.HashMap;

public class Bins {

    int low;
    int high;

    static HashMap<Integer, Integer> binMap;

    public Bins(Integer low, Integer high){
        this.low = low;
        this.high = high;
    }

    public void createBins(){
        this.binMap = new HashMap<Integer, Integer>();
        for(Integer key = low; key <= high; key++){
            binMap.put(key, 0);
        }
    }

    public void incrementBin(Integer key){
        binMap.put(key, binMap.get(key) + 1);
    }

    public Integer getBin(Integer key){
        return binMap.get(key);
    }
}

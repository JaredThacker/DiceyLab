import java.util.HashMap;

public class Bins {

    static HashMap<Integer, Integer> binMap;

    public Bins(Integer low, Integer high){
        this.binMap = new HashMap<Integer, Integer>();
        for(Integer key = low; key <= high; key++){
            binMap.put(key, 0);
        }
        System.out.println(binMap);
    }

    public void incrementBin(Integer key){
        binMap.put(key, binMap.get(key) + 1);
    }

    public Integer getBin(Integer key){
        return binMap.get(key);
    }
}

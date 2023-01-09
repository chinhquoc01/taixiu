import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dice {
    private int num;
    private static final List<Integer> staticProbalities = Arrays.asList(1,1,1,1, 2,2,2,2, 3,3,3,3, 4,4,4,4, 5,5,5,5, 6,6,6,6);
    private List<Integer> probalities;
    private static Random rand = new Random();

    public Dice(int num) {
        this.num = num;
        probalities = new ArrayList<>(Dice.staticProbalities);
        probalities.add(num);
    }

    public int roll() {
        return probalities.get(rand.nextInt(probalities.size()));
    }
    
}

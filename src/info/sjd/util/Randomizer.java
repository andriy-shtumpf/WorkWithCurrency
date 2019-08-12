package info.sjd.util;

import java.util.Random;

public class Randomizer {
                                            // 10   // 20
    public static Integer getRandomInteger(int min, int max){
        if (min>=max){
            return null;
        }
                //10                        0 -> (20-10)
        return min + new Random().nextInt(max-min);
    }
}

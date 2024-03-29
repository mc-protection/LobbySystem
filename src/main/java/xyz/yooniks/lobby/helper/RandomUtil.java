package xyz.yooniks.lobby.helper;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.lang.Validate;

public final class RandomUtil {

  private static final Random rand = ThreadLocalRandom.current();

  private RandomUtil() {
  }

  public static int getRandInt(int min, int max) throws IllegalArgumentException {
    Validate.isTrue(max > min, "Max can't be smaller than min!");
    return rand.nextInt(max - min + 1) + min;
  }

  public static double getRandDouble(double min, double max) throws IllegalArgumentException {
    Validate.isTrue(max > min, "Max can't be smaller than min!");
    return rand.nextDouble() * (max - min) + min;
  }

  public static float getRandFloat(float min, float max) throws IllegalArgumentException {
    Validate.isTrue(max > min, "Max can't be smaller than min!");
    return rand.nextFloat() * (max - min) + min;
  }

  public static boolean getChance(double chance) {
    return (chance >= 100.0D) || (chance >= getRandDouble(0.0D, 100.0D));
  }

  public static Random getRandom() {
    return rand;
  }
}
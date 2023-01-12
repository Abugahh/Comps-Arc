import java.util.Random;
import java.text.DecimalFormat;

public class DecimalToBinary {
    static int NUM_RANDOM_NUMS = 30;
    static int MAX_DECIMAL_PLACES = 3;

    public static void main(String[] args) {
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.HALF_UP);

        // Generate and convert random numbers to binary notation
        for (int i = 0; i < NUM_RANDOM_NUMS; i++) {
            double decimalNum = rand.nextDouble() * 100;
            decimalNum = Double.valueOf(df.format(decimalNum));
            String binaryNum = Long.toBinaryString(Double.doubleToLongBits(decimalNum));
            String remarks;
            if(binaryNum.charAt(0) == '0'){
                remarks = "exactly";
            }else{
                remarks = "approximately";
            }
            System.out.println("


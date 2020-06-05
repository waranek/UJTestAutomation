package selenium.uj.project.utils;

import java.util.Random;

public class CustomDataGenerator {

    public Object[][] getDescriptionData (int dataRecordsCount) {
        Object[][] data = new Object[dataRecordsCount][];
        for (int x = 0; x < dataRecordsCount; x ++) {
            data[x] = new String[] {generateRandomString(generateRandomNumber(100,200))};
        }
        return data;
    }

    private int generateRandomNumber(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    private String generateRandomString (int length){
        char[] chars = "qwertyuiopasdfghjklzxcvbnm 1234567890".toCharArray();
        StringBuilder stringBuilder = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i ++){
            char c =chars[random.nextInt(chars.length)];
            stringBuilder.append(c);
        }
        return  stringBuilder.toString();
    }
}

package org.example.ru.netology.sqr;

public class SQRService {

    public int getcount(int minValue, int maxValue) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int i2 = i * i;
            if (i2 >= minValue && i2 <= maxValue) {
                count++;
            }
            if (i2 >= maxValue) {
                return count;
            }
        }
        return count;
    }
}

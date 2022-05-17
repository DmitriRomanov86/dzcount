package ru.netology.sqr;

public class SQRService {
    public int squareNumbers(int Minvalue, int Maxvalue) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= Minvalue) {
                if (i * i <= Maxvalue) {
                    count++;
                }
            }

        }
        return count;
    }
}
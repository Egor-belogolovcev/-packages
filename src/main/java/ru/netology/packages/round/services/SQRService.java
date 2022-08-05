package ru.netology.packages.round.services;

public class SQRService {
    public int numberOfSQR(int a, int b) {
        int cnt = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= a && i * i <= b) {
                cnt++;
            }
        }
        return cnt;
    }
}

package ru.netology;

public class CashbackHackService {
    private final int boundary = 1000;
// расчет бонусов
    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}

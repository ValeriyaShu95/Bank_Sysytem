package com.java.banksySytem;

import java.util.ArrayList;

public class AllAmount {
    public static void allMoney(Persone[] allPersones) {
        Integer allMoney = 0;
        for (int i = 0; i < allPersones.length; i++) {
            for (int j = 0; j < allPersones[i].bills.size(); j++) {
                allMoney = allMoney + allPersones[i].bills.get(j).getAmmount();
            }
        }
        System.out.println("Сумма со всех счетов всех клиентов: " + allMoney);
    }

    public static void allMoneyByAllClients(Persone[] allPersones) {

        for (int i = 0; i < allPersones.length; i++) {
            Integer allMoney = 0;
            for (int j = 0; j < allPersones[i].bills.size(); j++) {
                allMoney = allMoney + allPersones[i].bills.get(j).getAmmount();
            }
            System.out.println(allPersones[i].getName() + " " + allMoney);
        }
    }
}


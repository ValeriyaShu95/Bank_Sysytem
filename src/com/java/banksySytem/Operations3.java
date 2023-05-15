package com.java.banksySytem;

public class Operations3 {
    public static void transaction4(Persone persone1, Persone persone2, int ammount) {
        int finalSumPersone1 = 0;
        int finalSumPersone2 = 0;
        Bill extraBill1 = persone1.mainBill;
        Bill extraBill2 = persone2.mainBill;


        finalSumPersone1 = extraBill1.getAmmount() - ammount;
        finalSumPersone2 = extraBill2.getAmmount() + ammount;
        if (extraBill1.getAmmount() < ammount) {
            System.out.println("На вашем счете недостаточно средств");
        } else {
            extraBill1.setAmmount(finalSumPersone1);
            extraBill2.setAmmount(finalSumPersone2);


        }
    }
}

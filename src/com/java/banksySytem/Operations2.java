package com.java.banksySytem;

public class Operations2 {

    public static void transaction3ByArray(String nameByPersone1, String nameByPersone2,
                                           int ammount, Persone[] persones) {
        Persone extraPersone1 = null;
        Persone extraPersone2 = null;
        for (int i = 0; i < persones.length; i++) {
            if (nameByPersone1.equals(persones[i].getName())) {
                extraPersone1 = persones[i];
            }
        }
        for (int i = 0; i < persones.length; i++) {
            if (nameByPersone2.equals(persones[i].getName())) {
                extraPersone2 = persones[i];
            }
        }
        int extraBillId1 = 0;
        Bill extraBill1 = null;// просто счет, факт существования счета у человека
        for (int i = 0; i < extraPersone1.bills.length; i++) {
            if ((extraPersone1.bills[i].getBillId() > extraBillId1) && (extraPersone1.bills[i].getAmmount() > ammount)) {
                extraBillId1 = extraPersone1.bills[i].getBillId();
                extraBill1 = extraPersone1.bills[i];
            }
        }

        int extraBillId2 = 0;
        Bill extraBill2 = null;
        for (int i = 0; i < extraPersone2.bills.length; i++) {
            if (extraPersone2.bills[i].getBillId() > extraBillId2) {
                extraBillId2 = extraPersone2.bills[i].getBillId();
                extraBill2 = extraPersone2.bills[i];
            }

        }
        if (extraBill1.getAmmount() < ammount) {
            System.out.println("На вашем счете недостаточно средств");
        } else {
            int sum2 = extraBill2.getAmmount() + ammount;
            int sum1 = extraBill1.getAmmount() - ammount;
            extraBill1.setAmmount(sum1);
            extraBill2.setAmmount(sum2);
        }

    }


}
//вместо массива сделать коллекции и дебаг
import com.java.banksySytem.*;

public class Main {
    public static void main(String[] args) {
        Bill persone1Bill1 = new Bill(13, 50);
        Bill persone1Bill2 = new Bill(20, 600);
        Bill[] billsPersone1 = new Bill[]{persone1Bill1, persone1Bill2};

        Bill persone2Bill = new Bill(2045, 4828);
        Bill[] billsPersone2 = new Bill[]{persone2Bill};

        Bill persone3Bill = new Bill(20358, 450);
        Bill[] billsPersone3 = new Bill[]{persone3Bill};


        Persone persone1 = new Persone(123, "Lera", billsPersone1);
        Persone persone2 = new Persone(12, "Max", billsPersone2);
        Persone persone3 = new Persone(13, "gdg", billsPersone3);
        Persone[] persones = new Persone[]{persone1, persone2, persone3};


//        Operations.add(persone1Bill, 100);
////        System.out.println(persone1Bill.getAmmount());
//        Operations.transactionAllMoney(persone1Bill,persone2Bill);
//
//        System.out.println(persone1Bill.getAmmount());
//        System.out.println(persone2Bill.getAmmount());
//
//        Operations.transaction(persone1Bill,persone2Bill, 100);
//        System.out.println(persone1Bill.getAmmount());
//        System.out.println(persone2Bill.getAmmount());
//        //Operations.transactioByName(persone1, persone2);
//        System.out.println(persone1Bill.getAmmount());
//        System.out.println(persone2Bill.getAmmount());

//        Operations2.transaction2ByPersone(persone1, persone2, 40);
        //Operations2.transaction2ByName("Lera", "Max", 100, persones);
        // Operations2.transaction3ByArray("Lera", "Max", 1100, persones);
//        System.out.println(persone1Bill1.getAmmount());
//        System.out.println(persone2Bill.getAmmount());

        Operations3.transaction4(persone1, persone2, 2);
        System.out.println(persone1Bill2.getAmmount());
        System.out.println(persone2Bill.getAmmount());

        Bill newBillPersone1 = new Bill(23, 234);
        persone1.newBill(newBillPersone1);
    }
}

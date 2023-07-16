package exercise.chapter_17.exmaple3;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        staff staff = new staff();
        staff.setCustomer(customer);
        DeliveryManager deliveryManager = new DeliveryManager();
        deliveryManager.setCustomer(customer);
        staff.setDeliveryManager(deliveryManager);
        customer.setShoes("Nike");
        staff.setNikeSneakersFeature("안정감");
        customer.setDeliveryManager(deliveryManager);
        customer.setStaff(staff);
        int nikeSneakersPrice = 50_000;
        staff.setNikeSneakersPrice(nikeSneakersPrice);

        customer.setNikeSneakersPrice(nikeSneakersPrice);

        customer.setCustomerLikeDelivery(true);
        staff.setHavingNikeSneakersInStore(false);

        deliveryManager.setCostForDeliver(15_000);
        deliveryManager.setDaysForDeliver(3);

        customer.QuestionOfNike();
        staff.QuestionAnswer();
        customer.QuestionOfPrice();
        staff.AnswerOfPrice();
        if (customer.getAccount() < nikeSneakersPrice) {
            customer.Return();
        } else if (customer.getAccount() > nikeSneakersPrice && staff.isHavingNikeSneakersInStore() == true) {
            customer.Purchase();
            staff.Check();
            customer.KeepGoing();
            staff.Pay();
            staff.Conveyance();
            customer.MyFeeling();
        } else if (staff.isHavingNikeSneakersInStore() == false && customer.isCustomerLikeDelivery == false) {
            staff.Transfer();
            customer.Return();
        } else if (staff.isHavingNikeSneakersInStore() == false && customer.isCustomerLikeDelivery == true) {
            staff.Pay();
            staff.QuestionOfNike();
            deliveryManager.AnswerOfNike();
            staff.AnswerAboutCustomer();
            if (customer.getAccount() < staff.getNikeSneakersPrice() + deliveryManager.getCostForDeliver()) {
                customer.KeepGoing();
                customer.Sorry();
                staff.RefundOfNike();
                customer.MyFeeling();
            } else if (customer.getAccount() > staff.getNikeSneakersPrice() + deliveryManager.getCostForDeliver()) {
                customer.KeepGoing();
                deliveryManager.MadePackage();
                deliveryManager.TransferPackage();
                customer.PayTransferFee();
                customer.MyFeeling();

            }
        }
    }
}
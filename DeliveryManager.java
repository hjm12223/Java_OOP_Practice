package exercise.chapter_17.exmaple3;

public class DeliveryManager extends Main {
    private int DeliveryAccount = 100_000;
    private Customer customer;

    private int daysForDeliver;
    private int costForDeliver;

    public void setDaysForDeliver(int daysForDeliver) {
        this.daysForDeliver = daysForDeliver;
    }

    public void setCostForDeliver(int costForDeliver) {
        this.costForDeliver = costForDeliver;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCostForDeliver() {
        return costForDeliver;
    }

    public int getDaysForDeliver() {
        return daysForDeliver;
    }

    public void AnswerOfNike() {
        System.out.println("배송 매니저 : 넵 현재 " + customer.getShoes()
                + "주문 가능하십니다 배송 시간은 " + daysForDeliver +
                "일 정도 걸리고요  비용은 " + costForDeliver + "입니다.");
    }

    public void MadePackage() {
        System.out.println("배송 매니저 : 현재 운동화 패키지를 만들고 있습니다");
    }

    public void TransferPackage() {
        System.out.println("배송 매니저 : 고객님에게 전달 완료 했습니다.");
        DeliveryAccount += costForDeliver;
    }
}

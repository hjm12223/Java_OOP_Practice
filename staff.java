package exercise.chapter_17.exmaple3;

public class staff extends Main {


    private DeliveryManager deliveryManager;
    private Customer customer;
    private int StaffAccount = 100_000;

    boolean havingNikeSneakersInStore;

    public void setHavingNikeSneakersInStore(boolean havingNikeSneakersInStore) {
        this.havingNikeSneakersInStore = havingNikeSneakersInStore;
    }

    public void setDeliveryManager(DeliveryManager deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    public int getStaffAccount() {
        return StaffAccount;
    }

    private String nikeSneakersFeature;
    private int nikeSneakersPrice;

    public long getNikeSneakersPrice() {
        return nikeSneakersPrice;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setNikeSneakersPrice(int nikeSneakersPrice) {
        this.nikeSneakersPrice = nikeSneakersPrice;
    }

    public boolean isHavingNikeSneakersInStore() {
        return havingNikeSneakersInStore;
    }

    public void setNikeSneakersFeature(String nikeSneakersFeature) {
        this.nikeSneakersFeature = nikeSneakersFeature;
    }

    public void QuestionAnswer() {
        System.out.println("매장 직원 : " + customer.getShoes() + " 의 특징은 " + nikeSneakersFeature + "입니다");
    }
    public void AnswerOfPrice(){
        System.out.println("매장 직원 : " +getNikeSneakersPrice() + " 입니다!");
    }
    public void Check(){
        System.out.println("매장 직원 : 재고는 현재 " + havingNikeSneakersInStore + " 입니다!");
    }
    public void  Pay(){
        System.out.println("매장 직원 : 넵 알겠습니다 그럼 " + getNikeSneakersPrice() + " 결제 도와드리겠습니다.");
        StaffAccount += getNikeSneakersPrice();
    }
    public void Conveyance() {
        System.out.println("매장 직원 : 넵 여기 주문하신 " + customer.getShoes() + " 입니다!");
    }
    public void Transfer() {
        System.out.println("손님 죄송하지만 지금 재고가 없습니다.. 혹시 주문을 선호하시나요?");
    }

    public void QuestionOfNike() {
        System.out.println("매장 직원 : 배송 매니저님 현재 "+ customer.getShoes() + "요청 가능할까요?");
    }

    public void AnswerAboutCustomer(){
        System.out.println("매장 직원 : 손님 현재 배송 일정은 " + deliveryManager.getDaysForDeliver() +"" +
                " 일정도 걸릴 것이며 배송비는 "+ deliveryManager.getCostForDeliver() + "입니다!");
    }
    public void RefundOfNike() {
        System.out.println("당연히 가능하죠 고객님 바로 환불 해드릴게용 ");
        StaffAccount -= nikeSneakersPrice;
        customer.setAccount(customer.getAccount() + nikeSneakersPrice);
    }
}

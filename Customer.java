package exercise.chapter_17.exmaple3;

public class Customer extends Main {
    private int Account = 100_000;
    private String Shoes;
    private long nikeSneakersPrice;
    private DeliveryManager deliveryManager;

    public void setDeliveryManager(DeliveryManager deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    private staff staff;

    public void setStaff(exercise.chapter_17.exmaple3.staff staff) {
        this.staff = staff;
    }

    public void setAccount(int account) {
        Account = account;
    }

    public long getNikeSneakersPrice() {
        return nikeSneakersPrice;
    }
    boolean isCustomerLikeDelivery;

    public void setCustomerLikeDelivery(boolean customerLikeDelivery) {
        isCustomerLikeDelivery = customerLikeDelivery;
    }

    public void setNikeSneakersPrice(long nikeSneakersPrice) {
        this.nikeSneakersPrice = nikeSneakersPrice;
    }

    public void setShoes(String shoes) {
        Shoes = shoes;
    }

    public int getAccount() {
        return Account;
    }

    public String getShoes() {
        return Shoes;
    }



    public void QuestionOfNike() {
        System.out.println("고객 : " + Shoes +" 운동화에 대해서 알려주세요");
    }

    public void QuestionOfPrice() {
        System.out.println("고객 : 좋습니다 혹시 가격은 얼마인지 알 수 있을까요?");
    }

    public void Return(){
        System.out.println("고객 : 죄송하지만 돈이 부족해서 다음에 올게요..");
    }
    public void Purchase(){
        System.out.println("고객 : 혹시 재고가 있을까요?");
    }
    public void KeepGoing(){
        System.out.println("고객 : 좋습니다 그럼 결제 해주세용");
        Account -= staff.getNikeSneakersPrice();
    }
    public void MyFeeling(){
        System.out.println("고객 : 기분이 좋아용!");
    }
    public void Sorry() {
        System.out.println("고객 : 죄송하지만 방금 계좌를 확인 했는데 저가 돈이 없어서 환불이 가능할까요?");
        Account += staff.getNikeSneakersPrice();
    }
    public void PayTransferFee(){
        System.out.println("고객 : 감사합니다");
        Account -= deliveryManager.getCostForDeliver();
    }
}

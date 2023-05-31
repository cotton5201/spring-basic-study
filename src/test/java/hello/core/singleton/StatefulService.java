package hello.core.singleton;

//test 용도가 아닌 service 용도
public class StatefulService {

    //상태를 유지할 경우
//    private int price; //상태를 유지하는 필드 10000 -> 20000

//    public void order(String name, int price) {
//        System.out.println("name = " + name + " price = " + price);
//        this.price = price; //여기가 문제!
//    }

//    public int getPrice() {
//        return  price;
//    }

    //해결방법 예시 (무상태로 설계)
    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        return price; //여기가 문제!
    }

}

public class IPhone implements Phone {

    //  인터페이스 Phone을 구현 했기 때문에 메서드를 반드시 재정의 해야 한다.
    
    @Override
    public void powerOn() {
        System.out.println("아이폰 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("아이폰 전원 OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("아이폰 볼륨 UP");
    }

    @Override
    public void volumeDown() {
        System.out.println("아이폰 볼륨 DOWN");
    }

    /*
    public void turnOn() {
        System.out.println("아이폰 전원 ON");
    }

    public void turnOff() {
        System.out.println("아이폰 전원 OFF");
    }

    public void soundUp() {
        System.out.println("아이폰 볼륨 UP");
    }

    public void soundDown() {
        System.out.println("아이폰 볼륨 DOWN");
    }
    */

}   //  IPhone
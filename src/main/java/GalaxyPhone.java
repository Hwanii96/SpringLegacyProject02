public class GalaxyPhone implements Phone {

    //  인터페이스 Phone을 구현 했기 때문에 메서드를 반드시 재정의 해야 한다.

    @Override
    public void powerOn() {
        System.out.println("갤럭시폰 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("갤럭시폰 전원 OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("갤럭시폰 볼륨 UP");
    }

    @Override
    public void volumeDown() {
        System.out.println("갤럭시폰 볼륨 DOWN");
    }

}   //  GalaxyPhone
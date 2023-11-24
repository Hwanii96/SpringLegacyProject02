public class Client {
    public static void main(String[] args) {

        GalaxyPhone galaxyPhone = new GalaxyPhone();    //  갤럭시폰 사용을 위해 객체화.

        galaxyPhone.powerOn();  //  갤럭시폰 전원 ON
        galaxyPhone.volumeUp(); //  갤럭시폰 볼륨 UP
        galaxyPhone.volumeDown();   //  갤럭시폰 볼륨 DOWN
        galaxyPhone.powerOff(); //  갤럭시폰 전원 OFF

        System.out.println("===== 줄바꿈 =====");

        //  이때, 만약에 아이폰도 사용 하고 싶으면 어떻게 해야 할까 ?

        IPhone iPhone = new IPhone();   //  아이폰 사용을 위해 객체화.

        iPhone.turnOn();    //  아이폰 전원 ON
        iPhone.soundUp();   //  아이폰 볼륨 UP
        iPhone.soundDown(); //  아이폰 볼륨 DOWN
        iPhone.turnOff();   //  아이폰 전원 OFF

        //  위와 같이 작성 해야 한다.
        //  고작 폰 하나 바꿨을 뿐인데, 여러개의 코드를 다르게 작성 해야 하는 것을 확인 할 수 있다.
        //  1) 클래스명
        //  2) 생성자
        //  3) 메서드명

        //  [ 결론 ]
        //  개발자가 직접
        //  new 키워드를 사용 해서 객체화를 하면 코드의 결합도가 높아 진다. == 유지 보수 불리
        //  코드의 결합도를 낮출 수 있는 방법 ?
        //  다형성 실현 하기 !

    }   //  main()

}   //  mainClass

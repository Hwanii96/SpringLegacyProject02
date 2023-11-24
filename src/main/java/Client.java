public class Client {
    public static void main(String[] args) {

//        Phone phone = new GalaxyPhone();    //  참조변수는 Phone 인터페이스 타입 이지만, 실제 주체는 갤럭시폰 이다.

        Phone phone = new IPhone();   //  참조변수는 Phone 인터페이스 타입 이지만, 실제 주체는 아이폰 이다.

        phone.powerOn();
        phone.volumeUp();
        phone.volumeDown();
        phone.powerOff();

        //  위와 같이, 인터페이스의 다형성 개념을 활용 하여 코드의 결합도를 낮출 수 있다.
        //  (코드의 재작성 빈도수를 낮춤 == 유지 보수 유리)

        //  그런데, 여전히 개발자가 직접 new 키워드를 사용 하고 있다.
        //  new 키워드를 사용 하지 않는 다른 방법으로 Factory 패턴 개념을 활용 할 수 있다.

        //  Factory 패턴
        //  객체를 생성 하는 코드를 캡슐화.
        //  == new 키워드와 관련된 코드를 은닉 (Hiding)
        //  사용자로부터 필요한 객체의 이름을 받아, 객체 자체를 반환 하는 로직.
        //  코드를 단 한 글자도 변경 하지 않아도, 결과 (화면) 가 달라 진다 !

    }   //  main()

}   //  mainClass

package com.ohgiraffers.section02.overriding;

public class SubClass extends SuperClass {

    /* 목차. 1. 메소드의 이름 변경 */
//    @Override
//    public void method2(int num){}

    /* 목차. 2. 메소드의 리턴타입 변경하면 에러 발생 */
//    @Override
//    public int method(int num) {return 0; }

    /* 목차. 3. 매개변수 개수나 타입이 변경되면 에러 발생 */
//    @Override
//    public void method(String num) { }

    /* 목차. 4. 메소드 이름, 리턴타입, 매개변수의 개수, 타입, 순서 일치의 경우 성립. */
    @Override
    public void method(int num){}

    /* 목차. 5. private 메소드는 오버라이딩 불가 */
//    @Override
//    private void privateMethod(){}        //해당클래스 내부에서만 동작 가능한 메소드이니깐~~

    /* 목차. 6. final 키워드 메소드 오버라이딩 불가 */
//    @Override
//    public final void finalMethod(){}   // final 이 종단(마지막)의 의미를 가지고 있기 때문에 재정립 할 수가 없다.

    /* 목차. 7. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능 */
//    @Override
//    void protetedMethod(){{ }     // 더 좁은 범위는 불가능.(확장은 하되, 축소는 안된다!)

//    @Override
//    protected void protectedMethod(){} // 같은 범위는 가능하다~!! (protected-protected)

    @Override
    public  void protectedMethod(){}       // 더 넓은 범위도 가능~!! (protected-public)
    // * 결론: 부모의 기능을 가지고 더 넓은 기능은 가능하지만, 좁아질 수는 없다.

}

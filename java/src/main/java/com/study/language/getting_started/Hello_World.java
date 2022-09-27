package com.study.language.getting_started;

public class Hello_World {

    /**
     * 1. 자바 Java Programming Language
     * <p>1-1 자바란?</p>
     * Sun Microsystems 에서 개발한 객체지향 프로그래밍 언어. 자바는 JVM 으로 인해 운영체제에 독립적이다.
     *
     * <p>1-2 자바의 역사</p>
     * Oak(오크)라는 언어에서 부터 시작됨. 제임스 고슬링과 아서 벤 호프 와 같은 썬의 엔지니어가 가전제품의 탑제 목적으로 만듬.
     *
     * <p>1-3 자바언어의 특징</p>
     *
     * <b>1. 운영체제에 독립적이다.</b>
     * Java 프로그램의 경우 운영체제에 독립 적이지만 JVM의 경우 운영체제에 종속적이다.
     *
     * <b>2. 객체지향언어다.</b>
     * 객체지향개념의 특징으로 상속, 캠슐화, 다형성이 잘 적용되어 있다.
     *
     * <b>3. 자동 메모리 관리</b>
     * 가비지 컬렉션이 자동으로 메모리를 관리 해준다.
     *
     * <b>4. 네트워크와 분산처리를 지원한다.</b>
     * 다양한 라이브러리를 통해 비교적 짧은시간에 네트워크 관련 프로그램을 개발할 수 있다.
     *
     * <b>5. 멀티스레드를 지원한다.</b>
     * 시스템과는 관계없이 구현가능하고, 관련 라이브러리가 제공되어 구현이 쉽다. 여러 쓰레드 스케쥴링은 자바 인터프리터가 담당한다.
     *
     * <b>6. 동적로딩을 지원한다.</b>
     * Java 는 실행시에 모든 클래스가 로딩되지 않고 필요한 시점에 클래스를 로딩하여 사용할수 있다.
     */

    public void test() {
        //주석 사용.
        /*
        이렇게
        여러 줄은 한번에 주석 처리도 가능.
         */
        System.out.println("Hello!!!");
    }

}

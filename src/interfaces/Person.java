package interfaces;

public class Person implements MyIntrf{

    @Override  // а эта штука здесь зачем появляется???
    public void Method2() {
        System.out.println("Person реализует MyIntrf");
    }
}

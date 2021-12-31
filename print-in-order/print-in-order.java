class Foo {

    public Foo() {
        
    }
    boolean completedFirst = false;
    boolean completedSecond = false;
    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        completedFirst=true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
       while(completedFirst==false){};
        printSecond.run();
        completedSecond=true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(completedSecond==false){};
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
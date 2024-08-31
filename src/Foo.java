import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class Foo {
    private AtomicInteger state ;
    public Foo(){
        state = new AtomicInteger(1);
        //this.state.set(1);
    }
    public void first() {
        try {
            while (this.state.get() != 1) {
                sleep(1000);
            }
        }
        catch(InterruptedException exc){}
       // this.state.set(2);
        System.out.println("first");
        this.state.set(2);
    }
    public void second() {
        try {
            while (this.state.get() != 2) {
                sleep(1000);
            }
        }
        catch(InterruptedException exc){}
       // this.state.set(3);
        System.out.println("second");
        this.state.set(3);
    }
    public void third() {
        try {
            while (this.state.get() != 3) {
                sleep(1000);
            }
        }
        catch(InterruptedException exc){}
        this.state.set(3);
        System.out.println("third"); }
}


package OOPS.lab6_2.Q;

import OOPS.lab6_2.p.A;

public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.publicMethod();
        obj.protectedMethod();
        
        A obj2 = new A();
        obj2.publicMethod();
    }
}

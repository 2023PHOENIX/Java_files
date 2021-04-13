class Test {

    public static void main(String[] args) {
         class Foo {
            public final int i = 3;
        }  Object o = new Foo();
        Foo foo = (Foo) o;
         System.out.println("i = " + foo.i);
    }
}
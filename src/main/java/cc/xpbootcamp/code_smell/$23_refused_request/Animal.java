package cc.xpbootcamp.code_smell.$23_refused_request;

public abstract class Animal {
    protected String name;

    public void layEgg() { // 下蛋
        System.out.println("Get an egg.");
    }

    public void milk() {
        System.out.println("Get milk.");
    }

    public abstract void provide();
}

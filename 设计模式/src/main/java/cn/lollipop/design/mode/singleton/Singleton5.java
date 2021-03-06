package cn.lollipop.design.mode.singleton;

/**
 * 枚举实现 - 线程安全
 * 该实现在多次序列化再进行反序列化之后，不会得到多个实例。而其它实现需要使用transient修饰所有字段，并且实现序列化和反序列化的方法。
 * <p>
 * 该实现可以防止反射攻击。在其它实现中，通过setAccessible()方法可以将私有构造函数的访问级别设置为public，然后调用构造函数从而实例化对象
 * 如果要防止这种攻击，需要在构造函数中添加防止多次实例化的代码。该实现是由JVM保证只会实例化一次，因此不会出现上述的反射攻击。
 */
public enum Singleton5 {
    INSTANCE;
}

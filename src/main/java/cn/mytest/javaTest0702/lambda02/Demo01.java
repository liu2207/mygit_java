package cn.mytest.javaTest0702.lambda02;

/**
 * 测试类
 * <p>
 * 无参无返回值抽象方法的练习
 * 操作步骤
 * 定义一个接口(Eatable)，里面定义一个抽象方法：void eat();
 * 定义一个测试类(EatableDemo)，在测试类中提供两个方法
 * 一个方法是：useEatable(Eatable e)
 * 一个方法是主方法，在主方法中调用useEatable方法
 */
public class Demo01 {
    public static void main(String[] args) {
        EatableImpl e = new EatableImpl();
        useEatable(e);

        System.out.println("----");

        useEatable(
                () ->

                    System.out.println("lambda表达式的调用方法...")

        );
    }

    //测试类中的方法
    public static void useEatable(Eatable e) {
        e.eat();
    }
}

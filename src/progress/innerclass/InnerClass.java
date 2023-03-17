package progress.innerclass;

/**
 * 关于内部类
 * @auther Bai_YiA2
 */
public class InnerClass {
    public static void main(String[] args) {
        /*
        一个类的内部又完整的嵌套了另一个类结构。被嵌套的类称为内部类(inner class)
        嵌套其他类的类称为外部类(outer class)。是我们类的第五大成员(属性、方法、
        构造器、代码块、内部类）内部类最大的特点就是可以直接访问私有属性，并且可以体
        现类与类之间的包含关系
        
        分类：
                                                  /匿名内部类(没有类名)
                 /定义在外部类的局部位置上(如方法内)<-|
                |                                 \局部内部类(有类名)
        内部类 <-|
                |                                 /成员内部类(不用static)
                 \定义在外部类的成员位置上         <-|
                                                  \静态内部类(用static)
         */
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.m();
    }
}

/**
 * 关于局部内部类
 * @auther Bai_YiA2
 */
class LocalInnerClass {// 外部类
    private int num = 100;
    private int n = 222;
    public void m2() {
        System.out.println("m2");
    }
    public void m() {// 方法
        /*
        局部内部类是定义在外部类的局部位置，通常在方法
        不能添加访问修饰符，因为本身为局部变量，局部变量不能使用访问修饰符，
        但是可以用final，让其他局部内部类不能继承他
        作用域在定义他的方法或代码块中
         */
        class LocalInner {// 局部内部类(本质还是类)
            // 可以访问外部类的所有成员包括但不限于私有的
            private int n = 111;
            public void f() {
                // 可以直接访问外部类成员
                System.out.println(num);
                m2();
                // 当局部内部类成员和外部类成员重名的时候访问采用就近原则
                // 当访问外部类的成员时使用 外部类名+this+成员名
                System.out.println("inner的n" + n + "outer的n" + LocalInner.this.n);
            }
        }
        
        // 外部类调用时先创建对象在调用方法(需要在作用域内)
        // 外部其他类不能访问局部内部类因为局部内部类是一个成员变量
        LocalInner localInner = new LocalInner();
        localInner.f();
    }
}

/**
 * 关于匿名内部类
 * @auther Bai_YiA2
 */
class AnonymousInnerClass {
    // TODO
}

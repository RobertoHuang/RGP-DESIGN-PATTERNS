/**
 * FileName: StaticInnerClassSingleton
 * Author:   HuangTaiHong
 * Date:     2019/5/8 8:53
 * Description: 静态内部类单例模式.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.singleton;

/**
 * 〈静态内部类单例模式.〉
 *
 *  饿汉式单例类不能实现延迟加载，不管将来用不用始终占据内存
 *
 *  懒汉式单例类线程安全控制烦琐，而且性能受影响
 *
 *  Initialization Demand Holder将两者的优点合二为一
 *
 *  由于静态单例对象没有作为Singleton的成员变量直接实例化，因此类加载时不会实例化Singleton，第一次调用getInstance()时将加载内部类HolderClass
 *
 *  在该内部类中定义了一个static类型的变量instance，此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次
 *
 * @author HuangTaiHong
 * @create 2019/5/8
 * @since 1.0.0
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        // 防止通过反射进行实例化
        if (null != HolderClass.INSTANCE) {
            throw new IllegalStateException("单例构造器禁止反射调用.");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return HolderClass.INSTANCE;
    }

    private static class HolderClass {
        private final static StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}
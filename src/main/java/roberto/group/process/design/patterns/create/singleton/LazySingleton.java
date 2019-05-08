/**
 * FileName: LazySingleton
 * Author:   HuangTaiHong
 * Date:     2018/11/25 10:53
 * Description: 懒汉单例模式.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.singleton;

/**
 * 〈懒汉单例模式.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class LazySingleton {
    // 防止指令重排序
    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {
        // 防止通过反射进行实例化
        if (null != INSTANCE) {
            throw new IllegalStateException("单例构造器禁止反射调用.");
        }
    }

    public static LazySingleton getInstance() {
        // 采用局部变量的形式可以提高约25%的性能
        LazySingleton instance = INSTANCE;
        if (null == instance) {
            synchronized (LazySingleton.class) {
                instance = INSTANCE;
                // 双重检查，确保INSTANCE唯一性
                if (null == instance) {
                    INSTANCE = instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
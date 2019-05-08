/**
 * FileName: EagerSingleton
 * Author:   HuangTaiHong
 * Date:     2018/11/25 10:52
 * Description: 饿汉单例模式.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.singleton;

/**
 * 〈饿汉单例模式.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        // 防止通过反射进行实例化
        if (null != INSTANCE) {
            throw new IllegalStateException("单例构造器禁止反射调用.");
        }
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
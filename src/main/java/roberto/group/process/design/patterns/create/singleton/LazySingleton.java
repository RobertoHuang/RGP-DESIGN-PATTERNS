/**
 * FileName: LazySingleton
 * Author:   HuangTaiHong
 * Date:     2018/11/25 10:53
 * Description: 懒汉单例模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 〈一句话功能简述〉<br>
 * 〈懒汉单例模式〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class LazySingleton {
    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {
        // 防止通过反射进行实例化
        if (null != INSTANCE) {
            throw new IllegalStateException("该实例已经存在");
        }
    }

    public static LazySingleton getInstance() {
        // 采用局部变量的形式可以提高约25%的性能
        LazySingleton instance = INSTANCE;
        if (null == instance) {
            synchronized (LazySingleton.class) {
                instance = INSTANCE;
                if (null == instance) {
                    INSTANCE = instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
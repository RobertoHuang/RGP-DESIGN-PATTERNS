/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/25 10:55
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试类〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class Application {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        log.info("饿汉式单例1 = {}", eagerSingleton);
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        log.info("饿汉式单例2 = {}", eagerSingleton2);

        LazySingleton lazySingleton = LazySingleton.getInstance();
        log.info("懒汉式单例1 = {}", lazySingleton);
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        log.info("懒汉式单例2 = {}", lazySingleton2);

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        log.info("枚举型单例1 = {}", enumSingleton);
        EnumSingleton enumDirector2 = EnumSingleton.INSTANCE;
        log.info("枚举型单例2 = {}", enumDirector2);
    }
}
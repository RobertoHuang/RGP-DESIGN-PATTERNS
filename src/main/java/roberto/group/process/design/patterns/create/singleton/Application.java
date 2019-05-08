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
 * 〈测试类.〉
 *
 *  在单例类的内部实现只生成一个单例
 *  同时它提供一个静态的getInstance()工厂方法，让客户可以访问它的唯一实例
 *
 *  为了防止在外部对其实例化，将其构造函数设计为私有
 *  在单例类的内部定义了一个Singleton类型的静态对象，作为外部共享的唯一实例
 *
 *  适用于:
 *      想确保任何情况下绝对只有一个实例
 *      客户调用类的单个实例只允许有一个公共访问点，除了该访问点不能通过其他途径访问该实例
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
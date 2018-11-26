/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/24 23:30
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.factory_method;

import roberto.group.process.design.patterns.create.factory_method.factory.VideoFactory;
import roberto.group.process.design.patterns.create.factory_method.factory.impl.JavaVideoFactory;
import roberto.group.process.design.patterns.create.factory_method.factory.impl.PythonVideoFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试类〉
 *
 *  适用于:
 *      1.创建对象需要大量重复代码
 *      2.客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
 *      3.一个类通过子类来指定创建对象
 *
 *  优点:
 *      1.用于只需要关心所需产品对应的工厂无须关心创建细节
 *      2.加入新产品符合开闭原则，提高扩展性
 *
 *  缺点:
 *      1.类的个数容易过多，增加复杂度
 *      2.增加了系统的抽象性和理解难度
 *
 * @author HuangTaiHong
 * @create 2018/11/24
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        videoFactory.getVideo().produce();

        VideoFactory videoFactory2 = new PythonVideoFactory();
        videoFactory2.getVideo().produce();
    }
}
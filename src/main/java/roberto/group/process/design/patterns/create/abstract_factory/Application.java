/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/25 0:10
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory;

import roberto.group.process.design.patterns.create.abstract_factory.factory.CourseFactory;
import roberto.group.process.design.patterns.create.abstract_factory.factory.impl.JavaCourseFactory;
import roberto.group.process.design.patterns.create.abstract_factory.factory.impl.PythonCourseFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试类.〉
 *
 *  适用于:
 *      1.客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
 *      2.强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量重复的代码
 *      3.提供一个产品类的库，所有产品以同样的接口出现，从而使客户端不依赖于具体实现
 *
 *  优点:
 *      1.具体产品在应用层代码隔离，无须关心创建细节
 *      2.将一个系列的产品族统一到一起创建
 *
 *  缺点:
 *      1.规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 *      2.增加了系统的抽象性和理解难度
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.getVideo().produce();
        javaCourseFactory.getArticle().produce();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.getVideo().produce();
        pythonCourseFactory.getArticle().produce();
    }
}
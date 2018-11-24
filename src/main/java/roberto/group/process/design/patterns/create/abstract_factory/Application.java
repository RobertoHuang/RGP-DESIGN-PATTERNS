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

import roberto.group.process.design.patterns.create.abstract_factory.factory.Factory;
import roberto.group.process.design.patterns.create.abstract_factory.factory.impl.FactoryA;
import roberto.group.process.design.patterns.create.abstract_factory.factory.impl.FactoryB;
import roberto.group.process.design.patterns.create.abstract_factory.factory.impl.FactoryC;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试类〉
 *
 *  抽象工厂是围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂
 *  提供一个创建一系列相关或相互依赖对象的接口而无需指定他们具体的类
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        System.out.println(factoryA.createProduct() instanceof ProductA && factoryA.createGift() instanceof GiftA);

        Factory factoryB = new FactoryB();
        System.out.println(factoryB.createProduct() instanceof ProductB && factoryB.createGift() instanceof GiftB);

        Factory factoryC = new FactoryC();
        System.out.println(factoryC.createProduct() instanceof ProductC && factoryC.createGift() instanceof GiftC);
    }
}
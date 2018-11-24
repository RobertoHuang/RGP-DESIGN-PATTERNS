/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: FactoryA
 * Author:   HuangTaiHong
 * Date:     2018/11/25 0:06
 * Description: 工厂A
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.factory.impl;

import roberto.group.process.design.patterns.create.abstract_factory.factory.Factory;
import roberto.group.process.design.patterns.create.abstract_factory.product.Gift;
import roberto.group.process.design.patterns.create.abstract_factory.product.Product;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.GiftA;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.ProductA;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂A〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class FactoryA implements Factory{
    @Override
    public Gift createGift() {
        return new GiftA();
    }

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
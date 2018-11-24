/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: FactoryB
 * Author:   HuangTaiHong
 * Date:     2018/11/25 0:08
 * Description: 工厂B
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.factory.impl;

import roberto.group.process.design.patterns.create.abstract_factory.factory.Factory;
import roberto.group.process.design.patterns.create.abstract_factory.product.Gift;
import roberto.group.process.design.patterns.create.abstract_factory.product.Product;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.GiftB;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.ProductB;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂B〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class FactoryB implements Factory{
    @Override
    public Gift createGift() {
        return new GiftB();
    }

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
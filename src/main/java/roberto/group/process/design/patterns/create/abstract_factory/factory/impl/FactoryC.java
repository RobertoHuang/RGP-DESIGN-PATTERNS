/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: FactoryC
 * Author:   HuangTaiHong
 * Date:     2018/11/25 0:09
 * Description: 工厂C
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.factory.impl;

import roberto.group.process.design.patterns.create.abstract_factory.factory.Factory;
import roberto.group.process.design.patterns.create.abstract_factory.product.Gift;
import roberto.group.process.design.patterns.create.abstract_factory.product.Product;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.GiftC;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.ProductC;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂C〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class FactoryC implements Factory{
    @Override
    public Gift createGift() {
        return new GiftC();
    }

    @Override
    public Product createProduct() {
        return new ProductC();
    }
}
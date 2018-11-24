/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: FactoryA
 * Author:   HuangTaiHong
 * Date:     2018/11/24 23:26
 * Description: 工厂A
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.factory_method.factory.impl;

import roberto.group.process.design.patterns.create.factory_method.factory.Factory;
import roberto.group.process.design.patterns.create.factory_method.product.Product;
import roberto.group.process.design.patterns.create.factory_method.product.impl.ProductA;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂A〉
 *
 * @author HuangTaiHong
 * @create 2018/11/24
 * @since 1.0.0
 */
public class FactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
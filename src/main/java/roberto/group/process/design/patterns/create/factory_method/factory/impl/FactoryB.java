/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: FactoryB
 * Author:   HuangTaiHong
 * Date:     2018/11/24 23:29
 * Description: 工厂B
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.factory_method.factory.impl;

import roberto.group.process.design.patterns.create.factory_method.factory.Factory;
import roberto.group.process.design.patterns.create.factory_method.product.Product;
import roberto.group.process.design.patterns.create.factory_method.product.impl.ProductB;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂B〉
 *
 * @author HuangTaiHong
 * @create 2018/11/24
 * @since 1.0.0
 */
public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
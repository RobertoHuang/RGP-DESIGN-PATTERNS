/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: FactoryC
 * Author:   HuangTaiHong
 * Date:     2018/11/24 23:29
 * Description: 工厂C
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.factory_method.factory.impl;

import roberto.group.process.design.patterns.create.factory_method.factory.Factory;
import roberto.group.process.design.patterns.create.factory_method.product.Product;
import roberto.group.process.design.patterns.create.factory_method.product.impl.ProductC;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂C〉
 *
 * @author HuangTaiHong
 * @create 2018/11/24
 * @since 1.0.0
 */
public class FactoryC implements Factory {
    @Override
    public Product createProduct() {
        return new ProductC();
    }
}
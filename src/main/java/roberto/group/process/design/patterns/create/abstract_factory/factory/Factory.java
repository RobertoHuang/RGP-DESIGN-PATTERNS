/**
 * Copyright (C), 2015-2018, Vanke.
 * FileName: Factory
 * Author:   HuangTaiHong
 * Date:     2018/11/25 0:07
 * Description: 工厂接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.factory;

import roberto.group.process.design.patterns.create.abstract_factory.product.Gift;
import roberto.group.process.design.patterns.create.abstract_factory.product.Product;

/**
 * 〈一句话功能简述〉<br>
 * 〈工厂接口〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public interface Factory {
    Gift createGift();

    Product createProduct();
}
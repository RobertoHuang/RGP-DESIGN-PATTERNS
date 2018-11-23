/**
 * FileName: Milk
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:32
 * Description: 牛奶
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.decorator.decorator.impl;

import roberto.group.process.design.patterns.structure.decorator.component.Drink;
import roberto.group.process.design.patterns.structure.decorator.decorator.CondimentDecorator;

/**
 * 〈一句话功能简述〉<br>
 * 〈牛奶〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public class Milk extends CondimentDecorator {
    public Milk(Drink decoratorDrink) {
        super(decoratorDrink);
    }

    @Override
    public float cost() {
        return super.cost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+牛奶味";
    }
}
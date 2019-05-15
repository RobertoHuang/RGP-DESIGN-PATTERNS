/**
 * FileName: Ice
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:38
 * Description: 冰块.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.decorator.decorator.impl;

import roberto.group.process.design.patterns.structure.decorator.component.Drink;
import roberto.group.process.design.patterns.structure.decorator.decorator.CondimentDecorator;

/**
 * 〈冰块.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public class Ice extends CondimentDecorator {
    public Ice(Drink decoratorDrink) {
        super(decoratorDrink);
    }

    @Override
    public float cost() {
        return super.cost() + 0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+冰块";
    }
}
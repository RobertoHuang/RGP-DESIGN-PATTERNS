/**
 * FileName: Sugar
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:35
 * Description: 白糖
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.decorator.decorator.impl;

import roberto.group.process.design.patterns.structure.decorator.component.Drink;
import roberto.group.process.design.patterns.structure.decorator.decorator.CondimentDecorator;

/**
 * 〈一句话功能简述〉<br>
 * 〈白糖〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public class Sugar extends CondimentDecorator {
    public Sugar(Drink decoratorDrink) {
        super(decoratorDrink);
    }

    @Override
    public float cost() {
        return super.cost() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+加糖";
    }
}
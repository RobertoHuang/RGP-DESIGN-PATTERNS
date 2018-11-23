/**
 * FileName: CondimentDecorator
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:31
 * Description: 配料装饰器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.decorator.decorator;

import roberto.group.process.design.patterns.structure.decorator.component.Drink;

/**
 * 〈一句话功能简述〉<br>
 * 〈配料装饰器〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public abstract class CondimentDecorator implements Drink {
    protected Drink decoratorDrink;

    public CondimentDecorator(Drink decoratorDrink) {
        this.decoratorDrink = decoratorDrink;
    }

    @Override
    public float cost() {
        return decoratorDrink.cost();
    }

    @Override
    public String getDescription() {
        return decoratorDrink.getDescription();
    }
}
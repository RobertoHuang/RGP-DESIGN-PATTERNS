/**
 * FileName: CondimentDecorator
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:31
 * Description: 配料装饰器.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.decorator.decorator;

import roberto.group.process.design.patterns.structure.decorator.component.Drink;

/**
 * 〈配料装饰器.〉
 *
 *  若只有一个装饰器，则可以没有抽象装饰角色
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public abstract class CondimentDecorator implements Drink {
    // 装饰类还是把动作的执行委托给需要装饰的对象
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
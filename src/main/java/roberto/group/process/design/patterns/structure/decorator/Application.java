/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:36
 * Description: 测试类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.decorator;

import roberto.group.process.design.patterns.structure.decorator.component.Drink;
import roberto.group.process.design.patterns.structure.decorator.component.impl.Coffee;
import roberto.group.process.design.patterns.structure.decorator.decorator.impl.Ice;
import roberto.group.process.design.patterns.structure.decorator.decorator.impl.Milk;
import roberto.group.process.design.patterns.structure.decorator.decorator.impl.Sugar;

/**
 * 〈测试类.〉
 *
 *  装饰模式是继承关系的一个替代方案，解决了类膨胀的问题
 *
 *  装饰模式降低了系统的耦合度，可以动态增加或删除对象的职责
 *
 *  并使得需要装饰的具体构件类和具体装饰类可以独立变化，以便增加新的具体构件类和具体装饰类
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        Drink drink = new Coffee();
        System.out.print(drink.cost());
        System.out.println(drink.getDescription());

        drink = new Milk(drink);
        System.out.print(drink.cost());
        System.out.println(drink.getDescription());

        drink = new Sugar(drink);
        System.out.print(drink.cost());
        System.out.println(drink.getDescription());

        drink = new Ice(drink);
        System.out.print(drink.cost());
        System.out.println(drink.getDescription());
    }
}
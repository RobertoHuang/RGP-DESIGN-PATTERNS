/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:36
 * Description: 测试类
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
 * 〈一句话功能简述〉<br>
 * 〈测试类〉
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
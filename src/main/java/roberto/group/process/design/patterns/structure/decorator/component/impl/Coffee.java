/**
 * FileName: Coffee
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:29
 * Description: 咖啡
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.decorator.component.impl;

import roberto.group.process.design.patterns.structure.decorator.component.Drink;

/**
 * 〈一句话功能简述〉<br> 
 * 〈咖啡〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public class Coffee implements Drink {

    @Override
    public float cost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "原味咖啡";
    }
}
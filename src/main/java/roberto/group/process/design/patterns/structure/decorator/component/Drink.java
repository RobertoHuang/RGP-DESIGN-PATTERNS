/**
 * FileName: Drink
 * Author:   HuangTaiHong
 * Date:     2018/11/23 20:28
 * Description: 饮料接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.decorator.component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈饮料接口〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public interface Drink {
    float cost();

    String getDescription();
}
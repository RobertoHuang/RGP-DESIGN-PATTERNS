/**
 * FileName: TransportationStrategy
 * Author:   HuangTaiHong
 * Date:     2018/11/23 16:41
 * Description: 策略抽象类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.strategy.strage;

/**
 * 〈一句话功能简述〉<br> 
 * 〈策略抽象类〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
@FunctionalInterface
public interface TransportationStrategy {
    void go();
}
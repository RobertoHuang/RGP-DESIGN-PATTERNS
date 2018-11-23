/**
 * FileName: BusinessMan
 * Author:   HuangTaiHong
 * Date:     2018/11/23 17:03
 * Description: 商人
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.strategy.context;

import roberto.group.process.design.patterns.action.strategy.strage.TransportationStrategy;

/**
 * 〈一句话功能简述〉<br>
 * 〈商人〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public class BusinessMan {
    private TransportationStrategy strategy;

    public BusinessMan(TransportationStrategy strategy) {
        this.strategy = strategy;
    }

    public void changetStrategy(TransportationStrategy strategy) {
        this.strategy = strategy;
    }

    public void transport() {
        this.strategy.go();
    }
}
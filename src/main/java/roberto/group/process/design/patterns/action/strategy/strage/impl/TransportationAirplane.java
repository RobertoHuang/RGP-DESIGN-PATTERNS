/**
 * FileName: TransportationAirplane
 * Author:   HuangTaiHong
 * Date:     2018/11/23 16:42
 * Description: 乘飞机策略
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.strategy.strage.impl;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.action.strategy.strage.TransportationStrategy;

/**
 * 〈一句话功能简述〉<br>
 * 〈乘飞机策略〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
@Slf4j
public class TransportationAirplane implements TransportationStrategy {
    @Override
    public void go() {
        log.info("乘飞机从北京去广州");
    }
}
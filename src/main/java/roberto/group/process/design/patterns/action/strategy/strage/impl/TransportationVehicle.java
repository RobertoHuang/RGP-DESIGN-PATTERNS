/**
 * FileName: TransportationVehicle
 * Author:   HuangTaiHong
 * Date:     2018/11/23 17:01
 * Description: 驾车策略
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.strategy.strage.impl;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.action.strategy.strage.TransportationStrategy;

/**
 * 〈一句话功能简述〉<br>
 * 〈驾车策略〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
@Slf4j
public class TransportationVehicle implements TransportationStrategy {
    @Override
    public void go() {
        log.info("驾车从北京去天津");
    }
}
/**
 * FileName: ThreePinSoketAmerica
 * Author:   HuangTaiHong
 * Date:     2018/11/25 16:12
 * Description: 美国三孔插座类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.adapter.targets.impl;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.structure.adapter.targets.ThreePinSoket;

/**
 * 〈一句话功能简述〉<br> 
 * 〈美国三孔插座类〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class ThreePinSoketAmerica implements ThreePinSoket {
    @Override
    public int voltage() {
        return 110;
    }

    @Override
    public void chargeWithThreePin() {
        log.info("美国标准的三孔的插座");
    }
}
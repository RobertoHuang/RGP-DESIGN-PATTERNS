/**
 * FileName: TwoPinSoketChina
 * Author:   HuangTaiHong
 * Date:     2018/11/25 16:15
 * Description: 中国两孔插座类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.adapter.adaptee.impl;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.structure.adapter.adaptee.TwoPinSoket;

/**
 * 〈中国两孔插座类.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class TwoPinSoketChina implements TwoPinSoket {
    @Override
    public int voltage() {
        return 220;
    }

    @Override
    public void chargeWithTwoPin() {
        log.info("中国标准的两孔的插座");
    }
}
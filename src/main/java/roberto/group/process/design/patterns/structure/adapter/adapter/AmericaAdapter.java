/**
 * FileName: AmericaAdapter
 * Author:   HuangTaiHong
 * Date:     2018/11/25 16:16
 * Description: 美国适配器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.adapter.adapter;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.structure.adapter.adaptee.TwoPinSoket;
import roberto.group.process.design.patterns.structure.adapter.targets.ThreePinSoket;

/**
 * 〈美国适配器.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class AmericaAdapter implements TwoPinSoket {
    private ThreePinSoket threePinSoket;

    public AmericaAdapter(ThreePinSoket threePinSoket) {
        this.threePinSoket = threePinSoket;
    }

    @Override
    public int voltage() {
        return threePinSoket.voltage() * 2;
    }

    @Override
    public void chargeWithTwoPin() {
        threePinSoket.chargeWithThreePin();
    }
}
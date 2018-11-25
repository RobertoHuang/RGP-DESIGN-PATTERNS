/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/25 16:19
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.adapter;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.structure.adapter.adaptee.TwoPinSoket;
import roberto.group.process.design.patterns.structure.adapter.adaptee.impl.TwoPinSoketChina;
import roberto.group.process.design.patterns.structure.adapter.adapter.AmericaAdapter;
import roberto.group.process.design.patterns.structure.adapter.target.ThreePinSoket;
import roberto.group.process.design.patterns.structure.adapter.target.impl.ThreePinSoketAmerica;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试类〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class Application {
    public static void main(String[] args) {
        // 在中国用两孔插座充电
        TwoPinSoketChina twoPinSoketChina = new TwoPinSoketChina();
        RongYao rongYao = new RongYao();
        rongYao.setTwoPinSoket(twoPinSoketChina);
        rongYao.chargeRequest();

        // 然后坐飞机去美国旅游，美国某旅馆的墙上有只有一个三孔插座 通过美国适配器用三空插座充电
        ThreePinSoketAmerica threePinSoketAmerica = new ThreePinSoketAmerica();
        testThreePin(threePinSoketAmerica);
        AmericaAdapter americaAdapter = new AmericaAdapter(threePinSoketAmerica);
        testTwoPin(americaAdapter);
        rongYao.setTwoPinSoket(americaAdapter);
        rongYao.chargeRequest();
    }

    static void testTwoPin(TwoPinSoket twoPinSoket) {
        twoPinSoket.chargeWithTwoPin();
        log.info("电压是" + twoPinSoket.voltage() + "伏特\n");
    }

    static void testThreePin(ThreePinSoket threePinSoket) {
        threePinSoket.chargeWithThreePin();
        log.info("电压是" + threePinSoket.voltage() + "伏特\n");
    }

    @Slf4j
    static class RongYao {
        TwoPinSoket twoPinSoket;

        public RongYao() {

        }

        public void setTwoPinSoket(TwoPinSoket twoPinSoket) {
            this.twoPinSoket = twoPinSoket;
        }

        public void chargeRequest() {
            log.info("华为荣耀手机， " + twoPinSoket.voltage() + " 伏特充电中\n");
        }
    }
}
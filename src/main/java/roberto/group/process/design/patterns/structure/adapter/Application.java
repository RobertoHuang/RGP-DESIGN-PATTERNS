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
import roberto.group.process.design.patterns.structure.adapter.targets.ThreePinSoket;
import roberto.group.process.design.patterns.structure.adapter.targets.impl.ThreePinSoketAmerica;

/**
 * 〈测试类.〉
 *
 *  将一个类的接口变换成客户端所期待的另一种接口
 *  从而使原本因接口不不匹配而无法一起工作的两个类能够在一起工作
 *
 *  适配器模式分为类适配器和对象适配器模式，此例子为对象适配器模式
 *  适配器模式是一个补偿模式，最好在详细设计阶段不要考虑它，它不是为了解决还处在开发阶段的问题，而是解决正在服役的项目问题
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

        // 然后坐飞机去美国旅游，美国某旅馆的墙上有只有一个三孔插座
        ThreePinSoketAmerica threePinSoketAmerica = new ThreePinSoketAmerica();
        testThreePin(threePinSoketAmerica);

        // 通过美国适配器用三空插座充电
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
/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/23 17:05
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.strategy;

import roberto.group.process.design.patterns.action.strategy.context.BusinessMan;
import roberto.group.process.design.patterns.action.strategy.strage.impl.TransportationAirplane;
import roberto.group.process.design.patterns.action.strategy.strage.impl.TransportationTrain;
import roberto.group.process.design.patterns.action.strategy.strage.impl.TransportationVehicle;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试类〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan(new TransportationAirplane());
        man.transport();

        man.changetStrategy(new TransportationTrain());
        man.transport();

        man.changetStrategy(new TransportationVehicle());
        man.transport();
    }
}
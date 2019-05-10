/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/25 17:09
 * Description: 测试类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.facade;

import roberto.group.process.design.patterns.structure.facade.facade.Computer;

/**
 * 〈测试类.〉
 *
 *  外观模式通过引入一个外观角色来简化客户端与子系统之间的交互
 *
 *  为复杂的子系统调用提供一个统一的入口，使子系统与客户端的耦合度降低，且客户端调用非常方便
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
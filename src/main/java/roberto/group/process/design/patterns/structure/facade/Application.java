/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/25 17:09
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.facade;

import roberto.group.process.design.patterns.structure.facade.facade.Computer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试类〉
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
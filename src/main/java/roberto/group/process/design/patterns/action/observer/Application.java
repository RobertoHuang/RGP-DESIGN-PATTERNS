/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/23 19:13
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer;

import roberto.group.process.design.patterns.action.observer.observer.impl.Northern;
import roberto.group.process.design.patterns.action.observer.observer.impl.Southern;
import roberto.group.process.design.patterns.action.observer.subject.impl.Time;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试类〉
 *
 *  可参考JDK中的Observable与Observer
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        Time time = new Time();
        time.addObserver(new Northern());
        time.addObserver(new Southern());

        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
    }
}
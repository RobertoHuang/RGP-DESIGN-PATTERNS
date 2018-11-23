/**
 * FileName: Observer
 * Author:   HuangTaiHong
 * Date:     2018/11/23 19:09
 * Description: 时间观察者接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.observer;

import roberto.group.process.design.patterns.action.observer.subject.impl.Time;

/**
 * 〈一句话功能简述〉<br> 
 * 〈时间观察者接口〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public interface Observer {
    void update(Time.TimePoint time);
}
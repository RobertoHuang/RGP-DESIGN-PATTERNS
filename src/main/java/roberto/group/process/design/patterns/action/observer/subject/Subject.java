/**
 * FileName: Time
 * Author:   HuangTaiHong
 * Date:     2018/11/23 19:26
 * Description: 时间主题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.subject;

import roberto.group.process.design.patterns.action.observer.observer.Observer;

/**
 * 〈一句话功能简述〉<br>
 * 〈时间主题〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
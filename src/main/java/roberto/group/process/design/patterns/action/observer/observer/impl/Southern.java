/**
 * FileName: Southern
 * Author:   HuangTaiHong
 * Date:     2018/11/23 19:11
 * Description: 南方人
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.observer.impl;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.action.observer.observer.Observer;
import roberto.group.process.design.patterns.action.observer.subject.impl.Time;

/**
 * 〈一句话功能简述〉<br>
 * 〈南方人〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
@Slf4j
public class Southern implements Observer {
    @Override
    public void update(Time.TimePoint time) {
        log.info("南方人吃饭了");
        switch (time) {
            case MORNING:
                log.info("热干面");
                break;
            case NOON:
                log.info("米饭");
                break;
            case AFTERNOON:
                log.info("茶");
                break;
            case EVENING:
                log.info("鱼");
                break;
            default:
                break;
        }
    }
}
/**
 * FileName: Northern
 * Author:   HuangTaiHong
 * Date:     2018/11/23 19:10
 * Description: 北方人
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
 * 〈北方人〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
@Slf4j
public class Northern implements Observer {
    @Override
    public void update(Time.TimePoint time) {
        log.info("北方人吃饭了");
        switch (time) {
            case MORNING:
                log.info("煎饼果子");
                break;
            case NOON:
                log.info("炸酱面");
                break;
            case AFTERNOON:
                log.info("牛奶");
                break;
            case EVENING:
                log.info("包子");
                break;
            default:
                break;
        }
    }
}
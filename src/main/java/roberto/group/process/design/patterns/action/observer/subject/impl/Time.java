/**
 * FileName: Time
 * Author:   HuangTaiHong
 * Date:     2018/11/23 19:08
 * Description: 时间
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.subject.impl;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.action.observer.observer.Observer;
import roberto.group.process.design.patterns.action.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈时间〉
 *
 * @author HuangTaiHong
 * @create 2018/11/23
 * @since 1.0.0
 */
@Slf4j
public class Time implements Subject {
    private TimePoint point;
    private List<Observer> observers;

    public Time() {
        this.point = TimePoint.MORNING;
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(point);
        }
    }

    public void passing() {
        TimePoint[] points = TimePoint.values();
        point = points[(point.ordinal() + 1) % points.length];
        log.info("时间来到了{}", point);
        notifyObservers();
    }

    public enum TimePoint {
        MORNING("早晨"), NOON("中午"), AFTERNOON("下午"), EVENING("晚上");
        private String name;

        TimePoint(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
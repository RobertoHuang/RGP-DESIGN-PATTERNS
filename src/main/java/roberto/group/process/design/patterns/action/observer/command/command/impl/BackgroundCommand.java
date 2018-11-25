/**
 * FileName: BackgroundCommand
 * Author:   HuangTaiHong
 * Date:     2018/11/25 14:30
 * Description: 背景颜色指令
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.command.command.impl;

import roberto.group.process.design.patterns.action.observer.command.command.Command;
import roberto.group.process.design.patterns.action.observer.command.receiver.WatchTV;

/**
 * 〈一句话功能简述〉<br>
 * 〈背景颜色指令〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class BackgroundCommand extends Command {
    private WatchTV watchTV;
    private final String color;
    private final String oriColor;

    public BackgroundCommand(WatchTV watchTV, String color) {
        this.color = color;
        this.watchTV = watchTV;
        this.oriColor = watchTV.getBackground().getBackgroundColor();
    }

    @Override
    public void execute() {
        this.watchTV.getBackground().setBackgroundColor(color);
    }

    @Override
    public void undo() {
        this.watchTV.getBackground().setBackgroundColor(oriColor);
    }

    @Override
    public void redo() {
        this.execute();
    }

    @Override
    public String toString() {
        return "设置背景颜色为" + color;
    }
}
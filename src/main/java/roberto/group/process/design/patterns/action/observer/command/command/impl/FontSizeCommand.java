/**
 * FileName: FontSizeCommand
 * Author:   HuangTaiHong
 * Date:     2018/11/25 14:26
 * Description: 字体大小指令
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.command.command.impl;

import roberto.group.process.design.patterns.action.observer.command.command.Command;
import roberto.group.process.design.patterns.action.observer.command.receiver.WatchTV;

/**
 * 〈一句话功能简述〉<br>
 * 〈字体大小指令〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class FontSizeCommand extends Command {
    private WatchTV watchTV;
    private final String size;
    private final String oriSize;

    public FontSizeCommand(WatchTV watchTV, String size) {
        this.size = size;
        this.watchTV = watchTV;
        this.oriSize = watchTV.getFont().getFontSize();
    }

    @Override
    public void execute() {
        watchTV.getFont().setFontSize(size);
    }

    @Override
    public void undo() {
        watchTV.getFont().setFontSize(oriSize);
    }

    @Override
    public void redo() {
        this.execute();
    }

    @Override
    public String toString() {
        return "设置字体大小为" + size;
    }
}
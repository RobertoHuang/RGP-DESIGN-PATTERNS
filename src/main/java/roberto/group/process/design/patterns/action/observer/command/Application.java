/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2018/11/25 14:40
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.command;

import roberto.group.process.design.patterns.action.observer.command.command.Command;
import roberto.group.process.design.patterns.action.observer.command.command.impl.BackgroundCommand;
import roberto.group.process.design.patterns.action.observer.command.command.impl.FontSizeCommand;
import roberto.group.process.design.patterns.action.observer.command.invoker.CommandInvoker;
import roberto.group.process.design.patterns.action.observer.command.receiver.WatchTV;

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
        CommandInvoker commandInvoker = new CommandInvoker();

        WatchTV watchTV = new WatchTV();
        watchTV.printStatus();

        // 执行设置字体指令
        Command fontCommand = new FontSizeCommand(watchTV,"LARGE");
        commandInvoker.execute(fontCommand);
        watchTV.printStatus();

        // 执行设置背景颜色指令
        Command backgroundCommand = new BackgroundCommand(watchTV,"Custom Background");
        commandInvoker.execute(backgroundCommand);
        watchTV.printStatus();

        // 撤销执行指令
        commandInvoker.undo();
        watchTV.printStatus();
        commandInvoker.undo();
        watchTV.printStatus();
        commandInvoker.undo();
        watchTV.printStatus();

        // 重复执行指令
        commandInvoker.redo();
        watchTV.printStatus();
        commandInvoker.redo();
        watchTV.printStatus();
        commandInvoker.redo();
        watchTV.printStatus();
    }
}
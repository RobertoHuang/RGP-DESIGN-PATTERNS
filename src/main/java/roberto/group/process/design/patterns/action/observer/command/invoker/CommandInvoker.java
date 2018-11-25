/**
 * FileName: CommandInvoker
 * Author:   HuangTaiHong
 * Date:     2018/11/25 14:37
 * Description: 命令执行器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.command.invoker;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.action.observer.command.command.Command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈命令执行器〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class CommandInvoker {
    private Deque<Command> redoStack = new LinkedList<>();
    private Deque<Command> undoStack = new LinkedList<>();

    public void execute(Command command) {
        command.execute();
        undoStack.offerLast(command);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command previousCommand = undoStack.pollLast();
            redoStack.offerLast(previousCommand);
            log.info("{}正在进行撤销操作，命令为：{}", this, previousCommand);
            previousCommand.undo();
        } else {
            log.info("没有可以撤销的操作了");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command previousCommand = redoStack.pollLast();
            undoStack.offerLast(previousCommand);
            log.info("{}正在进行重做操作，命令为：{}", this, previousCommand);
            previousCommand.redo();
        } else {
            log.info("没有可以重做的操作了");
        }
    }
}
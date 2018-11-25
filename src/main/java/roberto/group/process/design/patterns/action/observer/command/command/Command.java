/**
 * FileName: Command
 * Author:   HuangTaiHong
 * Date:     2018/11/25 14:05
 * Description: 命令抽象类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.command.command;

/**
 * 〈一句话功能简述〉<br>
 * 〈命令抽象类〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public abstract class Command {
    public abstract void execute();

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
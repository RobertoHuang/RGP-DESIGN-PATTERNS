/**
 * FileName: Computer
 * Author:   HuangTaiHong
 * Date:     2018/11/25 17:06
 * Description: Computer
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.facade.facade;

import roberto.group.process.design.patterns.structure.facade.subsystem.CPU;
import roberto.group.process.design.patterns.structure.facade.subsystem.Disk;
import roberto.group.process.design.patterns.structure.facade.subsystem.Memory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Computer〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
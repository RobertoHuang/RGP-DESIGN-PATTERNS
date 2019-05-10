/**
 * FileName: Disk
 * Author:   HuangTaiHong
 * Date:     2018/11/25 17:05
 * Description: Disk.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.facade.subsystem;

import lombok.extern.slf4j.Slf4j;

/**
 * 〈Disk.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class Disk {
    public void startup(){
        log.info("disk startup!");
    }

    public void shutdown(){
        log.info("disk shutdown!");
    }
}
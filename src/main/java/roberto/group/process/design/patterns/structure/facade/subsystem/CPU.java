/**
 * FileName: CPU
 * Author:   HuangTaiHong
 * Date:     2018/11/25 17:04
 * Description: CPU.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.facade.subsystem;

import lombok.extern.slf4j.Slf4j;

/**
 * 〈CPU.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class CPU {
    public void startup(){
        log.info("cpu startup!");
    }

    public void shutdown(){
        log.info("cpu shutdown!");
    }
}
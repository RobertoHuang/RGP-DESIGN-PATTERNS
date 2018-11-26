/**
 * FileName: JavaVideo
 * Author:   HuangTaiHong
 * Date:     2018/11/26 13:33
 * Description: JAVA视频
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.factory_method.product.impl;

import lombok.extern.slf4j.Slf4j;
import roberto.group.process.design.patterns.create.factory_method.product.Video;

/**
 * 〈一句话功能简述〉<br> 
 * 〈JAVA视频〉
 *
 * @author HuangTaiHong
 * @create 2018/11/26
 * @since 1.0.0
 */
@Slf4j
public class JavaVideo extends Video {
    @Override
    public void produce() {
        log.info("录制Java课程视频");
    }
}
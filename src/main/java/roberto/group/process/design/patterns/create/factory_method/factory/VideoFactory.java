/**
 * FileName: VideoFactory
 * Author:   HuangTaiHong
 * Date:     2018/11/26 13:35
 * Description: 视频工厂抽象类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.factory_method.factory;

import roberto.group.process.design.patterns.create.factory_method.product.Video;

/**
 * 〈一句话功能简述〉<br> 
 * 〈视频工厂抽象类〉
 *
 * @author HuangTaiHong
 * @create 2018/11/26
 * @since 1.0.0
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
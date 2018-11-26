/**
 * FileName: JavaVideoFactory
 * Author:   HuangTaiHong
 * Date:     2018/11/26 13:36
 * Description: JAVA视频工厂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.factory_method.factory.impl;

import roberto.group.process.design.patterns.create.factory_method.factory.VideoFactory;
import roberto.group.process.design.patterns.create.factory_method.product.Video;
import roberto.group.process.design.patterns.create.factory_method.product.impl.JavaVideo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈JAVA视频工厂〉
 *
 * @author HuangTaiHong
 * @create 2018/11/26
 * @since 1.0.0
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
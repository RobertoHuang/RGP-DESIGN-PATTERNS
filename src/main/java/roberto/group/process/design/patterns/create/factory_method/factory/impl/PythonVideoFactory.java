/**
 * FileName: PythonVideoFactory
 * Author:   HuangTaiHong
 * Date:     2018/11/26 13:37
 * Description: Python视频工厂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.factory_method.factory.impl;

import roberto.group.process.design.patterns.create.factory_method.factory.VideoFactory;
import roberto.group.process.design.patterns.create.factory_method.product.Video;
import roberto.group.process.design.patterns.create.factory_method.product.impl.PythonVideo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Python视频工厂〉
 *
 * @author HuangTaiHong
 * @create 2018/11/26
 * @since 1.0.0
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
/**
 * FileName: PythonVideo
 * Author:   HuangTaiHong
 * Date:     2018/12/2 16:24
 * Description: Python视频
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.product.impl;

import roberto.group.process.design.patterns.create.abstract_factory.product.Video;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Python视频〉
 *
 * @author HuangTaiHong
 * @create 2018/12/2
 * @since 1.0.0
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
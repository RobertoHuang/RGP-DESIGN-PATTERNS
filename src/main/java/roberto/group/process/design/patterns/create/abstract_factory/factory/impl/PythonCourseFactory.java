/**
 * FileName: PythonCourseFactory
 * Author:   HuangTaiHong
 * Date:     2018/12/2 16:28
 * Description: Python课程工厂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.factory.impl;

import roberto.group.process.design.patterns.create.abstract_factory.factory.CourseFactory;
import roberto.group.process.design.patterns.create.abstract_factory.product.Article;
import roberto.group.process.design.patterns.create.abstract_factory.product.Video;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.PythonArticle;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.PythonVideo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Python课程工厂〉
 *
 * @author HuangTaiHong
 * @create 2018/12/2
 * @since 1.0.0
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
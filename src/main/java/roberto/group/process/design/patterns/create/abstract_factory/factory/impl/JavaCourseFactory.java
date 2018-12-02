/**
 * FileName: JavaCourseFactory
 * Author:   HuangTaiHong
 * Date:     2018/12/2 16:27
 * Description: Java课程工厂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.factory.impl;

import roberto.group.process.design.patterns.create.abstract_factory.factory.CourseFactory;
import roberto.group.process.design.patterns.create.abstract_factory.product.Article;
import roberto.group.process.design.patterns.create.abstract_factory.product.Video;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.JavaArticle;
import roberto.group.process.design.patterns.create.abstract_factory.product.impl.JavaVideo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Java课程工厂〉
 *
 * @author HuangTaiHong
 * @create 2018/12/2
 * @since 1.0.0
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
/**
 * FileName: CourseFactory
 * Author:   HuangTaiHong
 * Date:     2018/12/2 16:21
 * Description: 课程工厂类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.factory;


import roberto.group.process.design.patterns.create.abstract_factory.product.Article;
import roberto.group.process.design.patterns.create.abstract_factory.product.Video;

/**
 * 〈一句话功能简述〉<br> 
 * 〈课程工厂类〉
 *
 * @author HuangTaiHong
 * @create 2018/12/2
 * @since 1.0.0
 */
public interface CourseFactory {
    Video getVideo();

    Article getArticle();
}
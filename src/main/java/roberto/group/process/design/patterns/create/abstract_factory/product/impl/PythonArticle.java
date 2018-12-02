/**
 * FileName: PythonArticle
 * Author:   HuangTaiHong
 * Date:     2018/12/2 16:25
 * Description: Python手记
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.abstract_factory.product.impl;

import roberto.group.process.design.patterns.create.abstract_factory.product.Article;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Python手记〉
 *
 * @author HuangTaiHong
 * @create 2018/12/2
 * @since 1.0.0
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
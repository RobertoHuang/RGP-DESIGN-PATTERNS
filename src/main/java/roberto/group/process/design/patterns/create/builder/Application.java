/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2019/4/18 21:57
 * Description: 测试类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.builder;

/**
 * 〈测试类.〉
 *
 *  适用于:
 *      如果一个对象有非常复杂的内部结构(很多属性)
 *      想把复杂对象的创建和使用分离
 *
 *  优点:
 *      封装性好，创建和使用分离
 *      扩展性好，建造类之间独立，一定程度上解耦
 *
 *  缺点:
 *      产生多余的Builder对象
 *      产品内部发生变化，建造者需要修改，成本较大
 *
 * @author HuangTaiHong
 * @create 2019/4/18
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseArticle("Java设计模式精讲文章")
                .buildCourseVideo("Java设计模式精讲视频").build();
        System.out.println(course);
    }
}
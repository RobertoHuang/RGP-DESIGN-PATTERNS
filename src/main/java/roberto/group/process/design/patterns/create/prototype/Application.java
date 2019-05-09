/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2019/5/9 9:59
 * Description: 测试类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * 〈测试类.〉
 *
 *  原型模式作为一种快速创建大量相同或相似对象的方式
 *  在软件开发中应用比较广泛，很多软件提供的复制Ctrl+C和粘贴Ctrl+V操作就是原型模式典型的应用
 *
 * @author HuangTaiHong
 * @create 2019/5/9
 * @since 1.0.0
 */
@Slf4j
public class Application {
    public static void main(String[] args) {
        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.setUsername("roberto-huang");
        List<String> list = Arrays.asList("test");
        shallowCopy.setList(list);
        ShallowCopy shallowCopyTemp = shallowCopy.clone();
        log.info("是否是同一个对象:{}", shallowCopy == shallowCopyTemp);
        log.info("引用的属性是否是同一个对象:{}", shallowCopy.getList() == shallowCopyTemp.getList());

        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setUsername("roberto-huang");
        List<String> list2 = Arrays.asList("test");
        deepCopy.setList(list2);
        DeepCopy deepCopyTemp = deepCopy.clone();
        log.info("是否是同一个对象:{}", deepCopy == deepCopyTemp);
        log.info("引用的属性是否是同一个对象:{}", deepCopy.getList() == deepCopyTemp.getList());
    }
}
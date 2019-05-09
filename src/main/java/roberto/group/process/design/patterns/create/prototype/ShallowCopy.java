/**
 * FileName: ShallowCopy
 * Author:   HuangTaiHong
 * Date:     2019/5/9 9:56
 * Description: 浅拷贝原型模式.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.prototype;

import lombok.Data;

import java.util.List;

/**
 * 〈浅拷贝原型模式.〉
 *
 * @author HuangTaiHong
 * @create 2019/5/9
 * @since 1.0.0
 */
@Data
public class ShallowCopy implements Cloneable {
    private String username;

    private List<String> list;

    @Override
    protected ShallowCopy clone() {
        ShallowCopy shallowCopy;
        try {
            shallowCopy = (ShallowCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("不支持复制.");
        }
        return shallowCopy;
    }
}
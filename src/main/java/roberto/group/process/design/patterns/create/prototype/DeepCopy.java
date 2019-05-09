/**
 * FileName: DeepCopy
 * Author:   HuangTaiHong
 * Date:     2019/5/9 10:07
 * Description: 深拷贝原型模式.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.prototype;

import lombok.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 * 〈深拷贝原型模式.〉
 *
 * @author HuangTaiHong
 * @create 2019/5/9
 * @since 1.0.0
 */
@Data
public class DeepCopy implements Serializable {
    private String username;

    private List<String> list;

    @Override
    protected DeepCopy clone() {
        try {
            // 将对象写入流中
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            // 将对象从流中取出
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (DeepCopy) objectInputStream.readObject();
        } catch (Exception e) {
            throw new IllegalStateException("不支持复制.");
        }
    }
}
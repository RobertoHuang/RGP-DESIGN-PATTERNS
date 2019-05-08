/**
 * FileName: EnumSingleton
 * Author:   HuangTaiHong
 * Date:     2018/11/25 11:13
 * Description: 枚举单例模式.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.create.singleton;

/**
 * 〈一句话功能简述〉<br> 
 * 〈枚举单例模式.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
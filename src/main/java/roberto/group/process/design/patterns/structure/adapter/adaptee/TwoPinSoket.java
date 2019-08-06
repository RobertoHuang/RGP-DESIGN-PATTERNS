/**
 * FileName: TwoPinSoket
 * Author:   HuangTaiHong
 * Date:     2018/11/25 16:14
 * Description: 两孔插座接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.structure.adapter.adaptee;

/**
 * 〈两孔插座接口.〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
public interface TwoPinSoket {
    int voltage();

    void chargeWithTwoPin();
}
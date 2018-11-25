# 设计模式

设计模式六大原则

- 单一职责原则 - `有且仅有一个原因引起类的变更`
- 里氏替换原则 - `所有引用基类的地方必须能透明地使用其子类对象`
- 依赖倒转原则 - `比较精简的定义就是面向接口编程`
- 接口隔离原则 - `尽量建立单一接口，不要建立臃肿庞大的接口`
- 迪米特法则 - `一个对象应该对其他对象有最少的了解【只和朋友交流，不和陌生人说话】`
- 开闭原则 - `一个软件实体如类、模块和函数应该对对扩展开放对修改关闭，开闭原则也是其他五个原则的基石`



## 行为型模式

- 策略模式

  定义一组算法，将每个算法封装起来并且使它们之间可以相互转换

  ![策略模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F.jpg)

- 观察者模式

  定义对象间一种一对多依赖关系，使得每当一个对象状态发生改变时其相关依赖对象皆得到通知并被自动更新

  ![观察者模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F.jpg)

- 命令模式

  将请求封装成一个对象从而让你使用不同的请求把客户端参数化，可以提命令的撤销和恢复功能

  ![命令模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F.jpg)

## 结构性模式

- 装饰器模式

  动态的给一个对象添加一些额外的职责，就增加功能来说装饰器模式相比生成子类更为灵活

  ![装饰模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F.jpg)

- 适配器模式

  将一个类接口转成客户端期待的另一种接口，从而使本因接口不匹配而无法在一起工作的两个类能在一起工作

  ![适配器模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F.jpg)

- 门面模式

  外观模式提供一个高层次的接口，使得子系统更易于使用

  ![门面模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F.jpg)

## 创建型模式

- 单例模式

  确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例

  ![单例模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.jpg)

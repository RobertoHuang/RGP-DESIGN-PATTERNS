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

  <div align=center><img src="https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F.jpg"/></div>

- 适配器模式

  将一个类接口转成客户端期待的另一种接口，从而使本因接口不匹配而无法在一起工作的两个类能在一起工作

  ![适配器模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F.jpg)

- 门面模式

  外观模式通过引入一个外观角色来简化客户端与子系统之间的交互，使得子系统更易于使用

  ![门面模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F.jpg)

## 创建型模式

- 建造者模式

  将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示【与工厂模式相比建造者模式关注的是产品组装顺序，根据不同的组装顺序可能生产出不同的产品】

<div align=center><img src="https://raw.githubusercontent.com/RobertoHuang/RGP-DESIGN-PATTERNS/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F.jpg"/></div>

- 单例模式

  确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例

  ![单例模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DesignPatterns/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.jpg)

- 原型模式

  作为一种快速创建大量相同或相似对象的方式

  ![原型模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DESIGN-PATTERNS/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F.jpg)

- 工厂方法模式

  定义一个用于创建对象的接口让子类决定实例化哪一个类，工厂方法使一个类的初始化延迟至其子类

  ![工厂方法模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DESIGN-PATTERNS/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.jpg)

- 抽象工厂模式

  为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类【与工厂方法相比针对产品族】

  ![抽象工厂模式](https://raw.githubusercontent.com/RobertoHuang/RGP-DESIGN-PATTERNS/master/%E7%9B%B8%E5%85%B3%E5%9B%BE%E7%89%87/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F.jpg)
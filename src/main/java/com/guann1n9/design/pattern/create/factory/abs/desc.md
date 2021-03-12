# 抽象工厂模式

* 提供一个接口，用于创建相关或依赖的家族<font color=red>（多产品）</font>，而不需要明确指定具体类；


* 多产品（抽象）
```
abstract/interface ProductA

abstract/interface ProductB
```


* 抽象工厂
```
interface Factory 
+ createProductA();
+ createProductB();

```



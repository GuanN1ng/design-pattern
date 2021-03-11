#工厂方法

定义一个创建对象的接口(抽象方法)，让由子类决定实例化哪一个类，工厂方法让类把实例化推迟到子类；


* 产品类
```
abstract class Product //产品的顶层接口，使用时，引用接口而非具体产品类
+field
+method

ConcreteProductA extends Product
```

* 创建者 定义抽象的工厂方法，由子类实现
```
abstract class Creator 
anOperation();//实现所有操作产品的方法
abstract Product factoryMethod(Object arg); //不实现工厂方法，由子类实现


ConcreteCreator extend Creator
Product factoryMethod(Object arg);  //子类实现工厂方法，完成产品实例化
```

### 依赖导致原则
依赖抽象，不要依赖具体类

* 变量不可以持有具体类的引用
* 不要让类派生至具体类
* 不要覆盖类中已实现的方法

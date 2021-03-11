# 装饰者模式

动态的将责任(Decorator)附加到对象(Component)上，对于扩展实现，装饰者提供了比继承更具弹性的方案
* 装饰者与被装饰对象有相同的超类，可用包装过的对象替换原始对象
* 可用一个或多个装饰者包装对象，可在运行时动态的、不限量的添加装饰者
* 装饰者可在被装饰者的行为之前或之后添加自己的行为，实现扩展 

```
interface/adbstract Component  // 组件接口，原始顶层对象，可以单独使用，也可以被包装使用
+double do();

class concreteComponent extend/implemnets Component  //被装饰者
+double do(){
    retuen 1.0;
}


interface/abstract Decorator extend/implemnets Component   //装饰者接口
+double do();


class concreteDecoratorA extend/implemnets Decorator //具体的装饰器，实现或继承装饰者接口，可添加新的状态方法

-Component wrappedComponent;//被装备的对象，通过Constructor或Setter注入

+double do(){
 //do something...
 wrappedComponent.do();
 //do somethinf...
 retuen 
}
```


### JDK
IO

InputStream -> FileInputStream ->BufferedInputStream



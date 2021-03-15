#适配模式
将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类合作无间

```
interface Target //目标接口
+execute()


interface Provide //被提供的接口
+execute() 


class Adapter implements Target //实现目标接口
-Provider provider  //适配器与被适配器组合
+execute(){
    provider.execute();
}
```
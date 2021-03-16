# 模板方法

在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类。模板方法使得子类在不改变算法结构的情况下，重新定义算法中的某些步骤。

```
AbstractClass
+templeteMethod(){  //算法骨架
    operationA();
    operationB();
    hook();  //钩子方法 该步骤在算法中是可选的  
}

abstract void operationA(); //改步骤延迟到子类

void operationB(){  //该步骤超类实现
    //do something  
}

void hook(){}  //默认不做任何事，有子类决定是否覆盖

```


#### hook
```

HashMap 

void afterNodeAccess(Node<K,V> p) { }
void afterNodeInsertion(boolean evict) { }
void afterNodeRemoval(Node<K,V> p) { }
```
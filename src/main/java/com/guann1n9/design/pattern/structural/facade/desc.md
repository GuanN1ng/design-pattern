#外观模式
提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更好的使用。并不会影响系统细粒度的其他接口调用。
  

```

Facade 
-Component1 component1   封装多组件，视为一个系统
-Component2 component2
...
-Componentn componentn

+execute()    //将组件组成系统功能通过简单的接口暴露出去

```



## Least-knowledge 最少知识原则
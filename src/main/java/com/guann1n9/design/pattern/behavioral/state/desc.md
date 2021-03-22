#状态模式
允许对象在内部状态改变时改变他的行为；封装基于状态的行为，使用委托在行为间切换

```
State      //所有具体状态的顶层接口，状态之间可以互相切换
+handle 

Context  //Context类拥有内部状态
+State state  //状态
+request()  --->  state.handle()
```
# 观察者模式

定义了对象之间一(Subject)对多(Observer)依赖，当Subject对象改变状态时，它的所有依赖者都会受到通知并自动更新；
```
Subject<interface>
- List<Observer>   //记录观察者                 
+ registObserver() //注册观察者
+ removeObserver() //移除观察者
+ notifyObserver() //通知观察者状态变化



Observer<interface>
+ update()  //接收并更新
```


### JDK 
* java.util  Observable<------>Observer
* boolean changed 避免浪费，只通知一次

##### 通知方式 
* push
    notifyObservers(this,object);  
* pull
    notifyObservers(this,null);  

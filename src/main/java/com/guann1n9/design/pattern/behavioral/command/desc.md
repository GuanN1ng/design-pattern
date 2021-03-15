# 命令模式

将"请求"封装成对象，以便使用不同的请求、队列或日志来参数化其他对象，也支持可撤销的操作。

* 命令对象将动作和接收者包进对象中，并暴露可执行的方法；
* NotCommand对象，空对象，不执行任何动作
* 可撤销

```
interface Command  命令接口
+execute(); 
+undo();
    

class Receiver  //命令接收者，动作执行
+action()


class concreteComand implements Command
-Receiver receiver  //命令对象持有接收者
+execute(){
  receiver.action();
}

Client  //负责生产命令


Invoker //调用 
+Command[] list


```
#代理模式
为其他对象提供一种代理以控制对这个对象的访问

```
interface Subject
+request()



RealSubject implements Subject
+request()


Proxy implements Subject
+Subject subject //Proxy持有真正对象的引用，控制对象的访问
+request()  
 

```


* RMI  远程代理
* JDK Proxy 动态代理

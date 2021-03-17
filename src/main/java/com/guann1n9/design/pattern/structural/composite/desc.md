#组合模式
允许你将对象组合成树形结构来表现"整体/部分"的层次结构。组合能让客户以一致的方式处理个别对象以及对象组合

```
//组合中所有对象的共同接口，无论是组合还是叶子节点，组合内所有元素的共同接口，使客户可以一致的操作组合内的所有对象
abstract Component  
+operation();      
+add(Component);
+remove(Component);
+iterator(); 



class Composite extend Component //具有子节点，实现子节点的相关操作
+operation();   
+add(Component);
+remove(Component);
+iterator();


class Leaf extend Component  //叶子节点，实现Composite支持的操作，定义了组合内的元素行为
+operation();  
```
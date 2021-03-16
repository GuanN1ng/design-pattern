#迭代器
提供一种方法顺序访问一个聚合对象中的各个元素，而又不需要暴露该对象的内部表示。

```
interface Iterator{
+boolean hasnNext()
+E next()
+void remove()
}

```

#### java.util.Iterator

#### java.util.ListIterator
An iterator for lists that allows the programmer to traverse the list in either direction
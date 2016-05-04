
#java设计模式七（装饰模式）

还是设计一个应用场景来理解，模拟程序里有一个已知功能是这样的：

有一个宠物对象Pet，实现了Animal接口，它会卖萌cute;
现在，我们对宠物的卖萌功能进行扩展。让它在卖萌完后给大家说一句。

使用装饰模式怎么实现该功能？
1、新建Cat对象同样实现Animal接口；
2、Cat对象持有Animal类型对象，Cat调用Animal类型卖萌方法，然后再扩展“给大家说一句”的功能；

客户端修改调用代码
Pet pet = new Pet();
pet.cute();
修改为
Pet pet = new Pet();
Animal cat = new Cat(pet);
cat.cute();

使用装饰模式，在不修改原有Pet对象的基础上，动态的扩展了其功能。




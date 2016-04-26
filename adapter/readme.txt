
#java设计模式六（适配器模式）

模式所涉及的角色有：

●　　目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类。
●　　源(Adapee)角色：现在需要适配的接口。
●　　适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体


设计一个应用场景来理解适配器模式，我们程序里有一个已知功能是这样的：
首先，有一个宠物对象Pet，它有一项技能为卖萌cute;
现在，客户要求我们对宠物功能进行扩展。要求宠物会捉老鼠，怎么做呢？

第一种方式（类适配模式）
1、将Pet原有的技能cute抽象到Animal接口，Animal接口增加捉老鼠方法
2、新建Cat对象继承Pet并实现Animal，这个时候Cat拥有了卖萌技能、只要实现捉老鼠技能就OK了。
		  
客户端只需要将原来的代码
Pet pet = new Pet();
pet.cute();
修改为
Animal pet = new Cat();
animail.cute();
animail.catchMouse();
就Ok了
		  
适配过程中各对象承担的角色如下
目标(Target)角色：Animal
 源(Adapee)角色：Pet
适配器(Adaper)角色：Cat

第二种方式（对象适配模式）
1、还是抽象Animal接口，包含卖萌和捉老鼠两个方法
2、新建Dog对象实现Animal接口，并持有Pet对象
3、实现卖萌接口，调用Pet实现

客户端代码实现
Pet pet = new Pet();
pet.cute();
修改为
Pet pet = new Pet();
Animal animal = new Dog(pet);
animal.cute();
animal.catchMouse();
就Ok了

适配过程中各对象承担的角色如下
目标(Target)角色：Animal
 源(Adapee)角色：Pet
适配器(Adaper)角色：Dog





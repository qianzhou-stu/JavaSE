/*
	编程实现Person类的定义
*/

public class Person{
	// 数据类型  成员变量名 = 初始值; 其中初始值通常可以省略不写
	String name; // 用于描述姓名的成员变量
	int age; // 用于描述年龄的成员变量
	
	// 自定义成员方法实现所有成员变量的打印
	// 返回值类型  方法名称（形参列表）{方法体;}
	public void show(){
		System.out.println("我是" + this.name + ".今年" + this.age + "岁了！"); // this指向的是当前调用的对象
	}
	
	// 自定义成员方法实现将姓名修改为参数指定数值的行为
	// String s = "guanyu";
	public void setName(String name){
		this.name = name;
	}
	
	// 自定义成员方法实现将年龄修改为参数指定数值的行为
	public void setAge(int age){
		this.age = age;
	}
	
	// 自定义成员方法实现将姓名和年龄修改为参数指定数值的行为  下面的方法不推荐使用
	public void setNameAge(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// 自定义成员方法实现可变长参数的使用  看作一维数组使用即可  0 ~ n个
	public void showArgument(int num, String... args){
		System.out.println("num = " + num);
		for(int i = 0; i < args.length; i++){
			System.out.println("第" + (i+1) + "个参数为：" + args[i]);
		}
	}
	
	// 自定义成员方法实现姓名数值的获取并返回的行为
	public String getName(){
		return this.name;
	}
	
	// 自定义成员方法实现年龄数值的获取并返回的行为
	public int getAge(){
		return this.age;
	}
	public static void main(String[] args){
		// 1.声明Person类型的引用指向Person类型的对象
		// 数据类型(类名) 引用变量名 = new 类名();
		Person p = new Person();
		// 2.打印对象中的成员变量值
		// 引用变量名.成员变量名
		System.out.println("我是" + p.name + ".今年" + p.age + "岁了！");
		// 引用变量名.成员方法名(实参列表);
		// 调用方法的本质就是根据方法名跳转过去执行方法体后再跳转回这个位置
		p.show();
		
		
		System.out.println("-----------------------------------------------------");
		// 3.修改成员变量的数值
		p.name = "zhangfei";
		p.age = 30;
		// 4. 再次打印修改后的数值
		//System.out.println("我是" + p.name + "，今年" + p.age + "岁了！"); // zhangfei 30
		p.show();
		
		System.out.println("-----------------------------------------------------");
		// 5. 通过成员方法的调用实现成员变量的修改
		p.setName("guanyu");
		p.setAge(35);
		p.show(); // guanyu  35
		
		System.out.println("-----------------------------------------------------");
		// 6.通过成员方法同时修改姓名和年龄
		//p.setNameAge("liubei", 40);
		int ia = 40;
		p.setNameAge("liu"+"bei", ia);
		p.show(); // liubei 40
		
		System.out.println("-----------------------------------------------------");
		// 7.通过成员方法实现可变长参数的打印
		p.showArgument(0);
		System.out.println("-----------------------------------------------------");
		p.showArgument(1, "参数1");
		System.out.println("-----------------------------------------------------");
		p.showArgument(2, "参数1", "参数2");
		
		System.out.println("-----------------------------------------------------");
		// 8.通过成员方法的调用实现成员变量数值的获取并打印
		String str1 = p.getName();
		System.out.println("获取到的性名是：" + str1);
		int ib = p.getAge();
		System.out.println("获取到的年龄是：" + ib);
	}
}




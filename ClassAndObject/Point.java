/*
	编程实现point类的定义
*/

public class Point{
	int x; // 用于描述横坐标的成员变量
	int y; // 用于描述纵坐标的成员变量
	
	// 自定义成员方法实现成员变量数值的打印操作
	void show(){
		System.out.println("横坐标是：" + this.x + ".纵坐标是：" + this.y);
	}
	
	// 自定义成员方法实现将横坐标修改为参数指定数值的行为
	// int i = 10;
	public void setX(int x){
		this.x = x;
	}
	// 自定义成员方法实现将纵坐标修改为参数指定数值的行为
	// int j = 20;
	public void setY(int y){
		this.y = y;
	}
	
	// 自定成员方法实现int类型的可变长参数的使用
	public void	showArgument(int ... args){
		for (int i = 0; i < args.length; i ++){
			System.out.println("下标为" + i + "的元素是：" + args[i]);
		}
	}
	
	// 自定义成员方法实现获取横坐标数值并返回的行为
	public int getX(){
		return this.x;
	}
	
	// 自定义成员方法实现获取纵坐标数值并返回的行为
	public int getY(){
		return this.y;
	}
	
	public static void main(String[] args){
		// 声明Point类型的引用指向Point类型的对象
		Point p = new Point();
		// 打印成员变量的数值
		System.out.println("横坐标是：" + p.x + "，纵坐标是：" + p.y); // 0 0
		p.show();
		
		// 2.将横纵坐标修改为3和5后再次打印
		p.x = 3;
		p.y = 5;
		System.out.println("横坐标是：" + p.x + "，纵坐标是：" + p.y); // 0 0
		p.show();
		
		System.out.println("-----------------------------------------------");
		// 3.通过调用成员方法实现横纵坐标的修改
		p.setX(10);
		p.setY(20);
		p.show(); // 10 20
		
		System.out.println("-----------------------------------------------");
		// 4.通过成员方法实现可变长参数的使用
		p.showArgument(1, 2, 3, 4, 5);
		System.out.println("-----------------------------------------------");
		// 5.通过成员方法调用实现横纵坐标的获取
		int ia = p.getX();
		System.out.println("获取到的横坐标是：" + ia); // 10
		int ib = p.getY();
		System.out.println("获取到的横坐标是: " + ib); // 20
		
	}
}
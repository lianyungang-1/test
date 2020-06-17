
public class Mystack {
	private Object[] obj;
	private int index = -1;
	
	public void setObj(Object[] obj) {
		this.obj = obj;
	}
	public Object[] getObj() {
		return obj;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
	
	public Mystack() {
		obj = new Object[10];
	}
	
	public void push(Object o) throws Exception {
		if (index >= obj.length - 1) {
//			System.out.println("栈已满，压栈失败。");
//			return;
			Exception e = new MyException("栈已满，压栈失败。");
			throw e;
		}
		index++;
		obj[index] = o;
		System.out.println("压栈"+ o +"元素成功，此时栈帧指向"+index);
	}
	
	public void pop() throws Exception {
		if (index < 0) {
//			System.out.println("栈已空，弹栈失败。");
//			return;
			Exception e = new MyException("栈已空，弹栈失败。");
			throw e;
		}
		System.out.print("弹栈" + obj[index] +"元素成功");
		index--;
		System.out.println("栈帧指向"+index);
		

	}
}

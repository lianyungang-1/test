
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
//			System.out.println("ջ������ѹջʧ�ܡ�");
//			return;
			Exception e = new MyException("ջ������ѹջʧ�ܡ�");
			throw e;
		}
		index++;
		obj[index] = o;
		System.out.println("ѹջ"+ o +"Ԫ�سɹ�����ʱջָ֡��"+index);
	}
	
	public void pop() throws Exception {
		if (index < 0) {
//			System.out.println("ջ�ѿգ���ջʧ�ܡ�");
//			return;
			Exception e = new MyException("ջ�ѿգ���ջʧ�ܡ�");
			throw e;
		}
		System.out.print("��ջ" + obj[index] +"Ԫ�سɹ�");
		index--;
		System.out.println("ջָ֡��"+index);
		

	}
}

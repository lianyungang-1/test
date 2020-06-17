public class Test {

	public static void main(String[] args) {
		Mystack my = new Mystack();
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
//		my.push(new Object());
		try {
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
			my.push(new Object());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		
		try {
			my.pop();
			my.pop();
			my.pop();
			my.pop();
			my.pop();
			my.pop();
			my.pop();
			my.pop();
			my.pop();
			my.pop();
			my.pop();
			my.pop();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
//		my.pop();
//		my.pop();
//		my.pop();
//		my.pop();
//		my.pop();
//		my.pop();
//		my.pop();
//		my.pop();
//		my.pop();
//		my.pop();
//		my.pop();

	}

}

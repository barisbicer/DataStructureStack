
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dstack nums=new Dstack();
	    //System.out.println("isEmpty:"+nums.isEmpty());
		nums.push(15);
		nums.show();
		nums.push(16);
		nums.show();
		nums.push(17);
		nums.show();
		
		//System.out.println("peek:"+nums.peek());
		//System.out.print(nums.pop());
		nums.push(10);
		nums.show();
		nums.push(20);
		nums.show();
		nums.push(30);
		nums.show();
		nums.push(40);
		nums.show();
		nums.push(50);
		nums.show();
		nums.push(60);
		nums.show();
	    //System.out.println("size:"+nums.size());
	    
	    //System.out.println("isEmpty:"+nums.isEmpty());
		
	
		
		//System.out.println("peek:"+nums.peek());
		System.out.println(nums.pop());
		nums.show();
		System.out.println(nums.pop());
		nums.show();
		System.out.println(nums.pop());
		nums.show();
		System.out.println(nums.pop());
		nums.show();
		System.out.println(nums.pop());
		nums.show();
		
		//System.out.println("size:"+nums.size());
		
		
	   
	}
}


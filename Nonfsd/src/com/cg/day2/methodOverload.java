

package com.cg.day2;

public class methodOverload {
	public int add(int n1,int n2) {
		int result;
		result=n1+n2;
		return result;
	}
	public int add(int n1,int n2,int n3) {
		int res;
		res=n1+n2+n3;
		return res;
	}


	public static void main(String[] args) {
	
		methodOverload obj=new methodOverload();
		//obj.add(5, 7);
		//obj.add(6,9,8);
		System.out.println(obj.add(5, 7));
		System.out.println(obj.add(6, 7, 9));
		
		
	
	}
}




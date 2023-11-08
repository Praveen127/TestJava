package myjavaproj;

public class Test4 {
	
	String sname;
	int id;
	int marks;
	
	void insert(int id,String s,int m) {
		this.id=id;
		sname = s;
		marks = m;
	}
	void display() {
		System.out.println(id+" "+sname+" "+marks);
	}
	
	public static void main(String[] args) {
		Test4 t =new Test4();
		Test4 t1 =new Test4();
		Test4 t2 =new Test4();
		t.insert(101, "Achyuth", 49);
		t1.insert(102, "Nani", 46);
		t2.insert(103, "Reddy", 50);
		t.display();
		t1.display();
		t2.display();
		
	}

}

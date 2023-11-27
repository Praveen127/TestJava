package myjavaproj;

class CloneTest implements Cloneable {

	String name;
	int rollno;

	CloneTest(String n, int r) {
		name = n;
		rollno = r;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a++;
		a--;
		++a;
		--a;
		try {
			CloneTest t1 = new CloneTest("Achyuth", 100);
			CloneTest t2 = (CloneTest) t1.clone();
			System.out.println(t1.rollno + " " + t1.name);
			System.out.println(t2.rollno + " " + t2.name);
		} catch (CloneNotSupportedException c) {}
		int i=225;
		int sum = 0;
		while(i>0) {
			sum = sum + i%10;
			int r=i%10;
			i=i/10;
		}
		System.out.println(sum);
		
	}

}

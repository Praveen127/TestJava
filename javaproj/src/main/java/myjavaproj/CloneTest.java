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
		try {
			CloneTest t1 = new CloneTest("Achyuth", 100);
			CloneTest t2 = (CloneTest) t1.clone();
			System.out.println(t1.rollno + " " + t1.name);
			System.out.println(t2.rollno + " " + t2.name);
		} catch (CloneNotSupportedException c) {

		}

	}

}

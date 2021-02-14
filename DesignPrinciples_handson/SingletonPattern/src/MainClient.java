
public class MainClient {

	public static void main(String[] args) {
		DBConn obj1=DBConn.getInstance();
		System.out.println(obj1.hashCode());
		DBConn obj2=DBConn.getInstance();
		System.out.println(obj2.hashCode());
	}
}

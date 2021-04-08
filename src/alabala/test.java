package alabala;

public class test {
	
	static boolean checkMirror(String checkStr) {
		int k=checkStr.length()% 2;
		if (k!=0) {
			System.out.println("The string"+checkStr +" is not mirror. The size is no event!");
			return false;
		}
		String reverse = new StringBuffer(checkStr).reverse().toString();
		System.out.println(reverse);
		if (reverse.compareTo(checkStr)==0) {
			System.out.println("The string:"+checkStr +" is equal of reverse string:"+reverse);
			System.out.println("The string:"+checkStr +" is mirror");
			return true;
		}
		else {
			System.out.println("The string:"+checkStr +" is not mirror");
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strExam1 = "1234321";
		checkMirror("1234321");
		int i=0;
		System.out.println("============================"+i+++"=============================");
		checkMirror("1234321");
		System.out.println("============================"+i+++"=============================");
		checkMirror("123321");
		System.out.println("============================"+i+++"=============================");
		checkMirror("alaala");
		System.out.println("============================"+i+++"=============================");
		checkMirror("ivoovi");
		System.out.println("============================"+i+++"=============================");
		checkMirror("ivo1ovi");
		System.out.println("============================"+i+++"=============================");
		checkMirror("ivoivo");
		System.out.println("============================"+i+++"=============================");
		checkMirror("geryyreg");
		System.out.println("============================"+i+++"=============================");
		checkMirror("hary yrah");
		System.out.println("============================"+i+++"=============================");
		checkMirror("aabbbbaa");
		System.out.println("============================"+i+++"=============================");
		checkMirror("aaaaaaaa");
		System.out.println("============================"+i+++"=============================");
		checkMirror("aaaaaaaaa");
		System.out.println("============================"+i+++"=============================");
		checkMirror("alabala");
		System.out.println("============================"+i+++"=============================");
		checkMirror("112233445566665544332211");
	}

}

package ch1.t04;

//本类模拟成一个Servlet组件
class LoginServlet {

	private static String usernameRef;
	private static String passwordRef;

	synchronized static void doPost(String username, String password) {
		try {
			usernameRef = username;
			if (username.equals("a")) {
				Thread.sleep(2000);
			}
			passwordRef = password;

			System.out.println("username=" + usernameRef + " password=" + passwordRef);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

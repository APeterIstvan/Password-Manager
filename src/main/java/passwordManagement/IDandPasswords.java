package passwordManagement;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPasswords(){
			
		loginInfo.put("AlreadyTaken", "Password");
		loginInfo.put("Pityu", "M�zli");
		loginInfo.put("CoolUsername", "FunPassword123");
		
	}
	
	protected HashMap<String, String> getLoginInfo() {
		return loginInfo;
	}
	
}

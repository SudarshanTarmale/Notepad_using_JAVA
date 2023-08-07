import java.util.*;

public class IDandPasswords {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPasswords() {
        loginInfo.put("Admin", "Admin@123");
        loginInfo.put("Gunjan", "312002");
        loginInfo.put("Ishan", "312018");
        loginInfo.put("Sudarshan", "312056");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}

package user.tracker;

import android.text.TextUtils;

class AppUtils {
    public static boolean isEmailValid(String email) {
        if (TextUtils.isEmpty(email))
            return false;
        else
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public static boolean isPasswordValid(String password) {
        return password.length() > 4;
    }
}
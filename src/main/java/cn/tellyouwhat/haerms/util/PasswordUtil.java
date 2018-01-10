package cn.tellyouwhat.haerms.util;

/**
 * Created by Harbor-Laptop on 2017/10/7.
 *
 * @author HarborZeng
 * @version 1.0
 */
public class PasswordUtil {
    /**
     * 判断密码是否符合安全性要求：密码应至少包含数字、字母和符号中的两种，且长度6-18位
     * @param password 密码
     * @return true符合，false otherwise
     */
    public static boolean isLegalPassword(String password){
        return password.matches("(?!^[0-9]+$)(?!^[A-z]+$)(?!^[^A-z0-9]+$)^.{6,18}$");
    }

    /**
     * 判断密码是否符合安全性要求：密码应至少包含数字、字母和符号中的两种，且长度6-18位
     * @param password 密码
     * @return true符合，false otherwise
     */
    public static boolean isIllegalPassword(String password){
        return !isLegalPassword(password);
    }
}

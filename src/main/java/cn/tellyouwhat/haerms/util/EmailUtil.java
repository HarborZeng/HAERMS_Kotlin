package cn.tellyouwhat.haerms.util;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Harbor-Laptop on 2017/10/5.
 *
 * @author HarborZeng
 * @version 1.0
 */
public class EmailUtil {

    /**
     * 验证邮箱是否合法
     * Email的规则: name@domain
     * name最长64，domain最长253，总长最长256
     * name可以使用任意ASCII字符:
     * 大小写英文字母 a-z,A-Z
     * 数字 0-9
     * 字符 !#$%&'*+-/=?^_`{|}~
     * 字符 .不能是第一个和最后一个，不能连续出现两次
     * 但是有些邮件服务器会拒绝包含有特殊字符的邮件地址
     * domain仅限于26个英文字母、10个数字、连词号-
     * 连词号-不能是第一个字符
     * 顶级域名（com、cn等）长度为2到6个
     * @param email 邮箱
     * @return true合法，false otherwise
     */
    @Contract("null -> fail")
    public static boolean isValidEmail(String email){
        if (email == null) {
            throw new NullPointerException("email是null的，笨蛋！");
        }
        return email.matches(
                "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
    }

    /**
     * 验证邮箱是否非法
     * Email的规则: name@domain
     * name最长64，domain最长253，总长最长256
     * name可以使用任意ASCII字符:
     * 大小写英文字母 a-z,A-Z
     * 数字 0-9
     * 字符 !#$%&'*+-/=?^_`{|}~
     * 字符 .不能是第一个和最后一个，不能连续出现两次
     * 但是有些邮件服务器会拒绝包含有特殊字符的邮件地址
     * domain仅限于26个英文字母、10个数字、连词号-
     * 连词号-不能是第一个字符
     * 顶级域名（com、cn等）长度为2到6个
     * @param email 邮箱
     * @return true非法，false otherwise
     */
    @Contract("null -> fail")
    public static boolean isInvalidEmail(String email){
        return !isValidEmail(email);
    }

    /**
     * 获得email的名字
     * @param email email地址
     * @return email的名字
     */
    @NotNull
    @Contract("null -> fail")
    public static String getEmailName(String email){
        if (email == null) {
            throw new NullPointerException("email是null的，笨蛋！");
        }
        return email.substring(0, email.indexOf("@"));
    }

    /**
     * 获得email的domain
     * @param email email地址
     * @return email的domain
     */
    @NotNull
    @Contract("null -> fail")
    public static String getEmailDomain(String email){
        if (email == null) {
            throw new NullPointerException("email是null的，笨蛋！");
        }
        return email.substring(email.indexOf("@")+1, email.length());
    }
}

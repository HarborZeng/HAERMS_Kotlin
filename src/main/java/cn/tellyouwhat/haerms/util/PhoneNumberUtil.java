package cn.tellyouwhat.haerms.util;

import org.jetbrains.annotations.Contract;

/**
 * Created by Harbor-Laptop on 2017/10/5.
 * 一些小功能的封装，如验证是否是手机号，是否是移动的、联通的、电信的手机号
 * @author HarborZeng
 * @version 1.0
 */
public class PhoneNumberUtil {
    /**
     * 中国移动:
     * 139、138、137、136、135、134（0-8）、159、158、157、150、151、152、147（数据卡）、
     * 188、187、182、183、184、178、1703、1705、1706、198、148、1440
     * 移动网络制式: 2G：GSM；3G：TD-SCDMA；4G：TDD-LTE
     *
     * @param number 要查询的手机号码
     * @return true是移动手机号，false otherwise
     */
    @Contract("null -> fail")
    public static boolean isValidMobileNumber(String number){
        if (number == null) {
            throw new NullPointerException("输入的电话号码为null");
        }
        return number.matches("^1(3[4-9]|4[7]|5[0-27-9]|7[08]|8[23478])\\d{8}$");
    }

    /**
     * 中国联通:
     * 130、131、132、156、155、186、185、145（数据卡）、176、175、1707、1708、1709 、166、146
     * 联通网络制式: 2G：GSM；3G：WCDMA；4G：FDD-LTE和TDD-LTE
     *
     * @param number 要查询的手机号码
     * @return true是联通手机号，false otherwise
     */
    @Contract("null -> fail")
    public static boolean isValidUnicefNumber(String number){
        if (number == null) {
            throw new NullPointerException("输入的电话号码为null");
        }
        return number.matches("^1(3[012]|4[5]|5[56]|7[1568]|8[56])\\d{8}$");
    }

    /**
     * 中国电信:
     * 133、1349、153、189、180、181、177、173、149、1700、1701、1702、199、1410
     * 电信网络制式: 2G：CDMA；3G：CDMA2000；4G：FDD-LTE和TDD-LTE
     *
     * @param number 要查询的手机号码
     * @return true是电信手机号，false otherwise
     */
    @Contract("null -> fail")
    public static boolean isValidTelecomsNumber(String number){
        if (number == null) {
            throw new NullPointerException("输入的电话号码为null");
        }
        return number.matches("^1(3[3]|4[9]|53|7[037]|8[019])\\d{8}$");
    }

    /**
     * 手机号码:
     * 13[0-9], 14[5,7,9], 15[0, 1, 2, 3, 5, 6, 7, 8, 9], 17[0,, 8], 18[0-9]
     * 移动号段: 134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
     * 联通号段: 130,131,132,145,155,156,170,171,175,176,185,186
     * 电信号段: 133,149,153,170,173,177,180,181,189
     * 虛拟运营商: 1700、1705、1707、1708、1709......代理联通移动电信业务
     *
     * @param number 要查询的手机号码
     * @return true是手机号码，false otherwise
     */
    public static boolean isValidPhoneNumber(String number){
        return isValidMobileNumber(number)||
                isValidUnicefNumber(number)||
                isValidTelecomsNumber(number);
    }

    /**
     * 手机号码:
     * 13[0-9], 14[5,7], 15[0, 1, 2, 3, 5, 6, 7, 8, 9], 17[0, 1, 6, 7, 8], 18[0-9]
     * 移动号段: 134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
     * 联通号段: 130,131,132,145,155,156,170,171,175,176,185,186
     * 电信号段: 133,149,153,170,173,177,180,181,189
     * 虛拟运营商: 1700、1705、1707、1708、1709......代理联通移动电信业务
     *
     * @param number 要查询的手机号码
     * @return true不是手机号码，false otherwise
     */
    public static boolean isInvalidPhoneNumber(String number){
        return !isValidPhoneNumber(number);
    }
}

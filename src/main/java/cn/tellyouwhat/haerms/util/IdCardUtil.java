package cn.tellyouwhat.haerms.util;

import org.jetbrains.annotations.Contract;

/**
 * Created by Harbor-Laptop on 2017/10/5.
 *
 * @author HarborZeng
 * @version 1.0
 */
public class IdCardUtil {

    /**
     * 1-2位省、自治区、直辖市代码；
     * 3-4位地级市、盟、自治州代码；
     * 5-6位县、县级市、区代码；
     * 7-14位出生年月日，比如19670401代表1967年4月1日；
     * 15-17位为顺序号，其中17位男为单数，女为双数；
     * 18位为校验码，0-9和X，由公式随机产生；
     *
     * 将身份证号码前面的17位数分别乘以不同的系数；
     * 从第一位到第十七位的系数分别为：7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2
     * 将这17位数字和系数相乘的结果相加；
     * 用加出来和除以11，看余数是多少；
     * 余数只可能有0－1－2－3－4－5－6－7－8－9－10这11个数字；
     * 其分别对应的最后一位身份证的号码为1－0－X－9－8－7－6－5－4－3－2
     * 通过上面得知如果余数是2，就会在身份证的第18位数字上出现罗马数字的Ⅹ。如果余数是10，身份证的最后一位号码就是2。
     *
     * @param idNumber 要验证的身份证号码
     * @return true合法的身份证号码 false otherwise
     */
    @Contract("null -> fail")
    public static boolean isValidIdCardNumber(String idNumber) {
        if (idNumber == null) {
            throw new NullPointerException("身份证号码是null的，笨蛋！");
        }
        if (idNumber.matches("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|[xX])$")) {
            idNumber = idNumber.toUpperCase();

            int[] coefficient = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
            char[] lastChar = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};

            int sum = 0;
            for (int i = 0; i < 17; i++) {
                sum += Integer.valueOf(idNumber.substring(i, i+1)) * coefficient[i];
            }

            if (idNumber.charAt(17) == (lastChar[sum % 11])) {
                return true;
            }
        }
        return false;
    }

    /**
     * 1-2位省、自治区、直辖市代码；
     * 3-4位地级市、盟、自治州代码；
     * 5-6位县、县级市、区代码；
     * 7-14位出生年月日，比如19670401代表1967年4月1日；
     * 15-17位为顺序号，其中17位男为单数，女为双数；
     * 18位为校验码，0-9和X，由公式随机产生；
     *
     * 将身份证号码前面的17位数分别乘以不同的系数；
     * 从第一位到第十七位的系数分别为：7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2
     * 将这17位数字和系数相乘的结果相加；
     * 用加出来和除以11，看余数是多少；
     * 余数只可能有0－1－2－3－4－5－6－7－8－9－10这11个数字；
     * 其分别对应的最后一位身份证的号码为1－0－X－9－8－7－6－5－4－3－2
     * 通过上面得知如果余数是2，就会在身份证的第18位数字上出现罗马数字的Ⅹ。如果余数是10，身份证的最后一位号码就是2。
     *
     * @param idNumber 要验证的身份证号码
     * @return true非法的身份证号码 false otherwise
     */
    @Contract("null -> fail")
    public static boolean isInvalidIdCardNumber(String idNumber){
        return !isValidIdCardNumber(idNumber);
    }
}
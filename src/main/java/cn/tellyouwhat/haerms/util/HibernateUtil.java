package cn.tellyouwhat.haerms.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 完成Hibernate工具类
 * 封装配置文件读取操作
 * 封装SessionFactory创建操作
 * 封装session获得操作
 * @author HarborZeng
 */
public class HibernateUtil {

    private static SessionFactory factory;

    static {
        //1加载配置
        Configuration conf = new Configuration().configure();
        //2 根据Configuration 配置信息创建 SessionFactory
        factory = conf.buildSessionFactory();
        //3 关闭factory连接
        Runtime.getRuntime().addShutdownHook(new Thread(
                () -> factory.close()
        ));
    }

    public static Session openSession() {
        return factory.openSession();
    }

    public static Session getCurrentSession() {
        //3 获得session
        return factory.getCurrentSession();
    }
}

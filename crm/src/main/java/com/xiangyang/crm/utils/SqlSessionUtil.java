package com.xiangyang.crm.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private SqlSessionUtil(){}
    private static SqlSessionFactory factory;
    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static ThreadLocal<SqlSession> t = new ThreadLocal<SqlSession>();
    public static SqlSession getSession(){
        SqlSession session = t.get();
        if (session == null){
            session = factory.openSession();
            t.set(session);
        }
        return session;
    }
    public static void close(SqlSession session){
        session.close();
        t.remove();
    }
}
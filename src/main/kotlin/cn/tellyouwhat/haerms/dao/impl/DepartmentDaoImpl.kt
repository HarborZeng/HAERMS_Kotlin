package cn.tellyouwhat.haerms.dao.impl

import cn.tellyouwhat.haerms.dao.IDepartmentDao
import cn.tellyouwhat.haerms.util.HibernateUtil

class DepartmentDaoImpl : IDepartmentDao {
    override fun selectAllDepartments(): MutableList<Any?>? {
        val session = HibernateUtil.openSession()
        session.beginTransaction()

        val query = session.createQuery("from DepartmentEntity")
        val list = query.resultList
        session.transaction.commit()
        session.close()
        return list
    }
}
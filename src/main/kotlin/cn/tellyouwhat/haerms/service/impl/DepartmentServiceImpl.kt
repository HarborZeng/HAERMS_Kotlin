package cn.tellyouwhat.haerms.service.impl

import cn.tellyouwhat.haerms.dao.IDepartmentDao
import cn.tellyouwhat.haerms.dao.impl.DepartmentDaoImpl
import cn.tellyouwhat.haerms.service.IDepartmentService

class DepartmentServiceImpl : IDepartmentService {
    private val departmentDao: IDepartmentDao = DepartmentDaoImpl()

    override fun getAllDepartments(): MutableList<Any?>? {
        return departmentDao.selectAllDepartments()
    }
}
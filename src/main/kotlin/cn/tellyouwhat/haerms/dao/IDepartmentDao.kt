package cn.tellyouwhat.haerms.dao

interface IDepartmentDao {
    fun selectAllDepartments(): MutableList<Any?>?
}
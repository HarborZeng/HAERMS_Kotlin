package cn.tellyouwhat.haerms.web.action

import cn.tellyouwhat.haerms.service.impl.DepartmentServiceImpl
import com.opensymphony.xwork2.ActionSupport
import org.apache.struts2.ServletActionContext

class DepartmentActions : ActionSupport() {

    fun fetchAllDepartment(): String {
        val departmentService = DepartmentServiceImpl()
        val allDepartments = departmentService.getAllDepartments()

        ServletActionContext.getRequest().setAttribute("AllDepartments", allDepartments)
        return NONE
    }
}
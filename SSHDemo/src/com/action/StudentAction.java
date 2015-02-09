package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.iservices.IStudentServices;
import com.pojos.Student;

public class StudentAction extends DispatchAction {
	IStudentServices istudentServices;

	public void setIstudentServices(IStudentServices istudentServices) {
		this.istudentServices = istudentServices;
	}

	/**
	 * 查询所有学生信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward getQueryAll(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Student> list = istudentServices.queryList();
		for (Student stu : list) {
			System.out.println(stu.getSno());
			System.out.println(stu.getSname());
			System.out.println(stu.getSsex());
			System.out.println(stu.getClassname());
		}
		return null;
	}
}

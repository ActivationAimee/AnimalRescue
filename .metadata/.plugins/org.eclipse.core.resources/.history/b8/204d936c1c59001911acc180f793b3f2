package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.MemberDAO;

public class IdCheckAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = (String)request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		int res = 0;
		res = dao.checkId(id);
		request.setAttribute("res", res);
		request.setAttribute("id", id);
		ActionForward af = new ActionForward("member_reg/mem_registerForm.jsp", false);
		return af;
	}

}

package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.ActionForward;
import vo.Member;
import vo.MemberDAO;

public class LoginIdAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		int res = 0;
		ActionForward af = null;
		
		MemberDAO dao = new MemberDAO();
		Member member = null;
		member = dao.memberLoginCheck(id, pass);
		if(member == null) {
			res = 1;
			request.setAttribute("res", res);
			af = new ActionForward("member_login/mem_loginForm.jsp", false); 
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			af = new ActionForward("member_login/login_success.jsp", false);
		}
		
		return af;
	}

}

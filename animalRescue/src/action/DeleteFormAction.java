package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Member;
import vo.MemberDAO;

public class DeleteFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		Member member = new Member();
		
		member = dao.memberSearchPass(id);
		
		request.setAttribute("member", member);
		ActionForward af = new ActionForward("member_login/mem_deleteForm.jsp", false);
		return af;
	}

}

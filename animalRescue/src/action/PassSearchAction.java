package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Member;
import vo.MemberDAO;

public class PassSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		int res = 0;
		
		MemberDAO dao = new MemberDAO();
		Member member = null;
		
		member = dao.memberSearchPass(id);
		
		if(member == null) {
			res = 1;
		}else {
			res = 0;
		}
		
		request.setAttribute("res", res);
		request.setAttribute("member", member);
		ActionForward af = new ActionForward("member_login/mem_searchPass.jsp", false);
		
		return af;
	}

}

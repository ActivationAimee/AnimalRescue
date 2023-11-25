package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Member;
import vo.MemberDAO;

public class IdSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String idnumber1 = request.getParameter("idnumber1");
		String idnumber2 = request.getParameter("idnumber2");
		
		String idnumber = idnumber1+idnumber2;
		int res = 0;
		MemberDAO dao = new MemberDAO();
		Member member = null;
		member = dao.memberSearchId(idnumber);
		
		if(member == null) {
			res = 1;
		}else {
			res = 0;
		}
		
		request.setAttribute("res", res);
		request.setAttribute("member", member);
		ActionForward af = new ActionForward("member_login/mem_searchId.jsp", false);
		return af;
	}

}

package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.ActionForward;
import vo.MemberDAO;

public class DeleteId implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		session.invalidate();
		
		MemberDAO dao = new MemberDAO();
		dao.removeMember(id);
		
		ActionForward af = new ActionForward("/main/mainForm.jsp", false);
		return af;
	}

}

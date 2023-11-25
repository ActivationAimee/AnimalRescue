package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.SupportDAO;

public class SupportDeleteAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SupportDAO dao = new SupportDAO();
		int snum = Integer.parseInt(request.getParameter("snum"));
		dao.SupportDelete(snum);
		
		ActionForward af = new ActionForward("support/supportboard.jsp", false);
		return af;
	}
}

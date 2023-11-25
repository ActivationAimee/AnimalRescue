package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Support;
import vo.SupportDAO;

public class SupportModifyAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SupportDAO dao = new SupportDAO();
		Support sp = new Support();
		int snum = Integer.parseInt(request.getParameter("snum"));
		
		sp = dao.SupportSelect(snum);
		
		request.setAttribute("sp", sp);
		ActionForward af = new ActionForward("support/supportModify.jsp", false);
		return af;
	}
	
}

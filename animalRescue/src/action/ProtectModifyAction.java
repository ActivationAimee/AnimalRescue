package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Protect;
import vo.ProtectDAO;

public class ProtectModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String str = request.getParameter("num");
		int num = 0;
		
		try {
			num = Integer.parseInt(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Protect pt = new Protect();
		ProtectDAO dao = new ProtectDAO();
		pt = dao.selectProtectNum(num);
		
		request.setAttribute("ptList", pt);
		
		ActionForward af = new ActionForward("Protect/protectModify.jsp", false);
		
		return af;
	}

}

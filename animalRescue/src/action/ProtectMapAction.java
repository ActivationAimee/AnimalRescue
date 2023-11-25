package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Protect;
import vo.ProtectDAO;

public class ProtectMapAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProtectDAO dao = new ProtectDAO();
		ArrayList<Protect> list = new ArrayList<Protect>();
		
		list = dao.selectAllProtect();
		
		request.setAttribute("list", list);
		
		ActionForward af = new ActionForward("Protect/protectMap.jsp", false);
		return af;
	}

}

package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Protect;
import vo.ProtectDAO;

public class ProtectListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int pagecount = 5;
		int content = 0;
		int[] page = null;
		int blockstartnum = 0;
		int blocklastnum = 0;
		
		ProtectDAO dao = new ProtectDAO();
		content = dao.serchContent();
		
		if(content%pagecount == 0) {
			page = new int[content/pagecount];
		}else {
			page = new int[(content/pagecount)+1];
		}
		
		int curpage = Integer.parseInt(request.getParameter("page"));
		
		blockstartnum = (pagecount * (curpage-1)) + 1;
		blocklastnum = blockstartnum + (pagecount-1);
		
		ArrayList<Protect> ptList = dao.selectProtect(blockstartnum, blocklastnum);
		
		request.setAttribute("ptList", ptList);
		request.setAttribute("page", page);
		
		ActionForward af = new ActionForward("Protect/protectBoard.jsp", false);
		
		return af;
	}

}

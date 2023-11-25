package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Protect;
import vo.ProtectDAO;

public class ProtectDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String str = request.getParameter("num");
		
		int num = 0;
		
		try {
			num = Integer.parseInt(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ProtectDAO dao = new ProtectDAO();
		dao.deleteProtect(num);
		
		int pagecount = 5;
		int content = 0;
		int[] page = null;
		int blockstartnum = 0;
		int blocklastnum = 0;
		
		content = dao.serchContent();
		
		if(content%pagecount == 0) {
			page = new int[content/pagecount];
		}else {
			page = new int[(content/pagecount)+1];
		}
		
		int curpage = 1;
		
		blockstartnum = (pagecount * (curpage-1)) + 1;
		blocklastnum = blockstartnum + (pagecount-1);
		
		ArrayList<Protect> ptList = dao.selectProtect(blockstartnum, blocklastnum);
		
		request.setAttribute("ptList", ptList);
		request.setAttribute("page", page);
		
		ActionForward af = new ActionForward("Protect/protectBoard.jsp", false);
		return af;
	}

}

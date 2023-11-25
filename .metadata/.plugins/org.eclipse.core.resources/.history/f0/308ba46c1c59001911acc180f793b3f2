package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Hospital;
import vo.Protect;
import vo.ProtectDAO;

public class ProtectSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String select = request.getParameter("col");
		String text = request.getParameter("search");
		ProtectDAO dao = new ProtectDAO();
		ArrayList<Protect> ptList = new ArrayList<Protect>();
		
		int pagecount = 5;
		int content = 0;
		int[] page = null;
		int blockstartnum = 0;
		int blocklastnum = 0;
		
		if(select.equals("area")) {
			if(text.equals("")) {
				content = dao.serchContent();
				
				if(content%pagecount == 0) {
					page = new int[content/pagecount];
				}else {
					page = new int[(content/pagecount)+1];
				}
				
				int curpage = 1;
				
				blockstartnum = (pagecount * (curpage-1)) + 1;
				blocklastnum = blockstartnum + (pagecount-1);
				
				ptList = dao.selectProtect(blockstartnum, blocklastnum);
			}else{
				ptList = dao.selectProtectArea(text);
			}
		}else if(select.equals("name")){
			if(text.equals("")) {
				content = dao.serchContent();
				
				if(content%pagecount == 0) {
					page = new int[content/pagecount];
				}else {
					page = new int[(content/pagecount)+1];
				}
				
				int curpage = 1;
				
				blockstartnum = (pagecount * (curpage-1)) + 1;
				blocklastnum = blockstartnum + (pagecount-1);
				
				ptList = dao.selectProtect(blockstartnum, blocklastnum);
			}else {
				ptList = dao.selectProtectName(text);
			}
		}
		
		request.setAttribute("ptList", ptList);
		request.setAttribute("page", page);
		ActionForward af = new ActionForward("Protect/protectBoard.jsp", false);
	
		return af;
	}

}

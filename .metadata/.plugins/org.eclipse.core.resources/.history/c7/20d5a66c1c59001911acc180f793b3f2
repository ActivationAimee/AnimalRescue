package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Protect;
import vo.ProtectDAO;

public class ProtectWriteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name"); 
		String area = request.getParameter("area");
		String adress = request.getParameter("adress");
		String open = request.getParameter("open");
		String tel = request.getParameter("tel");
		String content = request.getParameter("content");
		String maplat = request.getParameter("maplat");
		String maplng = request.getParameter("maplng");
		
		double maplat1 = Double.parseDouble(maplat);
		double maplng1 = Double.parseDouble(maplng);
		
		ProtectDAO dao = new ProtectDAO();
		
		int protectnum = dao.searchProtectnum();
	
		protectnum = protectnum+1;
		
		dao.insertProtect(protectnum, area, name, tel, adress, open, maplat1, maplng1, content);
		
		int pagecount = 5;
		int content1 = 0;
		int[] page = null;
		int blockstartnum = 0;
		int blocklastnum = 0;
		
		content1 = dao.serchContent();
		
		if(content1%pagecount == 0) {
			page = new int[content1/pagecount];
		}else {
			page = new int[(content1/pagecount)+1];
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
